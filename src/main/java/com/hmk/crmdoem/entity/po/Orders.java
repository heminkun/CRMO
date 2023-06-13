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
public class Orders implements Serializable {


	/**
	 * 
	 */
	private Integer odrId;

	/**
	 * 
	 */
	private String odrCustomer;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date odrDate;

	/**
	 * 
	 */
	private String odrAddr;

	/**
	 * 
	 */
	private String odrStatus;


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

	public void setOdrDate(Date odrDate){
		this.odrDate = odrDate;
	}

	public Date getOdrDate(){
		return this.odrDate;
	}

	public void setOdrAddr(String odrAddr){
		this.odrAddr = odrAddr;
	}

	public String getOdrAddr(){
		return this.odrAddr;
	}

	public void setOdrStatus(String odrStatus){
		this.odrStatus = odrStatus;
	}

	public String getOdrStatus(){
		return this.odrStatus;
	}

	@Override
	public String toString (){
		return "odrId:"+(odrId == null ? "空" : odrId)+"，odrCustomer:"+(odrCustomer == null ? "空" : odrCustomer)+"，odrDate:"+(odrDate == null ? "空" : DateUtil.format(odrDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，odrAddr:"+(odrAddr == null ? "空" : odrAddr)+"，odrStatus:"+(odrStatus == null ? "空" : odrStatus);
	}
}
