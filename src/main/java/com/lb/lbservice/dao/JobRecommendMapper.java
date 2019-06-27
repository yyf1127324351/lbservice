package com.lb.lbservice.dao;

import com.lb.lbservice.dto.JobRecommendAndInfo;
import com.lb.lbservice.model.JobRecommendModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface JobRecommendMapper {
    void insertJobRecommend(JobRecommendModel jobRecommendModel);
    Long queryPositionIdByJobId(Long id);
    void  updateJobRecommendStatus(HashMap<String,String> map);
    List<JobRecommendAndInfo> queryRecommendAndInfo();
}
