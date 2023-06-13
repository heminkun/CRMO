package com.hmk.crmdoem.entity.query;

import java.util.Date;


/**
 * 
 * 参数
 * 
 */
public class OrdersQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer odrId;

	/**
	 * 
	 */
	private String odrCustomer;

	private String odrCustomerFuzzy;

	/**
	 * 
	 */
	private String odrDate;

	private String odrDateStart;

	private String odrDateEnd;

	/**
	 * 
	 */
	private String odrAddr;

	private String odrAddrFuzzy;

	/**
	 * 
	 */
	private String odrStatus;

	private String odrStatusFuzzy;


	public void setOdrId(Integer odrId){
		this.odrId = odrId;
	}

	public Integer getOdrId(){
		return this.odrId;
	}

	public void setOdrCustomer(String odrCustomer){
		this.odrCustomer = odrCustomer;
	}

	public String getOdrCustomer(){
		return this.odrCustomer;
	}

	public void setOdrCustomerFuzzy(String odrCustomerFuzzy){
		this.odrCustomerFuzzy = odrCustomerFuzzy;
	}

	public String getOdrCustomerFuzzy(){
		return this.odrCustomerFuzzy;
	}

	public void setOdrDate(String odrDate){
		this.odrDate = odrDate;
	}

	public String getOdrDate(){
		return this.odrDate;
	}

	public void setOdrDateStart(String odrDateStart){
		this.odrDateStart = odrDateStart;
	}

	public String getOdrDateStart(){
		return this.odrDateStart;
	}
	public void setOdrDateEnd(String odrDateEnd){
		this.odrDateEnd = odrDateEnd;
	}

	public String getOdrDateEnd(){
		return this.odrDateEnd;
	}

	public void setOdrAddr(String odrAddr){
		this.odrAddr = odrAddr;
	}

	public String getOdrAddr(){
		return this.odrAddr;
	}

	public void setOdrAddrFuzzy(String odrAddrFuzzy){
		this.odrAddrFuzzy = odrAddrFuzzy;
	}

	public String getOdrAddrFuzzy(){
		return this.odrAddrFuzzy;
	}

	public void setOdrStatus(String odrStatus){
		this.odrStatus = odrStatus;
	}

	public String getOdrStatus(){
		return this.odrStatus;
	}

	public void setOdrStatusFuzzy(String odrStatusFuzzy){
		this.odrStatusFuzzy = odrStatusFuzzy;
	}

	public String getOdrStatusFuzzy(){
		return this.odrStatusFuzzy;
	}

}
