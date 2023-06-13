package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class CstServiceType implements Serializable {


	/**
	 * 
	 */
	private Integer cstId;

	/**
	 * 
	 */
	private String cstServiceType;

	/**
	 * 
	 */
	private String cstAmount;


	public void setCstId(Integer cstId){
		this.cstId = cstId;
	}

	public Integer getCstId(){
		return this.cstId;
	}

	public void setCstServiceType(String cstServiceType){
		this.cstServiceType = cstServiceType;
	}

	public String getCstServiceType(){
		return this.cstServiceType;
	}

	public void setCstAmount(String cstAmount){
		this.cstAmount = cstAmount;
	}

	public String getCstAmount(){
		return this.cstAmount;
	}

	@Override
	public String toString (){
		return "cstId:"+(cstId == null ? "空" : cstId)+"，cstServiceType:"+(cstServiceType == null ? "空" : cstServiceType)+"，cstAmount:"+(cstAmount == null ? "空" : cstAmount);
	}
}
