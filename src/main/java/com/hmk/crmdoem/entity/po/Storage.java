package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class Storage implements Serializable {


	/**
	 * 
	 */
	private Integer stkId;

	/**
	 * 
	 */
	private Integer stkProdId;

	/**
	 * 
	 */
	private String stkWarehouse;

	/**
	 * 
	 */
	private String stkWare;

	/**
	 * 
	 */
	private Integer stkCount;

	/**
	 * 
	 */
	private String stkMemo;


	public void setStkId(Integer stkId){
		this.stkId = stkId;
	}

	public Integer getStkId(){
		return this.stkId;
	}

	public void setStkProdId(Integer stkProdId){
		this.stkProdId = stkProdId;
	}

	public Integer getStkProdId(){
		return this.stkProdId;
	}

	public void setStkWarehouse(String stkWarehouse){
		this.stkWarehouse = stkWarehouse;
	}

	public String getStkWarehouse(){
		return this.stkWarehouse;
	}

	public void setStkWare(String stkWare){
		this.stkWare = stkWare;
	}

	public String getStkWare(){
		return this.stkWare;
	}

	public void setStkCount(Integer stkCount){
		this.stkCount = stkCount;
	}

	public Integer getStkCount(){
		return this.stkCount;
	}

	public void setStkMemo(String stkMemo){
		this.stkMemo = stkMemo;
	}

	public String getStkMemo(){
		return this.stkMemo;
	}

	@Override
	public String toString (){
		return "stkId:"+(stkId == null ? "空" : stkId)+"，stkProdId:"+(stkProdId == null ? "空" : stkProdId)+"，stkWarehouse:"+(stkWarehouse == null ? "空" : stkWarehouse)+"，stkWare:"+(stkWare == null ? "空" : stkWare)+"，stkCount:"+(stkCount == null ? "空" : stkCount)+"，stkMemo:"+(stkMemo == null ? "空" : stkMemo);
	}
}
