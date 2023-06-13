package com.hmk.crmdoem.entity.query;

import java.math.BigDecimal;


/**
 * 
 * 参数
 * 
 */
public class ProductQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer prodId;

	/**
	 * 
	 */
	private String prodName;

	private String prodNameFuzzy;

	/**
	 * 
	 */
	private String prodType;

	private String prodTypeFuzzy;

	/**
	 * 
	 */
	private String prodBatch;

	private String prodBatchFuzzy;

	/**
	 * 
	 */
	private String prodUnit;

	private String prodUnitFuzzy;

	/**
	 * 
	 */
	private BigDecimal prodPrice;

	/**
	 * 
	 */
	private String prodMemo;

	private String prodMemoFuzzy;


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

	public void setProdNameFuzzy(String prodNameFuzzy){
		this.prodNameFuzzy = prodNameFuzzy;
	}

	public String getProdNameFuzzy(){
		return this.prodNameFuzzy;
	}

	public void setProdType(String prodType){
		this.prodType = prodType;
	}

	public String getProdType(){
		return this.prodType;
	}

	public void setProdTypeFuzzy(String prodTypeFuzzy){
		this.prodTypeFuzzy = prodTypeFuzzy;
	}

	public String getProdTypeFuzzy(){
		return this.prodTypeFuzzy;
	}

	public void setProdBatch(String prodBatch){
		this.prodBatch = prodBatch;
	}

	public String getProdBatch(){
		return this.prodBatch;
	}

	public void setProdBatchFuzzy(String prodBatchFuzzy){
		this.prodBatchFuzzy = prodBatchFuzzy;
	}

	public String getProdBatchFuzzy(){
		return this.prodBatchFuzzy;
	}

	public void setProdUnit(String prodUnit){
		this.prodUnit = prodUnit;
	}

	public String getProdUnit(){
		return this.prodUnit;
	}

	public void setProdUnitFuzzy(String prodUnitFuzzy){
		this.prodUnitFuzzy = prodUnitFuzzy;
	}

	public String getProdUnitFuzzy(){
		return this.prodUnitFuzzy;
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

	public void setProdMemoFuzzy(String prodMemoFuzzy){
		this.prodMemoFuzzy = prodMemoFuzzy;
	}

	public String getProdMemoFuzzy(){
		return this.prodMemoFuzzy;
	}

}
