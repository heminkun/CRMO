package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class OrdersLine implements Serializable {


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

	public void setOddPrice(BigDecimal oddPrice){
		this.oddPrice = oddPrice;
	}

	public BigDecimal getOddPrice(){
		return this.oddPrice;
	}

	@Override
	public String toString (){
		return "oddId:"+(oddId == null ? "空" : oddId)+"，oddOrderId:"+(oddOrderId == null ? "空" : oddOrderId)+"，oddProdId:"+(oddProdId == null ? "空" : oddProdId)+"，oddCount:"+(oddCount == null ? "空" : oddCount)+"，oddUnit:"+(oddUnit == null ? "空" : oddUnit)+"，oddPrice:"+(oddPrice == null ? "空" : oddPrice);
	}
}
