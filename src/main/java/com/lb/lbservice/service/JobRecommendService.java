package com.lb.lbservice.service;

import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.utils.BaseResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JobRecommendService {
    BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel);
    Boolean  updateJobRecommendStatus(HashMap<String,String> map);
}
