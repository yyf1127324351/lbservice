package com.lb.lbservice.controller;

import com.lb.lbservice.utils.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

    public BaseResponse uploadSo(@RequestParam("file") CommonsMultipartFile file,String applyId) {
        BaseResponse ajaxResult = new BaseResponse();
        try {
            if (file.getSize() > 2097152) {
                BaseResponse.error("导入失败！简历大小不得超过10M!");
            } else {

            }
        } catch (Exception e) {
            BaseResponse.error("上传失败");
        }
        return ajaxResult;
    }
}
