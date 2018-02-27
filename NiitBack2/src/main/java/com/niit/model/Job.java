package com.niit.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="job_id")
private int id;
private String jobTitle;
private String jobDescription;
private String skillsRequired;
private String location;
private String yearsofExperience;
private String salary;
private Date postedon;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getJobDescription() {
	return jobDescription;
}
public void setJobDescription(String jobDescription) {
	this.jobDescription = jobDescription;
}
public String getSkillsRequired() {
	return skillsRequired;
}
public void setSkillsRequired(String skillsRequired) {
	this.skillsRequired = skillsRequired;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getYearsofExperience() {
	return yearsofExperience;
}
public void setYearsofExperience(String yearsofExperience) {
	this.yearsofExperience = yearsofExperience;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public Date getPostedon() {
	return postedon;
}
public void setPostedon(Date postedon) {
	this.postedon = postedon;
}

	
	
	
}