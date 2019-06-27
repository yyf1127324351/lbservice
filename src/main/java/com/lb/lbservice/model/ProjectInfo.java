package com.lb.lbservice.model;

public class ProjectInfo {
    private String EndDate;

    private String ProjectDescription;

    private String ProjectName;

    private String Responsibilities;

    private String StartDate;

    private String Title;

    public void setEndDate(String EndDate){
        this.EndDate = EndDate;
    }
    public String getEndDate(){
        return this.EndDate;
    }
    public void setProjectDescription(String ProjectDescription){
        this.ProjectDescription = ProjectDescription;
    }
    public String getProjectDescription(){
        return this.ProjectDescription;
    }
    public void setProjectName(String ProjectName){
        this.ProjectName = ProjectName;
    }
    public String getProjectName(){
        return this.ProjectName;
    }
    public void setResponsibilities(String Responsibilities){
        this.Responsibilities = Responsibilities;
    }
    public String getResponsibilities(){
        return this.Responsibilities;
    }
    public void setStartDate(String StartDate){
        this.StartDate = StartDate;
    }
    public String getStartDate(){
        return this.StartDate;
    }
    public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTitle(){
        return this.Title;
    }

}