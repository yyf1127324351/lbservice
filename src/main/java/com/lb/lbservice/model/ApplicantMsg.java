package com.lb.lbservice.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ApplicantMsg extends BaseModel{
	private String ids;//id集合
    /*应聘者管理表*/
    private String id;
    private Long applyId; /*推荐表ID*/
    private String name;/*姓名*/
    private String mobile;/*手机*/
    private String email;/*邮箱*/
    private String job;/*职位*/
    private String note;/*备注*/
    private String sex;/*性别*/
    private String age;/*年龄*/
    private String college;/*学校*/
    private String education;/*学历id*/
    private String educationName;/*学历名-简历导入时候可能匹配不到属性表*/
    private String beforeCompany;/*上一家公司*/
    private String beforeJob;/*上一家公司职位*/
    private String officeArea;/*工作地点id*/
    private String officeAreaName;/*工作地点中文*/
    private String workType;/*工作性质id*/
    private String workTypeName;/*工作性质中文*/
    private String sendOffer;/*是否已发送offer*/
    private String applicantStage;/*阶段id*/
    private String applicantStatus;/*状态id*/
    private String applicantStageName;/*阶段name*/
    private String applicantStatusName;/*状态name*/
    private String salaryRange;/*薪资范围id*/
    private String salaryRangeName;/*薪资范围中文*/
    private String workingYears;/*工作年限id*/
    private String workingYearsName;/*工作年限中文*/
    private String applicantChannel;/*申请渠道id*/
    private String addedTime;/*入库时间*/
    private String updateTime;//更新时间
    private String addedTimeStart1;/*入库开始时间*/
    private String addedTimeEnd1;/*入库结束时间*/
    private String updateTimeStart1;
    private String updateTimeEnd1;
    private String creater;/*创建人*/
	private String createrId;/*创建人ID*/
    private String resumeId;/*简历id*/
    /*简历表*/
    private String resumeText;/*简历文本*/
    
    private String profession;//专业
    private String graduates;//是否应届
    private String student;//学生会成员
    private String league;//参加社团
    private String intern;//实习经历
    private String scholarship;//奖学金
    private String fileurl;//简历url;
    private String filename;//简历原始名称
    
    private String business;//行业
    private String beforeBusiness;//上家公司行业
	private String jobStatus;//职业状态
    private String birthDate;//出生年月
    private String marrayStatus;//婚姻状况
    private String politicalStatus;//政治面貌
    private String  account;//户口
    private String reportTime;//到岗时间
    private String functions;//职能
    private String  address;//现居住地
    private String score;//测试题分数
    private String wordScore;//用于word导出
    private String temperamentType;//性格分析结果
    private String temperamentMemo;//性格分析说明
    
    
    private String currentWage;//目前薪资
    private String hopeWage;//期望薪资
    private String recommendUserId;//推荐人id
    private String recommendUser;//推荐人
   // private List<String> fileIds;//附件id集合
    
    
    private String otherSkill;//其他
    private String workSkill;//工作经历
    private String projectSkill;//项目经历
    private String educationSkill;//教育经历
    
	private CommonsMultipartFile resumeFile;
	
	private String systemFrom;//数据来源
	private String uuid; //页面秘钥
	
	//面试登记表添加字段
	private Integer percentage;// 信息完成度百分比
	private String percentageType;	
	private String nativePlace;//籍贯
	private String nation;//民族 
	private String pidType;// 证件类型
	private String pid;// 证件号码
	private String accountProvince; // 户籍省市
	private String accountNature;// 户籍性质
	private String isEntranceExamination;//是否统招（0是 1 否）
    private String degree;//学位
	private String qq;// qq
    private String fistForeignLanguage;//第一外语
    private String foreignLanguageLevel;//外语级别
    private String recommender;//推荐人--面试登记表填写
    private String isDispute;//是否有过劳动纠纷或其他诉讼
    private String isLegalPerson;//是否在其他公司担任法人或股东
    private String isSideline;//是否经营其他副业（代购或网站等）
    private String achievement;//所受过的奖励
    private String hobby;//兴趣和爱好
    private String evalution;//个人特长及自我评价	
    
    private String xuanArea;//宣讲会地点
    private String xuanAreaName;//宣讲会地点
    private String applicantType;//应聘者类型（0：校招   1：社招）
    private String isRelative;//是否有亲属在公司
    private String relativeName;//亲属姓名(1：有 0：无)
    
    private String signature;//签名
    private String signatureTime;//签名时间
    
    private String birth;// 出生年月
    
    private String year;//年度

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignatureTime() {
		return signatureTime;
	}

	public void setSignatureTime(String signatureTime) {
		this.signatureTime = signatureTime;
	}

	public String getIsRelative() {
		return isRelative;
	}

	public void setIsRelative(String isRelative) {
		this.isRelative = isRelative;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getXuanArea() {
		return xuanArea;
	}

	public void setXuanArea(String xuanArea) {
		this.xuanArea = xuanArea;
	}

	public String getXuanAreaName() {
		return xuanAreaName;
	}

	public void setXuanAreaName(String xuanAreaName) {
		this.xuanAreaName = xuanAreaName;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public String getPercentageType() {
		return percentageType;
	}

	public void setPercentageType(String percentageType) {
		this.percentageType = percentageType;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPidType() {
		return pidType;
	}

	public void setPidType(String pidType) {
		this.pidType = pidType;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getAccountProvince() {
		return accountProvince;
	}

	public void setAccountProvince(String accountProvince) {
		this.accountProvince = accountProvince;
	}

	public String getAccountNature() {
		return accountNature;
	}

	public void setAccountNature(String accountNature) {
		this.accountNature = accountNature;
	}

	public String getIsEntranceExamination() {
		return isEntranceExamination;
	}

	public void setIsEntranceExamination(String isEntranceExamination) {
		this.isEntranceExamination = isEntranceExamination;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getFistForeignLanguage() {
		return fistForeignLanguage;
	}

	public void setFistForeignLanguage(String fistForeignLanguage) {
		this.fistForeignLanguage = fistForeignLanguage;
	}

	public String getForeignLanguageLevel() {
		return foreignLanguageLevel;
	}

	public void setForeignLanguageLevel(String foreignLanguageLevel) {
		this.foreignLanguageLevel = foreignLanguageLevel;
	}

	public String getRecommender() {
		return recommender;
	}

	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}

	public String getIsDispute() {
		return isDispute;
	}

	public void setIsDispute(String isDispute) {
		this.isDispute = isDispute;
	}

	public String getIsLegalPerson() {
		return isLegalPerson;
	}

	public void setIsLegalPerson(String isLegalPerson) {
		this.isLegalPerson = isLegalPerson;
	}

	public String getIsSideline() {
		return isSideline;
	}

	public void setIsSideline(String isSideline) {
		this.isSideline = isSideline;
	}

	public String getAchievement() {
		return achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getEvalution() {
		return evalution;
	}

	public void setEvalution(String evalution) {
		this.evalution = evalution;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSystemFrom() {
		return systemFrom;
	}

	public void setSystemFrom(String systemFrom) {
		this.systemFrom = systemFrom;
	}

	public String getAddedTimeStart1() {
		return addedTimeStart1;
	}

	public void setAddedTimeStart1(String addedTimeStart1) {
		this.addedTimeStart1 = addedTimeStart1;
	}

	public String getAddedTimeEnd1() {
		return addedTimeEnd1;
	}

	public void setAddedTimeEnd1(String addedTimeEnd1) {
		this.addedTimeEnd1 = addedTimeEnd1;
	}

	public String getUpdateTimeStart1() {
		return updateTimeStart1;
	}

	public void setUpdateTimeStart1(String updateTimeStart1) {
		this.updateTimeStart1 = updateTimeStart1;
	}

	public String getUpdateTimeEnd1() {
		return updateTimeEnd1;
	}

	public void setUpdateTimeEnd1(String updateTimeEnd1) {
		this.updateTimeEnd1 = updateTimeEnd1;
	}

	public String getRecommendUser() {
		return recommendUser;
	}

	public void setRecommendUser(String recommendUser) {
		this.recommendUser = recommendUser;
	}

	public String getTemperamentType() {
		return temperamentType;
	}

	public void setTemperamentType(String temperamentType) {
		this.temperamentType = temperamentType;
	}

	public String getTemperamentMemo() {
		return temperamentMemo;
	}

	public void setTemperamentMemo(String temperamentMemo) {
		this.temperamentMemo = temperamentMemo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBeforeCompany() {
        return beforeCompany;
    }

    public void setBeforeCompany(String beforeCompany) {
        this.beforeCompany = beforeCompany;
    }

    public String getBeforeJob() {
        return beforeJob;
    }

    public void setBeforeJob(String beforeJob) {
        this.beforeJob = beforeJob;
    }

    public String getOfficeArea() {
        return officeArea;
    }

    public void setOfficeArea(String officeArea) {
        this.officeArea = officeArea;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getSendOffer() {
        return sendOffer;
    }

    public void setSendOffer(String sendOffer) {
        this.sendOffer = sendOffer;
    }

    public String getApplicantStage() {
        return applicantStage;
    }

    public void setApplicantStage(String applicantStage) {
        this.applicantStage = applicantStage;
    }

    public String getApplicantStatus() {
        return applicantStatus;
    }

    public void setApplicantStatus(String applicantStatus) {
        this.applicantStatus = applicantStatus;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(String workingYears) {
        this.workingYears = workingYears;
    }

    public String getApplicantChannel() {
        return applicantChannel;
    }

    public void setApplicantChannel(String applicantChannel) {
        this.applicantChannel = applicantChannel;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getOfficeAreaName() {
        return officeAreaName;
    }

    public void setOfficeAreaName(String officeAreaName) {
        this.officeAreaName = officeAreaName;
    }

    public String getWorkTypeName() {
        return workTypeName;
    }

    public void setWorkTypeName(String workTypeName) {
        this.workTypeName = workTypeName;
    }

    public String getSalaryRangeName() {
        return salaryRangeName;
    }

    public void setSalaryRangeName(String salaryRangeName) {
        this.salaryRangeName = salaryRangeName;
    }

    public String getWorkingYearsName() {
        return workingYearsName;
    }

    public void setWorkingYearsName(String workingYearsName) {
        this.workingYearsName = workingYearsName;
    }

    public String getResumeText() {
        return resumeText;
    }

    public void setResumeText(String resumeText) {
        this.resumeText = resumeText;
    }

	public String getGraduates() {
		return graduates;
	}

	public void setGraduates(String graduates) {
		this.graduates = graduates;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getIntern() {
		return intern;
	}

	public void setIntern(String intern) {
		this.intern = intern;
	}

	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getApplicantStageName() {
		return applicantStageName;
	}

	public void setApplicantStageName(String applicantStageName) {
		this.applicantStageName = applicantStageName;
	}

	public String getApplicantStatusName() {
		return applicantStatusName;
	}

	public void setApplicantStatusName(String applicantStatusName) {
		this.applicantStatusName = applicantStatusName;
	}

	public String getMarrayStatus() {
		return marrayStatus;
	}

	public void setMarrayStatus(String marrayStatus) {
		this.marrayStatus = marrayStatus;
	}

	public String getPoliticalStatus() {
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getReportTime() {
		return reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public String getFunctions() {
		return functions;
	}

	public void setFunctions(String functions) {
		this.functions = functions;
	}
    public String getBeforeBusiness() {
		return beforeBusiness;
	}

	public void setBeforeBusiness(String beforeBusiness) {
		this.beforeBusiness = beforeBusiness;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getWordScore() {
		return wordScore;
	}

	public void setWordScore(String wordScore) {
		this.wordScore = wordScore;
	}

	public String getCurrentWage() {
		return currentWage;
	}

	public void setCurrentWage(String currentWage) {
		this.currentWage = currentWage;
	}

	public String getHopeWage() {
		return hopeWage;
	}

	public void setHopeWage(String hopeWage) {
		this.hopeWage = hopeWage;
	}

	public String getRecommendUserId() {
		return recommendUserId;
	}

	public void setRecommendUserId(String recommendUserId) {
		this.recommendUserId = recommendUserId;
	}

	public String getOtherSkill() {
		return otherSkill;
	}

	public void setOtherSkill(String otherSkill) {
		this.otherSkill = otherSkill;
	}

	public String getWorkSkill() {
		return workSkill;
	}

	public void setWorkSkill(String workSkill) {
		this.workSkill = workSkill;
	}

	public String getProjectSkill() {
		return projectSkill;
	}

	public void setProjectSkill(String projectSkill) {
		this.projectSkill = projectSkill;
	}

	public String getEducationSkill() {
		return educationSkill;
	}

	public void setEducationSkill(String educationSkill) {
		this.educationSkill = educationSkill;
	}

	public CommonsMultipartFile getResumeFile() {
		return resumeFile;
	}

	public void setResumeFile(CommonsMultipartFile resumeFile) {
		this.resumeFile = resumeFile;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Long getApplyId() {
		return applyId;
	}

	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}
}
