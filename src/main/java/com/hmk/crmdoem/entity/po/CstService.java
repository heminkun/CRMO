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
public class CstService implements Serializable {


	/**
	 * 
	 */
	private Integer svrId;

	/**
	 * 
	 */
	private String svrType;

	/**
	 * 
	 */
	private String svrTitle;

	/**
	 * 
	 */
	private String svrCustNo;

	/**
	 * 
	 */
	private String svrCustName;

	/**
	 * 
	 */
	private String svrStatus;

	/**
	 * 
	 */
	private String svrRequest;

	/**
	 * 
	 */
	private Integer svrCreateId;

	/**
	 * 
	 */
	private String svrCreateBy;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date svrCreateDate;

	/**
	 * 
	 */
	private Integer svrDueId;

	/**
	 * 
	 */
	private String svrDueTo;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date svrDueDate;

	/**
	 * 
	 */
	private String svrDeal;

	/**
	 * 
	 */
	private Integer svrDealId;

	/**
	 * 
	 */
	private String svrDealBy;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date svrDealDate;

	/**
	 * 
	 */
	private String svrResult;

	/**
	 * 
	 */
	private Integer svrSatisfy;


	public void setSvrId(Integer svrId){
		this.svrId = svrId;
	}

	public Integer getSvrId(){
		return this.svrId;
	}

	public void setSvrType(String svrType){
		this.svrType = svrType;
	}

	public String getSvrType(){
		return this.svrType;
	}

	public void setSvrTitle(String svrTitle){
		this.svrTitle = svrTitle;
	}

	public String getSvrTitle(){
		return this.svrTitle;
	}

	public void setSvrCustNo(String svrCustNo){
		this.svrCustNo = svrCustNo;
	}

	public String getSvrCustNo(){
		return this.svrCustNo;
	}

	public void setSvrCustName(String svrCustName){
		this.svrCustName = svrCustName;
	}

	public String getSvrCustName(){
		return this.svrCustName;
	}

	public void setSvrStatus(String svrStatus){
		this.svrStatus = svrStatus;
	}

	public String getSvrStatus(){
		return this.svrStatus;
	}

	public void setSvrRequest(String svrRequest){
		this.svrRequest = svrRequest;
	}

	public String getSvrRequest(){
		return this.svrRequest;
	}

	public void setSvrCreateId(Integer svrCreateId){
		this.svrCreateId = svrCreateId;
	}

	public Integer getSvrCreateId(){
		return this.svrCreateId;
	}

	public void setSvrCreateBy(String svrCreateBy){
		this.svrCreateBy = svrCreateBy;
	}

	public String getSvrCreateBy(){
		return this.svrCreateBy;
	}

	public void setSvrCreateDate(Date svrCreateDate){
		this.svrCreateDate = svrCreateDate;
	}

	public Date getSvrCreateDate(){
		return this.svrCreateDate;
	}

	public void setSvrDueId(Integer svrDueId){
		this.svrDueId = svrDueId;
	}

	public Integer getSvrDueId(){
		return this.svrDueId;
	}

	public void setSvrDueTo(String svrDueTo){
		this.svrDueTo = svrDueTo;
	}

	public String getSvrDueTo(){
		return this.svrDueTo;
	}

	public void setSvrDueDate(Date svrDueDate){
		this.svrDueDate = svrDueDate;
	}

	public Date getSvrDueDate(){
		return this.svrDueDate;
	}

	public void setSvrDeal(String svrDeal){
		this.svrDeal = svrDeal;
	}

	public String getSvrDeal(){
		return this.svrDeal;
	}

	public void setSvrDealId(Integer svrDealId){
		this.svrDealId = svrDealId;
	}

	public Integer getSvrDealId(){
		return this.svrDealId;
	}

	public void setSvrDealBy(String svrDealBy){
		this.svrDealBy = svrDealBy;
	}

	public String getSvrDealBy(){
		return this.svrDealBy;
	}

	public void setSvrDealDate(Date svrDealDate){
		this.svrDealDate = svrDealDate;
	}

	public Date getSvrDealDate(){
		return this.svrDealDate;
	}

	public void setSvrResult(String svrResult){
		this.svrResult = svrResult;
	}

	public String getSvrResult(){
		return this.svrResult;
	}

	public void setSvrSatisfy(Integer svrSatisfy){
		this.svrSatisfy = svrSatisfy;
	}

	public Integer getSvrSatisfy(){
		return this.svrSatisfy;
	}

	@Override
	public String toString (){
		return "svrId:"+(svrId == null ? "空" : svrId)+"，svrType:"+(svrType == null ? "空" : svrType)+"，svrTitle:"+(svrTitle == null ? "空" : svrTitle)+"，svrCustNo:"+(svrCustNo == null ? "空" : svrCustNo)+"，svrCustName:"+(svrCustName == null ? "空" : svrCustName)+"，svrStatus:"+(svrStatus == null ? "空" : svrStatus)+"，svrRequest:"+(svrRequest == null ? "空" : svrRequest)+"，svrCreateId:"+(svrCreateId == null ? "空" : svrCreateId)+"，svrCreateBy:"+(svrCreateBy == null ? "空" : svrCreateBy)+"，svrCreateDate:"+(svrCreateDate == null ? "空" : DateUtil.format(svrCreateDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，svrDueId:"+(svrDueId == null ? "空" : svrDueId)+"，svrDueTo:"+(svrDueTo == null ? "空" : svrDueTo)+"，svrDueDate:"+(svrDueDate == null ? "空" : DateUtil.format(svrDueDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，svrDeal:"+(svrDeal == null ? "空" : svrDeal)+"，svrDealId:"+(svrDealId == null ? "空" : svrDealId)+"，svrDealBy:"+(svrDealBy == null ? "空" : svrDealBy)+"，svrDealDate:"+(svrDealDate == null ? "空" : DateUtil.format(svrDealDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，svrResult:"+(svrResult == null ? "空" : svrResult)+"，svrSatisfy:"+(svrSatisfy == null ? "空" : svrSatisfy);
	}
}
