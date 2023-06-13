package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class CstLinkman implements Serializable {


	/**
	 * 
	 */
	private Integer lkmId;

	/**
	 * 
	 */
	private String lkmCustNo;

	/**
	 * 
	 */
	private String lkmCustName;

	/**
	 * 
	 */
	private String lkmName;

	/**
	 * 
	 */
	private String lkmSex;

	/**
	 * 
	 */
	private String lkmPostion;

	/**
	 * 
	 */
	private String lkmTel;

	/**
	 * 
	 */
	private String lkmMobile;

	/**
	 * 
	 */
	private String lkmMemo;


	public void setLkmId(Integer lkmId){
		this.lkmId = lkmId;
	}

	public Integer getLkmId(){
		return this.lkmId;
	}

	public void setLkmCustNo(String lkmCustNo){
		this.lkmCustNo = lkmCustNo;
	}

	public String getLkmCustNo(){
		return this.lkmCustNo;
	}

	public void setLkmCustName(String lkmCustName){
		this.lkmCustName = lkmCustName;
	}

	public String getLkmCustName(){
		return this.lkmCustName;
	}

	public void setLkmName(String lkmName){
		this.lkmName = lkmName;
	}

	public String getLkmName(){
		return this.lkmName;
	}

	public void setLkmSex(String lkmSex){
		this.lkmSex = lkmSex;
	}

	public String getLkmSex(){
		return this.lkmSex;
	}

	public void setLkmPostion(String lkmPostion){
		this.lkmPostion = lkmPostion;
	}

	public String getLkmPostion(){
		return this.lkmPostion;
	}

	public void setLkmTel(String lkmTel){
		this.lkmTel = lkmTel;
	}

	public String getLkmTel(){
		return this.lkmTel;
	}

	public void setLkmMobile(String lkmMobile){
		this.lkmMobile = lkmMobile;
	}

	public String getLkmMobile(){
		return this.lkmMobile;
	}

	public void setLkmMemo(String lkmMemo){
		this.lkmMemo = lkmMemo;
	}

	public String getLkmMemo(){
		return this.lkmMemo;
	}

	@Override
	public String toString (){
		return "lkmId:"+(lkmId == null ? "空" : lkmId)+"，lkmCustNo:"+(lkmCustNo == null ? "空" : lkmCustNo)+"，lkmCustName:"+(lkmCustName == null ? "空" : lkmCustName)+"，lkmName:"+(lkmName == null ? "空" : lkmName)+"，lkmSex:"+(lkmSex == null ? "空" : lkmSex)+"，lkmPostion:"+(lkmPostion == null ? "空" : lkmPostion)+"，lkmTel:"+(lkmTel == null ? "空" : lkmTel)+"，lkmMobile:"+(lkmMobile == null ? "空" : lkmMobile)+"，lkmMemo:"+(lkmMemo == null ? "空" : lkmMemo);
	}
}
