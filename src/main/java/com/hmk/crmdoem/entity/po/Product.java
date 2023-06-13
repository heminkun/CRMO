package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class Product implements Serializable {


	/**
	 * 
	 */
	private Integer prodId;

	/**
	 * 
	 */
	private String prodName;

	/**
	 * 
	 */
	private String prodType;

	/**
	 * 
	 */
	private String prodBatch;

	/**
	 * 
	 */
	private String prodUnit;

	/**
	 * 
	 */
	private BigDecimal prodPrice;

	/**
	 * 
	 */
	private String prodMemo;


	public void setProdId(Integer prodId){
		this.prodId = prodId;
	}

	public Integer getProdId(){
		return this.prodId;
	}

	public void setProdName(String prodName){
		this.prodName = prodName;
	}

	public String getProdName(){
		return this.prodName;
	}

	public void setProdType(String prodType){
		this.prodType = prodType;
	}

	public String getProdType(){
		return this.prodType;
	}

	public void setProdBatch(String prodBatch){
		this.prodBatch = prodBatch;
	}

	public String getProdBatch(){
		return this.prodBatch;
	}

	public void setProdUnit(String prodUnit){
		this.prodUnit = prodUnit;
	}

	public String getProdUnit(){
		return this.prodUnit;
	}

	public void setProdPrice(BigDecimal prodPrice){
		this.prodPrice = prodPrice;
	}

	public BigDecimal getProdPrice(){
		return this.prodPrice;
	}

	public void setProdMemo(String prodMemo){
		this.prodMemo = prodMemo;
	}

	public String getProdMemo(){
		return this.prodMemo;
	}

	@Override
	public String toString (){
		return "prodId:"+(prodId == null ? "空" : prodId)+"，prodName:"+(prodName == null ? "空" : prodName)+"，prodType:"+(prodType == null ? "空" : prodType)+"，prodBatch:"+(prodBatch == null ? "空" : prodBatch)+"，prodUnit:"+(prodUnit == null ? "空" : prodUnit)+"，prodPrice:"+(prodPrice == null ? "空" : prodPrice)+"，prodMemo:"+(prodMemo == null ? "空" : prodMemo);
	}
}
