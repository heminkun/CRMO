package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SysRole implements Serializable {


	/**
	 * 
	 */
	private Integer roleId;

	/**
	 * 
	 */
	private String roleName;

	/**
	 * 
	 */
	private String roleDesc;

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

	public void setRoleDesc(String roleDesc){
		this.roleDesc = roleDesc;
	}

	public String getRoleDesc(){
		return this.roleDesc;
	}

	public void setRoleFlag(Integer roleFlag){
		this.roleFlag = roleFlag;
	}

	public Integer getRoleFlag(){
		return this.roleFlag;
	}

	@Override
	public String toString (){
		return "roleId:"+(roleId == null ? "空" : roleId)+"，roleName:"+(roleName == null ? "空" : roleName)+"，roleDesc:"+(roleDesc == null ? "空" : roleDesc)+"，roleFlag:"+(roleFlag == null ? "空" : roleFlag);
	}
}
