package com.hmk.crmdoem.entity.query;


import com.hmk.crmdoem.entity.query.BaseParam;

/**
 * 
 * 参数
 * 
 */
public class CstServiceTypeQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer cstId;

	/**
	 * 
	 */
	private String cstServiceType;

	private String cstServiceTypeFuzzy;

	/**
	 * 
	 */
	private String cstAmount;

	private String cstAmountFuzzy;


	public void setCstId(Integer cstId){
		this.cstId = cstId;
	}

	public Integer getCstId(){
		return this.cstId;
	}

	public void setCstServiceType(String cstServiceType){
		this.cstServiceType = cstServiceType;
	}

	public String getCstServiceType(){
		return this.cstServiceType;
	}

	public void setCstServiceTypeFuzzy(String cstServiceTypeFuzzy){
		this.cstServiceTypeFuzzy = cstServiceTypeFuzzy;
	}

	public String getCstServiceTypeFuzzy(){
		return this.cstServiceTypeFuzzy;
	}

	public void setCstAmount(String cstAmount){
		this.cstAmount = cstAmount;
	}

	public String getCstAmount(){
		return this.cstAmount;
	}

	public void setCstAmountFuzzy(String cstAmountFuzzy){
		this.cstAmountFuzzy = cstAmountFuzzy;
	}

	public String getCstAmountFuzzy(){
		return this.cstAmountFuzzy;
	}

}
