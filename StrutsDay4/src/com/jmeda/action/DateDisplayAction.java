package com.jmeda.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;


public class DateDisplayAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12632234L;

	private Date currDate;
	
	private String dateString;
	
	private String name;
	
	public String execute()	throws Exception	{
		Calendar calendar = Calendar.getInstance();		
		currDate = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		dateString = sdf.format(currDate);
		System.out.println("Current Date: " + currDate + ", After Formatting: " + dateString);
		return SUCCESS;
	}

	public Date getCurrDate() {
		return currDate;
	}

	public void setCurrDate(Date currDate) {
		this.currDate = currDate;
	}

	/**
	 * @return the dateString
	 */
	public String getDateString() {
		return dateString;
	}

	/**
	 * @param dateString the dateString to set
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//simple validation
	public void validate(){
		if(getName() == null || "".equals(getName().trim())){
			addFieldError("name", getText("error.msg.name.req"));
			//addActionError(getText("error.msg.name.req"));
		}
		else if(!"".equals(getName().trim())
				&& (name.length() < 5 || name.length() > 12) ){
			addFieldError("name", getText("error.msg.name.len.req"));
			//addActionError(getText("error.msg.name.req"));
		}
	}

}
