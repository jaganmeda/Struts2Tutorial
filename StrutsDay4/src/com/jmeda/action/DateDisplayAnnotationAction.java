package com.jmeda.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validation;
import com.opensymphony.xwork2.validator.annotations.Validations;

@Results({
	   @Result(name="success", location="/dateDisplay.jsp"),
	   @Result(name="input", location="/indexAnnotation.jsp")
	})

public class DateDisplayAnnotationAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12633234L;

	private Date currDate;
	
	private String dateString;
	
	private String name;
	
/*	@Action(value="dateDisplay",
			results={
				@Result(name="success", location="/dateDisplay.jsp")				
			})*/
	@Action(value="/dateDisplay")
	public String execute()	throws Exception	{
		Calendar calendar = Calendar.getInstance();		
		currDate = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		dateString = sdf.format(currDate);
		System.out.println("Annoataion Example:- Current Date: " + currDate + ", After Formatting: " + dateString);
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

	@RequiredFieldValidator( message = "Name required", key = "error.msg.name.req", shortCircuit=true)
	@StringLengthFieldValidator(message = "Name Length Required", key = "error.msg.name.len.req", 
								shortCircuit=true, trim = true, minLength = "5",  maxLength = "12")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
