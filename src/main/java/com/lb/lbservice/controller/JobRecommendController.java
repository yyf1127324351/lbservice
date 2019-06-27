package com.lb.lbservice.controller;

import com.lb.lbservice.model.ApplicantMsg;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.service.JobRecommendService;
import com.lb.lbservice.utils.BaseResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 岗位推荐记录controller
 * */

@RestController
@RequestMapping("api/v1/jobRecommend")
public class JobRecommendController {
    private static final Logger logger = Logger.getLogger(JobRecommendController.class);

    @Autowired
    private JobRecommendService jobRecommendService;


    /**
     *  新增岗位推荐记录
     * */
    @PostMapping("addJobRecommend")
    public BaseResponse addJobRecommend(@RequestBody JobRecommendModel jobRecommendModel) {
        try {
            return jobRecommendService.insertJobRecommend(jobRecommendModel);
        }catch (Exception e){
            logger.error("api/v1/jobRecommend/addJobRecommend-exception:",e);
            return new BaseResponse().error();
        }
    }

    /**
     *  获取推荐岗位，及推荐详情
     * */
//    @PostMapping("getRecommendDetail")
//    public BaseResponse getRecommendDetail(){
//        try {
//            return jobRecommendService.getRecommendDetail(jobRecommendModel);
//        }catch (Exception e){
//            logger.error("api/v1/jobRecommend/addJobRecommend-exception:",e);
//            return new BaseResponse().error();
//        }
//    }



    @RequestMapping("getHrData")
    public List<ApplicantMsg> getHrData()
    {
       return  null;
    }

}
