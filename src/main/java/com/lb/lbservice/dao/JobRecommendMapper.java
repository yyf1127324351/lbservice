package com.lb.lbservice.dao;

import com.lb.lbservice.model.JobRecommendModel;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRecommendMapper {
    void insertJobRecommend(JobRecommendModel jobRecommendModel);
}
