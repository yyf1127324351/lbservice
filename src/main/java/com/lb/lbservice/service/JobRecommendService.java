package com.lb.lbservice.service;

import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.model.RecommendDetailModel;
import com.lb.lbservice.utils.BaseResponse;

import java.util.HashMap;

public interface JobRecommendService {
    Boolean  updateJobRecommendStatus(HashMap<String,String> map);
    BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel)throws Exception;

    RecommendDetailModel getRecommendDetail(RecommendDetailModel recommendDetailModel);
}
