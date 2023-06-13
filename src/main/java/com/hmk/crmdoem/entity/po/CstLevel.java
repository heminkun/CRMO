package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class CstLevel implements Serializable {


	/**
	 * 
	 */
	private Integer custLevelId;

	/**
	 * 
	 */
	private String custLevelName;

	/**
	 * 
	 */
	private Integer custLevel;

	/**
	 * 
	 */
	private Integer custAmount;


	public void setCustLevelId(Integer custLevelId){
		this.custLevelId = custLevelId;
	}

	public Integer getCustLevelId(){
		return this.custLevelId;
	}

	public void setCustLevelName(String custLevelName){
		this.custLevelName = custLevelName;
	}

	public String getCustLevelName(){
		return this.custLevelName;
	}

	public void setCustLevel(Integer custLevel){
		this.custLevel = custLevel;
	}

	public Integer getCustLevel(){
		return this.custLevel;
	}

	public void setCustAmount(Integer custAmount){
		this.custAmount = custAmount;
	}

	public Integer getCustAmount(){
		return this.custAmount;
	}

	@Override
	public String toString (){
		return "custLevelId:"+(custLevelId == null ? "空" : custLevelId)+"，custLevelName:"+(custLevelName == null ? "空" : custLevelName)+"，custLevel:"+(custLevel == null ? "空" : custLevel)+"，custAmount:"+(custAmount == null ? "空" : custAmount);
	}
}
