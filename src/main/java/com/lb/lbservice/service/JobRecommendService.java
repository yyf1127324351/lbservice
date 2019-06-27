package com.lb.lbservice.service;

import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.utils.BaseResponse;

public interface JobRecommendService {
    BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel)throws Exception;
}
