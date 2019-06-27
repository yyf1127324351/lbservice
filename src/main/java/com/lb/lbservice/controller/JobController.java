package com.lb.lbservice.controller;

import com.lb.lbservice.model.JobModel;
import com.lb.lbservice.service.JobService;
import com.lb.lbservice.utils.BaseResponse;
import com.lb.lbservice.utils.Pager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 岗位controller
 * */
@RestController
@RequestMapping("api/v1/job")
public class JobController {
    private static final Logger logger = Logger.getLogger(JobController.class);

    @Autowired
    private JobService jobService;

    /**
     *  列表查询
     * */
    @GetMapping("getJobList")
    public BaseResponse getJobList() {
        try {
            List<JobModel> jobList = jobService.getJobList();
            return new BaseResponse().success(jobList);
        }catch (Exception e){
            logger.error("api/v1/job/getJob-exception:",e);
            return new BaseResponse().error();
        }
    }

    /**
     *  岗位详情
     * */
    @PostMapping("getJobDetail")
    public BaseResponse getJobDetail(@RequestBody JobModel jobModel) {
        try {
            JobModel job = jobService.getJob(jobModel);
            return new BaseResponse().success(job);
        }catch (Exception e){
            logger.error("api/v1/job/getJobDetail-exception:",e);
            return new BaseResponse().error();
        }
    }

    /**
    *  分页查询
    * */
    @GetMapping("getJobListPage")
    public BaseResponse getJobListPage(){
        Map<String, Object> param = new HashMap();
        param.put("pageSize", 3);
        param.put("start", 0);
        Pager<JobModel> pageInfo = new Pager(1,3);
        List<JobModel> jobListPage = jobService.getJobListPage(param);
        pageInfo.setList(jobListPage);
        Long count = jobService.selectCount(param);
        pageInfo.setTotalCount(count.intValue());
        logger.info("getJobListPage:"+jobListPage);
        return new BaseResponse().success(pageInfo);
    }



}
