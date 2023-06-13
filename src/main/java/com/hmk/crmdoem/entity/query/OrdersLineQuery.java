package com.hmk.crmdoem.entity.query;

import java.math.BigDecimal;


/**
 * 
 * 参数
 * 
 */
public class OrdersLineQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer oddId;

	/**
	 * 
	 */
	private Integer oddOrderId;

	/**
	 * 
	 */
	private Integer oddProdId;

	/**
	 * 
	 */
	private Integer oddCount;

	/**
	 * 
	 */
	private String oddUnit;

	private String oddUnitFuzzy;

	/**
	 * 
	 */
	private BigDecimal oddPrice;


	public void setOddId(Integer oddId){
		this.oddId = oddId;
	}

	public Integer getOddId(){
		return this.oddId;
	}

	public void setOddOrderId(Integer oddOrderId){
		this.oddOrderId = oddOrderId;
	}

	public Integer getOddOrderId(){
		return this.oddOrderId;
	}

	public void setOddProdId(Integer oddProdId){
		this.oddProdId = oddProdId;
	}

	public Integer getOddProdId(){
		return this.oddProdId;
	}

	public void setOddCount(Integer oddCount){
		this.oddCount = oddCount;
	}

	public Integer getOddCount(){
		return this.oddCount;
	}

	public void setOddUnit(String oddUnit){
		this.oddUnit = oddUnit;
	}

	public String getOddUnit(){
		return this.oddUnit;
	}

	public void setOddUnitFuzzy(String oddUnitFuzzy){
		this.oddUnitFuzzy = oddUnitFuzzy;
	}

	public String getOddUnitFuzzy(){
		return this.oddUnitFuzzy;
	}

	public void setOddPrice(BigDecimal oddPrice){
		this.oddPrice = oddPrice;
	}

	public BigDecimal getOddPrice(){
		return this.oddPrice;
	}

}
