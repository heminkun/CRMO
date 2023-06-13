package com.hmk.crmdoem.entity.query;

import java.util.Date;


/**
 * 
 * 参数
 * 
 */
public class SalChanceQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer chcId;

	/**
	 * 
	 */
	private String chcSource;

	private String chcSourceFuzzy;

	/**
	 * 
	 */
	private String chcCustName;

	private String chcCustNameFuzzy;

	/**
	 * 
	 */
	private String chcTitle;

	private String chcTitleFuzzy;

	/**
	 * 
	 */
	private Integer chcRate;

	/**
	 * 
	 */
	private String chcLinkman;

	private String chcLinkmanFuzzy;

	/**
	 * 
	 */
	private String chcTel;

	private String chcTelFuzzy;

	/**
	 * 
	 */
	private String chcDesc;

	private String chcDescFuzzy;

	/**
	 * 
	 */
	private Integer chcCreateId;

	/**
	 * 
	 */
	private String chcCreateBy;

	private String chcCreateByFuzzy;

	/**
	 * 
	 */
	private String chcCreateDate;

	private String chcCreateDateStart;

	private String chcCreateDateEnd;

	/**
	 * 
	 */
	private Integer chcDueId;

	/**
	 * 
	 */
	private String chcDueTo;

	private String chcDueToFuzzy;

	/**
	 * 
	 */
	private String chcDueDate;

	private String chcDueDateStart;

	private String chcDueDateEnd;

	/**
	 * 
	 */
	private Integer chcStatus;


	public void setChcId(Integer chcId){
		this.chcId = chcId;
	}

	public Integer getChcId(){
		return this.chcId;
	}

	public void setChcSource(String chcSource){
		this.chcSource = chcSource;
	}

	public String getChcSource(){
		return this.chcSource;
	}

	public void setChcSourceFuzzy(String chcSourceFuzzy){
		this.chcSourceFuzzy = chcSourceFuzzy;
	}

	public String getChcSourceFuzzy(){
		return this.chcSourceFuzzy;
	}

	public void setChcCustName(String chcCustName){
		this.chcCustName = chcCustName;
	}

	public String getChcCustName(){
		return this.chcCustName;
	}

	public void setChcCustNameFuzzy(String chcCustNameFuzzy){
		this.chcCustNameFuzzy = chcCustNameFuzzy;
	}

	public String getChcCustNameFuzzy(){
		return this.chcCustNameFuzzy;
	}

	public void setChcTitle(String chcTitle){
		this.chcTitle = chcTitle;
	}

	public String getChcTitle(){
		return this.chcTitle;
	}

	public void setChcTitleFuzzy(String chcTitleFuzzy){
		this.chcTitleFuzzy = chcTitleFuzzy;
	}

	public String getChcTitleFuzzy(){
		return this.chcTitleFuzzy;
	}

	public void setChcRate(Integer chcRate){
		this.chcRate = chcRate;
	}

	public Integer getChcRate(){
		return this.chcRate;
	}

	public void setChcLinkman(String chcLinkman){
		this.chcLinkman = chcLinkman;
	}

	public String getChcLinkman(){
		return this.chcLinkman;
	}

	public void setChcLinkmanFuzzy(String chcLinkmanFuzzy){
		this.chcLinkmanFuzzy = chcLinkmanFuzzy;
	}

	public String getChcLinkmanFuzzy(){
		return this.chcLinkmanFuzzy;
	}

	public void setChcTel(String chcTel){
		this.chcTel = chcTel;
	}

	public String getChcTel(){
		return this.chcTel;
	}

	public void setChcTelFuzzy(String chcTelFuzzy){
		this.chcTelFuzzy = chcTelFuzzy;
	}

	public String getChcTelFuzzy(){
		return this.chcTelFuzzy;
	}

	public void setChcDesc(String chcDesc){
		this.chcDesc = chcDesc;
	}

	public String getChcDesc(){
		return this.chcDesc;
	}

	public void setChcDescFuzzy(String chcDescFuzzy){
		this.chcDescFuzzy = chcDescFuzzy;
	}

	public String getChcDescFuzzy(){
		return this.chcDescFuzzy;
	}

	public void setChcCreateId(Integer chcCreateId){
		this.chcCreateId = chcCreateId;
	}

	public Integer getChcCreateId(){
		return this.chcCreateId;
	}

	public void setChcCreateBy(String chcCreateBy){
		this.chcCreateBy = chcCreateBy;
	}

	public String getChcCreateBy(){
		return this.chcCreateBy;
	}

	public void setChcCreateByFuzzy(String chcCreateByFuzzy){
		this.chcCreateByFuzzy = chcCreateByFuzzy;
	}

	public String getChcCreateByFuzzy(){
		return this.chcCreateByFuzzy;
	}

	public void setChcCreateDate(String chcCreateDate){
		this.chcCreateDate = chcCreateDate;
	}

	public String getChcCreateDate(){
		return this.chcCreateDate;
	}

	public void setChcCreateDateStart(String chcCreateDateStart){
		this.chcCreateDateStart = chcCreateDateStart;
	}

	public String getChcCreateDateStart(){
		return this.chcCreateDateStart;
	}
	public void setChcCreateDateEnd(String chcCreateDateEnd){
		this.chcCreateDateEnd = chcCreateDateEnd;
	}

	public String getChcCreateDateEnd(){
		return this.chcCreateDateEnd;
	}

	public void setChcDueId(Integer chcDueId){
		this.chcDueId = chcDueId;
	}

	public Integer getChcDueId(){
		return this.chcDueId;
	}

	public void setChcDueTo(String chcDueTo){
		this.chcDueTo = chcDueTo;
	}

	public String getChcDueTo(){
		return this.chcDueTo;
	}

	public void setChcDueToFuzzy(String chcDueToFuzzy){
		this.chcDueToFuzzy = chcDueToFuzzy;
	}

	public String getChcDueToFuzzy(){
		return this.chcDueToFuzzy;
	}

	public void setChcDueDate(String chcDueDate){
		this.chcDueDate = chcDueDate;
	}

	public String getChcDueDate(){
		return this.chcDueDate;
	}

	public void setChcDueDateStart(String chcDueDateStart){
		this.chcDueDateStart = chcDueDateStart;
	}

	public String getChcDueDateStart(){
		return this.chcDueDateStart;
	}
	public void setChcDueDateEnd(String chcDueDateEnd){
		this.chcDueDateEnd = chcDueDateEnd;
	}

	public String getChcDueDateEnd(){
		return this.chcDueDateEnd;
	}

	public void setChcStatus(Integer chcStatus){
		this.chcStatus = chcStatus;
	}

	public Integer getChcStatus(){
		return this.chcStatus;
	}

}
