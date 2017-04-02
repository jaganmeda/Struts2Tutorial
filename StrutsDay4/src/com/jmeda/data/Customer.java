/**
 * 
 */
package com.jmeda.data;

/**
 * @author Family
 *
 */
public class Customer {
	
	

	private String userName;
	
	private String password;
	
	private String gender;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		System.out.println("Username: " + userName);
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", password=" + password
				+ ", gender=" + gender + "]";
	}
	
	
}
