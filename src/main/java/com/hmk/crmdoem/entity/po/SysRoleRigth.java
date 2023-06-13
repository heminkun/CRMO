package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SysRoleRigth implements Serializable {


	/**
	 * 
	 */
	private Integer rfRoleId;

	/**
	 * 
	 */
	private Integer rfRightId;


	public void setRfRoleId(Integer rfRoleId){
		this.rfRoleId = rfRoleId;
	}

	public Integer getRfRoleId(){
		return this.rfRoleId;
	}

	public void setRfRightId(Integer rfRightId){
		this.rfRightId = rfRightId;
	}

	public Integer getRfRightId(){
		return this.rfRightId;
	}

	@Override
	public String toString (){
		return "rfRoleId:"+(rfRoleId == null ? "空" : rfRoleId)+"，rfRightId:"+(rfRightId == null ? "空" : rfRightId);
	}
}
