package com.lb.lbservice.service;

import com.lb.lbservice.model.JobModel;

import java.util.List;
import java.util.Map;

public interface JobService {
    List<JobModel> getJobList();

    List<JobModel> getJobListPage(Map<String, Object> param);

    Long selectCount(Map<String, Object> param);

    JobModel getJob(JobModel jobModel);
}
