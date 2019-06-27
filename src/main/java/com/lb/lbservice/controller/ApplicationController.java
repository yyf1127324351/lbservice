package com.lb.lbservice.controller;

import com.lb.lbservice.model.ApplicantMsg;
import com.lb.lbservice.service.ApplicationMsgService;
import com.lb.lbservice.utils.BaseResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

    @Value("${jianlijiexi_username}")
    private String user_name;

    @Value("${jianlijiexi_pwd}")
    private String password;

    @Autowired
    ApplicationMsgService applicationMsgService;

    @RequestMapping("/upload")
    public BaseResponse upload(@RequestParam("file") CommonsMultipartFile file,String id) {
        BaseResponse ajaxResult = new BaseResponse();
        try {
            Long  applyId;
            if(null==file)
            {
                ajaxResult.error("必须有文件上传");
                return ajaxResult;
            }
            if(null==id||id.equals("")) {
                ajaxResult.error("必须有申请单编号");
                return ajaxResult;
            }
            else {
                try{
                applyId=Long.parseLong(id);}
                catch (Exception ex){
                    ajaxResult.error("申请单号格式不正确！");
                    return  ajaxResult;
                }
                if (file.getSize() > 2097152) {
                    ajaxResult.error("导入失败！简历大小不得超过10M!");
                    return  ajaxResult;
                } else {
                    ApplicantMsg model=new ApplicantMsg();
                    model.setResumeFile(file);
                    ajaxResult=applicationMsgService.CreateApplicationMsg(model,applyId);
                }
            }
        } catch (Exception e) {
            BaseResponse.error("上传失败");
        }
        return ajaxResult;
    }
}
