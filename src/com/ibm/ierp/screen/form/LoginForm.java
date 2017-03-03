package com.ibm.ierp.screen.form;


/**
 * 
 * @author sriramamurthy
 *
 */
public class LoginForm  {
	private static final long serialVersionUID = -473562596852452021L;
	
	private int userType;
    private String userId;
    private String password;
	/**
	 * @return
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}
    
    

}
