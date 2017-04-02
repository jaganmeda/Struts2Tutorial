package com.jmeda.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.jmeda.dao.RegistrationDAO;
import com.jmeda.data.Customer;

public class RegistrationDAOImpl extends SimpleJdbcDaoSupport implements RegistrationDAO{

	@Override
	public void insert(Customer customer) {
		
		String sql = "INSERT INTO registeruser(userName, password, gender) values(?, ?, ?)";
		
		System.out.println("Insert SQL Query" + sql);
		
		getJdbcTemplate().update(sql, 
				new Object[]	{
							customer.getUserName(), 
							customer.getPassword(),
							customer.getGender()});
	}

	@Override
	public void createTable() {
		String sqlQuery = "CREATE TABLE registeruser (userName VARCHAR(20), password varchar(20), gender VARCHAR(20))";
		System.out.println("Create SQL Query" + sqlQuery);
		getJdbcTemplate().update(sqlQuery);
		
	}
	
	public List<Customer> findAll(){
		 
		String sql = "SELECT * FROM registeruser";
	 
		List<Customer> customerList = new ArrayList<Customer>();
		
		customerList = getJdbcTemplate().query(sql,
				new ParameterizedRowMapper<Customer>() {
					public Customer mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Customer customer = new Customer();
						customer.setUserName(rs.getString("userName"));
						customer.setGender(rs.getString("gender"));
						return customer;
					}
				});
	 
		for(Customer cust : customerList)	{
			System.out.println("User Details - DAO: " + cust.toString());
		}
	 
		return customerList;
	} 
}
