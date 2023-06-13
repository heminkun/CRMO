package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.hmk.crmdoem.entity.enums.DateTimePatternEnum;
import com.hmk.crmdoem.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class CstLost implements Serializable {


	/**
	 * 
	 */
	private Integer lstId;

	/**
	 * 
	 */
	private String lstCustNo;

	/**
	 * 
	 */
	private String lstCustName;

	/**
	 * 
	 */
	private Integer lstCustManagerId;

	/**
	 * 
	 */
	private String lstCustManagerName;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lstLastOrderDate;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lstLostDate;

	/**
	 * 
	 */
	private String lstDelay;

	/**
	 * 
	 */
	private String lstReason;

	/**
	 * 
	 */
	private String lstStatus;


	public void setLstId(Integer lstId){
		this.lstId = lstId;
	}

	public Integer getLstId(){
		return this.lstId;
	}

	public void setLstCustNo(String lstCustNo){
		this.lstCustNo = lstCustNo;
	}

	public String getLstCustNo(){
		return this.lstCustNo;
	}

	public void setLstCustName(String lstCustName){
		this.lstCustName = lstCustName;
	}

	public String getLstCustName(){
		return this.lstCustName;
	}

	public void setLstCustManagerId(Integer lstCustManagerId){
		this.lstCustManagerId = lstCustManagerId;
	}

	public Integer getLstCustManagerId(){
		return this.lstCustManagerId;
	}

	public void setLstCustManagerName(String lstCustManagerName){
		this.lstCustManagerName = lstCustManagerName;
	}

	public String getLstCustManagerName(){
		return this.lstCustManagerName;
	}

	public void setLstLastOrderDate(Date lstLastOrderDate){
		this.lstLastOrderDate = lstLastOrderDate;
	}

	public Date getLstLastOrderDate(){
		return this.lstLastOrderDate;
	}

	public void setLstLostDate(Date lstLostDate){
		this.lstLostDate = lstLostDate;
	}

	public Date getLstLostDate(){
		return this.lstLostDate;
	}

	public void setLstDelay(String lstDelay){
		this.lstDelay = lstDelay;
	}

	public String getLstDelay(){
		return this.lstDelay;
	}

	public void setLstReason(String lstReason){
		this.lstReason = lstReason;
	}

	public String getLstReason(){
		return this.lstReason;
	}

	public void setLstStatus(String lstStatus){
		this.lstStatus = lstStatus;
	}

	public String getLstStatus(){
		return this.lstStatus;
	}

	@Override
	public String toString (){
		return "lstId:"+(lstId == null ? "空" : lstId)+"，lstCustNo:"+(lstCustNo == null ? "空" : lstCustNo)+"，lstCustName:"+(lstCustName == null ? "空" : lstCustName)+"，lstCustManagerId:"+(lstCustManagerId == null ? "空" : lstCustManagerId)+"，lstCustManagerName:"+(lstCustManagerName == null ? "空" : lstCustManagerName)+"，lstLastOrderDate:"+(lstLastOrderDate == null ? "空" : DateUtil.format(lstLastOrderDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，lstLostDate:"+(lstLostDate == null ? "空" : DateUtil.format(lstLostDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，lstDelay:"+(lstDelay == null ? "空" : lstDelay)+"，lstReason:"+(lstReason == null ? "空" : lstReason)+"，lstStatus:"+(lstStatus == null ? "空" : lstStatus);
	}
}
