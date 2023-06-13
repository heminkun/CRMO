package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class SysRoleRigthQuery extends BaseParam {


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

}
