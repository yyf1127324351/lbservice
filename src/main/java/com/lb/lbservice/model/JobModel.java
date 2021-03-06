package com.lb.lbservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

public class JobModel {
    private Integer id;//岗位id
    private String jobName;//岗位名称
    private Integer departmentId;//部门id
    private String departmentName; //部门名称
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jobDuty; //工作职责
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jobRequirement; // 任职资格（岗位要求）
    private BigDecimal jobSalaryMin;//薪资下限
    private BigDecimal jobSalaryMax;//薪资上限
    private String jobCity;//工作城市
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jobNeedCount;//岗位需求人数
    private String publishDate;//岗位发布时间
    private Integer positionId;//岗位ID  对应zhaopin_positionMsg 表id
    private String workYear;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobDuty() {
        return jobDuty;
    }

    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement;
    }

    public BigDecimal getJobSalaryMin() {
        return jobSalaryMin;
    }

    public void setJobSalaryMin(BigDecimal jobSalaryMin) {
        this.jobSalaryMin = jobSalaryMin;
    }

    public BigDecimal getJobSalaryMax() {
        return jobSalaryMax;
    }

    public void setJobSalaryMax(BigDecimal jobSalaryMax) {
        this.jobSalaryMax = jobSalaryMax;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public String getJobNeedCount() {
        return jobNeedCount;
    }

    public void setJobNeedCount(String jobNeedCount) {
        this.jobNeedCount = jobNeedCount;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }
}
