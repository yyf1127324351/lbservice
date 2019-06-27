package com.lb.lbservice.dao;

import com.lb.lbservice.model.JobModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface JobMapper {
    List<JobModel> getJobList();

    List<JobModel> getJobListPage(Map<String, Object> param);

    Long selectCount(Map<String, Object> param);

    JobModel getJob(JobModel jobModel);
}
