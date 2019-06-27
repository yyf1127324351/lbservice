package com.lb.lbservice.service;

import com.lb.lbservice.dto.JobRecommendAndInfo;
import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.model.RecommendDetailModel;
import com.lb.lbservice.utils.BaseResponse;

import java.util.HashMap;
import java.util.List;

public interface JobRecommendService {
    Boolean  updateJobRecommendStatus(HashMap<String,String> map);
    BaseResponse insertJobRecommend(JobRecommendModel jobRecommendModel)throws Exception;

    List<JobRecommendAndInfo> queryRecommendAndInfo();

    RecommendDetailModel getRecommendDetail(RecommendDetailModel recommendDetailModel);

    void updateJobRecommend(List<JobRecommendModel> list);
}
