package com.jmeda.action;

import com.jmeda.dao.RegistrationDAO;
import com.jmeda.data.Customer;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;


public class RegisterAction implements ModelDriven<Customer>, Preparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 19796989L;
	
	private RegistrationDAO regDAO;
	
	public String execute()	{
		
		//regDAO.createTable();
		System.out.println("Customer Action: " + customer.toString());
		regDAO.insert(customer);
		regDAO.findAll();
		return "success";
	}

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public void prepare() throws Exception {

		customer = new Customer();
	}
	private Customer customer;

	public RegistrationDAO getRegDAO() {
		return regDAO;
	}

	public void setRegDAO(RegistrationDAO regDAO) {
		this.regDAO = regDAO;
	}

}
