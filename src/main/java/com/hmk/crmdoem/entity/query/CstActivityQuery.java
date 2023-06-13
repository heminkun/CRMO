package com.hmk.crmdoem.entity.query;

import java.util.Date;


/**
 * 
 * 参数
 * 
 */
public class CstActivityQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer atvId;

	/**
	 * 
	 */
	private String atvCustNo;

	private String atvCustNoFuzzy;

	/**
	 * 
	 */
	private String atvCustName;

	private String atvCustNameFuzzy;

	/**
	 * 
	 */
	private String atvDate;

	private String atvDateStart;

	private String atvDateEnd;

	/**
	 * 
	 */
	private String atvPlace;

	private String atvPlaceFuzzy;

	/**
	 * 
	 */
	private String atvTitle;

	private String atvTitleFuzzy;

	/**
	 * 
	 */
	private String atvDesc;

	private String atvDescFuzzy;


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

	public void setAtvCustNoFuzzy(String atvCustNoFuzzy){
		this.atvCustNoFuzzy = atvCustNoFuzzy;
	}

	public String getAtvCustNoFuzzy(){
		return this.atvCustNoFuzzy;
	}

	public void setAtvCustName(String atvCustName){
		this.atvCustName = atvCustName;
	}

	public String getAtvCustName(){
		return this.atvCustName;
	}

	public void setAtvCustNameFuzzy(String atvCustNameFuzzy){
		this.atvCustNameFuzzy = atvCustNameFuzzy;
	}

	public String getAtvCustNameFuzzy(){
		return this.atvCustNameFuzzy;
	}

	public void setAtvDate(String atvDate){
		this.atvDate = atvDate;
	}

	public String getAtvDate(){
		return this.atvDate;
	}

	public void setAtvDateStart(String atvDateStart){
		this.atvDateStart = atvDateStart;
	}

	public String getAtvDateStart(){
		return this.atvDateStart;
	}
	public void setAtvDateEnd(String atvDateEnd){
		this.atvDateEnd = atvDateEnd;
	}

	public String getAtvDateEnd(){
		return this.atvDateEnd;
	}

	public void setAtvPlace(String atvPlace){
		this.atvPlace = atvPlace;
	}

	public String getAtvPlace(){
		return this.atvPlace;
	}

	public void setAtvPlaceFuzzy(String atvPlaceFuzzy){
		this.atvPlaceFuzzy = atvPlaceFuzzy;
	}

	public String getAtvPlaceFuzzy(){
		return this.atvPlaceFuzzy;
	}

	public void setAtvTitle(String atvTitle){
		this.atvTitle = atvTitle;
	}

	public String getAtvTitle(){
		return this.atvTitle;
	}

	public void setAtvTitleFuzzy(String atvTitleFuzzy){
		this.atvTitleFuzzy = atvTitleFuzzy;
	}

	public String getAtvTitleFuzzy(){
		return this.atvTitleFuzzy;
	}

	public void setAtvDesc(String atvDesc){
		this.atvDesc = atvDesc;
	}

	public String getAtvDesc(){
		return this.atvDesc;
	}

	public void setAtvDescFuzzy(String atvDescFuzzy){
		this.atvDescFuzzy = atvDescFuzzy;
	}

	public String getAtvDescFuzzy(){
		return this.atvDescFuzzy;
	}

}
