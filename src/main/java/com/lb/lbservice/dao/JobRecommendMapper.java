package com.lb.lbservice.dao;

import com.lb.lbservice.model.JobRecommendModel;
import com.lb.lbservice.model.RecommendDetailModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface JobRecommendMapper {
    void insertJobRecommend(JobRecommendModel jobRecommendModel);
    Long queryPositionIdByJobId(Long id);
    void  updateJobRecommendStatus(HashMap<String,String> map);

    RecommendDetailModel getRecommendDetail(RecommendDetailModel recommendDetailModel);
}
