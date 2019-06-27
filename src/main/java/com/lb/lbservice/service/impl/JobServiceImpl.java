package com.lb.lbservice.service.impl;

import com.lb.lbservice.dao.JobMapper;
import com.lb.lbservice.model.JobModel;
import com.lb.lbservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<JobModel> getJobList() {
        return jobMapper.getJobList();
    }

    @Override
    public List<JobModel> getJobListPage(Map<String, Object> param) {
        return jobMapper.getJobListPage(param);
    }

    @Override
    public Long selectCount(Map<String, Object> param) {
        return jobMapper.selectCount(param);
    }
}
