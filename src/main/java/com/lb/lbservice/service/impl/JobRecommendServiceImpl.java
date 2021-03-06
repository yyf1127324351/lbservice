package com.lb.lbservice.service.impl;

import com.lb.lbservice.dao.JobRecommendMapper;
import com.lb.lbservice.dto.JobRecommendAndInfo;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.model.RecommendDetailModel;
import com.lb.lbservice.service.JobRecommendService;
import com.lb.lbservice.service.MailService;
import com.lb.lbservice.utils.BaseResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class JobRecommendServiceImpl implements JobRecommendService {

    @Autowired
    private JobRecommendMapper jobRecommendMapper;
    @Autowired
    MailService mailService;

    private static final Logger logger = Logger.getLogger(ApplicationMsgServiceImpl.class);
    @Override
    public BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel)throws Exception {
        jobRecommendModel.setCreateTime(new Date());
        jobRecommendModel.setStatus(0);
        jobRecommendModel.setValid(1);
        jobRecommendMapper.insertJobRecommend(jobRecommendModel);

        String content = sendResultHtml(jobRecommendModel);
        //发送邮件
//        mailService.sendHtmlMail(jobRecommendModel.getRecommendedMail(),"【乐贝招聘】邀请您完善简历",content);
        mailService.sendHtmlMail(jobRecommendModel.getRecommendedMail(),"【乐贝招聘】邀请您完善简历",content,jobRecommendModel.getRefereeMail());
        return new BaseResponse().success();

    }

    @Override
    public RecommendDetailModel getRecommendDetail(RecommendDetailModel recommendDetailModel) {
        return jobRecommendMapper.getRecommendDetail(recommendDetailModel);
    }

    @Override
    public void updateJobRecommend(List<JobRecommendModel> list) {
        jobRecommendMapper.updateJobRecommend(list);
    }

    @Override
    public Boolean updateJobRecommendStatus(HashMap<String,String> map)
    {
        try{
            jobRecommendMapper.updateJobRecommendStatus(map);
            return  true;
        }
        catch (Exception ex)
        {
            logger.error(ex.toString());
            return  false;
        }
    }

    public static String sendResultHtml(JobRecommendModel jobRecommendModel){
        StringBuilder p=new StringBuilder();
        p.append("<p>尊敬的&nbsp;"+ jobRecommendModel.getRecommendedName() +":</p>");
        p.append("<p>");
        p.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;感谢您推荐/应聘苏州乐贝网络科技的【"+jobRecommendModel.getJobName()+"】职位，请点击&nbsp;<a href='http://www.baidu.com'>完善简历</a>&nbsp;尽快上传简历。感谢您的参与！");
        p.append("</p>");
        p.append("<p>");
        p.append("此邮件由系统直接发出，请勿回复此邮件，谢谢！");
        p.append("</p>");
        p.append("<p>");
        p.append("乐贝网络科技有限公司");
        return p.toString();
    }

    public List<JobRecommendAndInfo> queryRecommendAndInfo(){
        try {
            return jobRecommendMapper.queryRecommendAndInfo();
        }
        catch (Exception ex)
        {
            logger.error(ex.toString());
            return  null;
        }
    }


}
