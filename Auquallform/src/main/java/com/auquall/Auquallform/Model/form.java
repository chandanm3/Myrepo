package com.auquall.Auquallform.Model;

public class form {
	public  String agentId;
	public  String username;
	public String  dateString;
	public String timeString;
	public String agencynameString;
	public String emailString;
	public String subjectString;
	
	
	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getSubjectString() {
		return subjectString;
	}

	public void setSubjectString(String subjectString) {
		this.subjectString = subjectString;
	}

	public form() {
		
	}
	public form(String agentId, String username, String dateString, String timeString, String agencynameString,
			String emailString, String subjectString) {
		super();
		this.agentId = agentId;
		this.username = username;
		this.dateString = dateString;
		this.timeString = timeString;
		this.agencynameString = agencynameString;
		this.emailString = emailString;
		this.subjectString = subjectString;
	}

	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	public String getTimeString() {
		return timeString;
	}
	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}
	public String getAgencynameString() {
		return agencynameString;
	}
	public void setAgencynameString(String agencynameString) {
		this.agencynameString = agencynameString;
	}
	
		
	

}
