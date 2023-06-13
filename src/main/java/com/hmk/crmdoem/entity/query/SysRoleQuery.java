package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class SysRoleQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer roleId;

	/**
	 * 
	 */
	private String roleName;

	private String roleNameFuzzy;

	/**
	 * 
	 */
	private String roleDesc;

	private String roleDescFuzzy;

	/**
	 * 
	 */
	private Integer roleFlag;


	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	public Integer getRoleId(){
		return this.roleId;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return this.roleName;
	}

	public void setRoleNameFuzzy(String roleNameFuzzy){
		this.roleNameFuzzy = roleNameFuzzy;
	}

	public String getRoleNameFuzzy(){
		return this.roleNameFuzzy;
	}

	public void setRoleDesc(String roleDesc){
		this.roleDesc = roleDesc;
	}

	public String getRoleDesc(){
		return this.roleDesc;
	}

	public void setRoleDescFuzzy(String roleDescFuzzy){
		this.roleDescFuzzy = roleDescFuzzy;
	}

	public String getRoleDescFuzzy(){
		return this.roleDescFuzzy;
	}

	public void setRoleFlag(Integer roleFlag){
		this.roleFlag = roleFlag;
	}

	public Integer getRoleFlag(){
		return this.roleFlag;
	}

}
