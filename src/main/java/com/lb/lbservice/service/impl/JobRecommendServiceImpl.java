package com.lb.lbservice.service.impl;

import com.lb.lbservice.dao.JobRecommendMapper;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.service.JobRecommendService;
import com.lb.lbservice.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JobRecommendServiceImpl implements JobRecommendService {

    @Autowired
    private JobRecommendMapper jobRecommendMapper;

    @Override
    public BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel) {
        jobRecommendModel.setCreateTime(new Date());
        jobRecommendModel.setStatus(0);
        jobRecommendModel.setValid(1);
        jobRecommendMapper.insertJobRecommend(jobRecommendModel);
        return new BaseResponse().success();

    }
}
