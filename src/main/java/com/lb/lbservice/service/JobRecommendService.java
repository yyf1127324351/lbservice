package com.lb.lbservice.service;

import com.lb.lbservice.dto.JobRecommendAndInfo;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.utils.BaseResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JobRecommendService {
    Boolean  updateJobRecommendStatus(HashMap<String,String> map);
    BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel)throws Exception;

    List<JobRecommendAndInfo> queryRecommendAndInfo();
}
