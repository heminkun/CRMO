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
public class CstActivity implements Serializable {


	/**
	 * 
	 */
	private Integer atvId;

	/**
	 * 
	 */
	private String atvCustNo;

	/**
	 * 
	 */
	private String atvCustName;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date atvDate;

	/**
	 * 
	 */
	private String atvPlace;

	/**
	 * 
	 */
	private String atvTitle;

	/**
	 * 
	 */
	private String atvDesc;


	public void setAtvId(Integer atvId){
		this.atvId = atvId;
	}

	public Integer getAtvId(){
		return this.atvId;
	}

	public void setAtvCustNo(String atvCustNo){
		this.atvCustNo = atvCustNo;
	}

	public String getAtvCustNo(){
		return this.atvCustNo;
	}

	public void setAtvCustName(String atvCustName){
		this.atvCustName = atvCustName;
	}

	public String getAtvCustName(){
		return this.atvCustName;
	}

	public void setAtvDate(Date atvDate){
		this.atvDate = atvDate;
	}

	public Date getAtvDate(){
		return this.atvDate;
	}

	public void setAtvPlace(String atvPlace){
		this.atvPlace = atvPlace;
	}

	public String getAtvPlace(){
		return this.atvPlace;
	}

	public void setAtvTitle(String atvTitle){
		this.atvTitle = atvTitle;
	}

	public String getAtvTitle(){
		return this.atvTitle;
	}

	public void setAtvDesc(String atvDesc){
		this.atvDesc = atvDesc;
	}

	public String getAtvDesc(){
		return this.atvDesc;
	}

	@Override
	public String toString (){
		return "atvId:"+(atvId == null ? "空" : atvId)+"，atvCustNo:"+(atvCustNo == null ? "空" : atvCustNo)+"，atvCustName:"+(atvCustName == null ? "空" : atvCustName)+"，atvDate:"+(atvDate == null ? "空" : DateUtil.format(atvDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，atvPlace:"+(atvPlace == null ? "空" : atvPlace)+"，atvTitle:"+(atvTitle == null ? "空" : atvTitle)+"，atvDesc:"+(atvDesc == null ? "空" : atvDesc);
	}
}
