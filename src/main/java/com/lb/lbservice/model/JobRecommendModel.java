package com.lb.lbservice.model;

import java.util.Date;

public class JobRecommendModel {
    private Long id;
    private Integer jobId;//岗位id
    private String jobName;//岗位名称
    private String refereeName;//推荐人姓名
    private String refereePhone; //推荐人手机
    private String refereeMail;//推荐人邮箱
    private String recommendedName;//被推荐人姓名
    private String recommendedPhone;//被推荐人手机
    private String  recommendedMail;//被推荐人邮箱
    private Integer status;
    private Integer valid;
    private Date createTime;
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    public String getRefereePhone() {
        return refereePhone;
    }

    public void setRefereePhone(String refereePhone) {
        this.refereePhone = refereePhone;
    }

    public String getRefereeMail() {
        return refereeMail;
    }

    public void setRefereeMail(String refereeMail) {
        this.refereeMail = refereeMail;
    }

    public String getRecommendedName() {
        return recommendedName;
    }

    public void setRecommendedName(String recommendedName) {
        this.recommendedName = recommendedName;
    }

    public String getRecommendedPhone() {
        return recommendedPhone;
    }

    public void setRecommendedPhone(String recommendedPhone) {
        this.recommendedPhone = recommendedPhone;
    }

    public String getRecommendedMail() {
        return recommendedMail;
    }

    public void setRecommendedMail(String recommendedMail) {
        this.recommendedMail = recommendedMail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
