package com.lb.lbservice.service.impl;

import com.lb.lbservice.dao.JobRecommendMapper;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.service.JobRecommendService;
import com.lb.lbservice.utils.BaseResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class JobRecommendServiceImpl implements JobRecommendService {

    @Autowired
    private JobRecommendMapper jobRecommendMapper;

    private static final Logger logger = Logger.getLogger(ApplicationMsgServiceImpl.class);
    @Override
    public BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel) {
        jobRecommendModel.setCreateTime(new Date());
        jobRecommendModel.setStatus(0);
        jobRecommendModel.setValid(1);
        jobRecommendMapper.insertJobRecommend(jobRecommendModel);
        return new BaseResponse().success();

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
}
