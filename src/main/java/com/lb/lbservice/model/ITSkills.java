package com.lb.lbservice.model;

public class ITSkills {
    private String CompetencyLevel;

    private String SkillType;

    private String TimeOfUse;

    public void setCompetencyLevel(String CompetencyLevel){
        this.CompetencyLevel = CompetencyLevel;
    }
    public String getCompetencyLevel(){
        return this.CompetencyLevel;
    }
    public void setSkillType(String SkillType){
        this.SkillType = SkillType;
    }
    public String getSkillType(){
        return this.SkillType;
    }
    public void setTimeOfUse(String TimeOfUse){
        this.TimeOfUse = TimeOfUse;
    }
    public String getTimeOfUse(){
        return this.TimeOfUse;
    }

}