package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SysUser implements Serializable {


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 
	 */
	private String userName;

	/**
	 * 
	 */
	private String userPassword;

	/**
	 * 
	 */
	private Integer userRoleId;

	/**
	 * 
	 */
	private Integer userFlag;

	/**
	 * 
	 */
	private String userIco;

	/**
	 * 
	 */
	private String userEmail;

	public SysUser(){

	}
	public SysUser(String userEmail,String userName,String userPassword){
		this.userEmail=userEmail;
		this.userName=userName;
		this.userPassword=userPassword;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}

	public String getUserPassword(){
		return this.userPassword;
	}

	public void setUserRoleId(Integer userRoleId){
		this.userRoleId = userRoleId;
	}

	public Integer getUserRoleId(){
		return this.userRoleId;
	}

	public void setUserFlag(Integer userFlag){
		this.userFlag = userFlag;
	}

	public Integer getUserFlag(){
		return this.userFlag;
	}

	public void setUserIco(String userIco){
		this.userIco = userIco;
	}

	public String getUserIco(){
		return this.userIco;
	}

	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}

	public String getUserEmail(){
		return this.userEmail;
	}

	@Override
	public String toString (){
		return "userId:"+(userId == null ? "空" : userId)+"，userName:"+(userName == null ? "空" : userName)+"，userPassword:"+(userPassword == null ? "空" : userPassword)+"，userRoleId:"+(userRoleId == null ? "空" : userRoleId)+"，userFlag:"+(userFlag == null ? "空" : userFlag)+"，userIco:"+(userIco == null ? "空" : userIco)+"，userEmail:"+(userEmail == null ? "空" : userEmail);
	}
}
