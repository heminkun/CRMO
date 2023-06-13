package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class SysUserQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 
	 */
	private String userName;

	private String userNameFuzzy;

	/**
	 * 
	 */
	private String userPassword;

	private String userPasswordFuzzy;

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

	private String userIcoFuzzy;

	/**
	 * 
	 */
	private String userEmail;

	private String userEmailFuzzy;


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

	public void setUserNameFuzzy(String userNameFuzzy){
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy(){
		return this.userNameFuzzy;
	}

	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}

	public String getUserPassword(){
		return this.userPassword;
	}

	public void setUserPasswordFuzzy(String userPasswordFuzzy){
		this.userPasswordFuzzy = userPasswordFuzzy;
	}

	public String getUserPasswordFuzzy(){
		return this.userPasswordFuzzy;
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

	public void setUserIcoFuzzy(String userIcoFuzzy){
		this.userIcoFuzzy = userIcoFuzzy;
	}

	public String getUserIcoFuzzy(){
		return this.userIcoFuzzy;
	}

	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}

	public String getUserEmail(){
		return this.userEmail;
	}

	public void setUserEmailFuzzy(String userEmailFuzzy){
		this.userEmailFuzzy = userEmailFuzzy;
	}

	public String getUserEmailFuzzy(){
		return this.userEmailFuzzy;
	}

}
