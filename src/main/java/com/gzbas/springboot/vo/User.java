package com.gzbas.springboot.vo;

/**
 * user用户实体类
 * @author Huamie
 *
 */

public class User {
	
	private Integer uid;
	private String userName;
	private String userPwd;
	private String crea_time;
	private String upda_time;
	private String crea_user;
	private String upda_user;
	private String isdele;
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getCrea_time() {
		return crea_time;
	}
	public void setCrea_time(String crea_time) {
		this.crea_time = crea_time;
	}
	public String getUpda_time() {
		return upda_time;
	}
	public void setUpda_time(String upda_time) {
		this.upda_time = upda_time;
	}
	public String getCrea_user() {
		return crea_user;
	}
	public void setCrea_user(String crea_user) {
		this.crea_user = crea_user;
	}
	public String getUpda_user() {
		return upda_user;
	}
	public void setUpda_user(String upda_user) {
		this.upda_user = upda_user;
	}
	public String getIsdele() {
		return isdele;
	}
	public void setIsdele(String isdele) {
		this.isdele = isdele;
	}
	
	
	
}
