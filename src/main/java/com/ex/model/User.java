package com.ex.model;

public class User implements Comparable<User> {

	private String userId;
	private String userName;
	private String userPassword;
	private String userEMail;
	
	
	public String getId() {
		return userId;
	}
	public void setId(String id) {
		this.userId = id;
	}
	public String getName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String password) {
		this.userPassword = password;
	}
	public String geteMail() {
		return userEMail;
	}
	public void seteMail(String eMail) {
		this.userEMail = eMail;
	}
}
