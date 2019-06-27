package com.lb.lbservice.service.impl;

import com.lb.lbservice.controller.JobController;
import com.lb.lbservice.dao.JobMapper;
import com.lb.lbservice.model.*;
import com.lb.lbservice.service.ApplicationMsgService;
import org.apache.log4j.Logger;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ApplicationMsgServiceImpl implements ApplicationMsgService {

    @Value("${jianlijiexi_username}")
    private String user_name;

    @Value("${jianlijiexi_pwd}")
    private String password;
    private static final Logger logger = Logger.getLogger(ApplicationMsgServiceImpl.class);
    @Override
    public void CreateApplicationMsg() {

    }

    /*
     * add by  liyang
     * add on  20190613
     * 根据上传文件调用外部接口处理并解析返回对象匹配到hr系统的简历对象格式
     * */
    private ApplicantMsg analysis(byte[] file,String fileName,String job,Long applyId)
    {
        try {
            final BASE64Decoder decoder = new BASE64Decoder();

            String username=new String(decoder.decodeBuffer(user_name), "UTF-8");
            String pwd=new String(decoder.decodeBuffer(password), "UTF-8");
            String content="";          // base64字符串
            String ext= fileName.substring(fileName.lastIndexOf("."));      // 文件扩展名，注意必须要加点号
            //File file = new File("C:\\Users\\admin\\Downloads\\简历解析\\java开发工程师-贾晶晶.doc");
            byte[] b=file;  // 将文件转换成字节数组；
            content=getBase64String(b);       // 将字节数组转换成base64字符串；

            // 初始化SOAP对象
            SoapObject request = new SoapObject("http://tempuri.org/", "TransResumeByJsonStringForFileBase64"); // 调用方法名
            // 调用的参数
            request.addProperty("username", username);
            request.addProperty("pwd", pwd);
            request.addProperty("content", content);
            request.addProperty("ext", ext);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.bodyOut = request;  //带参数的话，一定要加这句；
            envelope.dotNet = true;

            envelope.setOutputSoapObject(request);

            //调用SOAP
            final String URL= "http://service.ygys.net/ResumeService.asmx?WSDL"; // 测试接口地址
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
            try {
                androidHttpTransport.call("http://tempuri.org/TransResumeByJsonStringForFileBase64", envelope);
            }
            catch (Exception e) {
                logger.info("解析接口调用失败"+e.toString());
            }

            // 获得SOAP调用的结果
            SoapObject  result = (SoapObject )envelope.bodyIn;

            if(result != null){
                String resultStr=result.getProperty(0).toString();
                ResumeInfo info=com.alibaba.fastjson.JSON.parseObject(resultStr,ResumeInfo.class);
                ApplicantMsg applicantMng= creatApplicationMng(info,job,applyId);
                return applicantMng;
            }

        }
        catch (Exception e)
        {
            logger.info("解析接口调用失败"+e.toString());
        }
        return  null;
    }


    private ApplicantMsg creatApplicationMng(ResumeInfo item,String job, Long  applyId)
    {
        ApplicantMsg model=new ApplicantMsg();
        model.setJob(job);
        model.setSex(item.getSex());
        model.setApplyId(applyId);
        model.setApplicantType("1");
        model.setName(item.getName());
        model.setMobile(item.getMobile());
        model.setCollege(item.getSchool());
        model.setEmail(item.getEmail());
        model.setAge(item.getAge());
        model.setEducationName(item.getEducation());
        model.setBeforeCompany(item.getLastCompany());
        model.setBeforeJob(item.getLastTitle());
        model.setWorkTypeName(item.getWorkType());
        model.setSendOffer("0");
        model.setSalaryRange(item.getSalary());
        model.setSalaryRangeName(item.getSalary());

        //计算工作时间
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
            Calendar cal = Calendar.getInstance();
            cal.setTime(formatter.parse(item.getBeginworktime()));
            LocalDate today = LocalDate.now();
            System.out.println("Today：" + today);
            LocalDate oldDate = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 01);
            System.out.println("OldDate：" + oldDate);
            Period p = Period.between(oldDate, today);
            model.setWorkingYearsName(String.format("%d 年 %d 个月",p.getYears(),p.getMonths()));
        }
        catch (Exception ex){}
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        model.setAddedTime(dateFormat.format(new Date()));
        model.setCreater("999");
        model.setValid(1);
        model.setProfession(item.getSpeciality());
        model.setJobStatus(item.getSwitch());
        model.setBirthDate(item.getBirth());
        model.setMarrayStatus(item.getMarried());
        model.setPoliticalStatus(item.getPolitical());
        model.setAccount(item.getJiguan());
        model.setReportTime(item.getStartFrom());
        model.setBeforeBusiness(item.getVocation());
        model.setAddress(item.getAddress());
        model.setScore(item.getScore());
        model.setCurrentWage(item.getSalary());
        model.setHopeWage(item.getAimSalary());
        model.setSystemFrom("导入简历");
        model.setNation(item.getJiguan());
        model.setPidType("29");
        model.setPid(item.getIDNO());
        model.setAccountProvince(item.getJiguan());
        model.setIsEntranceExamination("统招".equals(item.getStudentType())?"1":"0");
        model.setDegree(item.getAdvancedDegree());
        model.setQq(item.getQQ());
        model.setFistForeignLanguage(item.getEnglish());
        model.setEvalution(item.getPersonal());
        try {
            Integer percentage = Integer.parseInt(item.getIntegrity());
            model.setPercentage(percentage);
        }
        catch (Exception ex){ }
        model.setAchievement(item.getEncouragement());

        //项目经历
        if(null!=item.getProjectInfo()) {
            StringBuilder projectBuilder=new StringBuilder();
            projectBuilder.append("<table cellpadding=\"2\" cellspacing=\"0\" border=\"0\" >");

            for (ProjectInfo info : item.getProjectInfo()) {
                projectBuilder.append(String.format("<tbody><tr><td><strong>%s --- %s</strong></td><td><strong>项目名称：</strong>%s</td></tr><tr><td colspan=\"2\"><strong>项目职责：</strong>%s </td></tr><tr><td colspan=\"2\"><strong>项目描述： </strong> %s</td></tr></tbody>",
                        info.getStartDate(), info.getEndDate(), info.getProjectName(), info.getResponsibilities(), info.getProjectDescription()));
            }

            projectBuilder.append("</table>");
            model.setProjectSkill(projectBuilder.toString());
        }

        //工作经历
        if(null !=item.getExperienceInfo()) {
            StringBuilder experienceBuilder=new StringBuilder();
            experienceBuilder.append("<table cellpadding=\"2\" cellspacing=\"0\" border=\"0\">");

            for (ExperienceInfo info : item.getExperienceInfo()) {
                experienceBuilder.append(String.format("<tbody><tr><td><strong>%s --- %s</strong> </td><td><strong>公司:</strong>%s</td><td><strong>地点:</strong>%s</td></tr><tr><td><strong>行业:</strong>%s",
                        info.getStartDate(), info.getEndDate(), info.getCompany(), info.getLocation(), info.getVocation()));
                experienceBuilder.append(String.format("</td><td><strong>规模:</strong>%s</td><td><strong>部门:</strong>%s</td></tr><tr><td><strong>职务：</strong>%s</td><td><strong>工作时间：</strong>%s</td><td><strong>汇报对象：</strong>%s</td></tr>",
                        info.getSize(), info.getDepartment(), info.getTitle(), info.getPeriodsOfTime(), info.getLeader()));
                experienceBuilder.append(String.format("<tr><td><strong>薪水：</strong>%s</td><td><strong>下属人数：</strong>%s</td><td></td></tr><tr><td colspan=\"3\"><strong>介绍： </strong>%s</td></tr></tbody>",
                        info.getSalary(), info.getUnderlingNumber(), info.getSummary()+info.getAchievement()));
            }

            experienceBuilder.append("</table>");
            model.setWorkSkill(experienceBuilder.toString());
        }

        //教育经历
        if(null!=item.getEducationInfo()) {
            StringBuilder educationBuilder=new StringBuilder();
            educationBuilder.append("<table cellpadding=\"2\" cellspacing=\"0\" border=\"0\">");
            educationBuilder.append("<tr><td><strong>时间</strong></td><td><strong>学校:</strong></td><td><strong>专业:</strong></td><td><strong>学历:</strong></td><td><strong>介绍:</strong></td></tr>");

            for (EducationInfo info : item.getEducationInfo()) {
                educationBuilder.append(String.format("<tr><td>%s--%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>",
                        info.getStartDate(), info.getEndDate(), info.getSchool(), info.getSpeciality(), info.getEducation(), info.getSummary() + info.getIsStudii()));
            }

            educationBuilder.append("</table>");
            model.setEducationSkill(educationBuilder.toString());
        }

        StringBuilder skillBuilder=new StringBuilder();
        if(null!=item.getITSkills()) {
            for (ITSkills info : item.getITSkills()) {
                skillBuilder.append(String.format("%s : %s ;", info.getSkillType(), info.getCompetencyLevel()));
            }
        }
        model.setOtherSkill(item.getSkill()+skillBuilder.toString());
        return  model;
    }




    public  String getBase64String(byte[] bty)
    {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(bty);//返回Base64编码过的字节数组字符串
    }

}
