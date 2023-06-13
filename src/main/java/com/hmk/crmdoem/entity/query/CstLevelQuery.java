package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class CstLevelQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer custLevelId;

	/**
	 * 
	 */
	private String custLevelName;

	private String custLevelNameFuzzy;

	/**
	 * 
	 */
	private Integer custLevel;

	/**
	 * 
	 */
	private Integer custAmount;


	public void setCustLevelId(Integer custLevelId){
		this.custLevelId = custLevelId;
	}

	public Integer getCustLevelId(){
		return this.custLevelId;
	}

	public void setCustLevelName(String custLevelName){
		this.custLevelName = custLevelName;
	}

	public String getCustLevelName(){
		return this.custLevelName;
	}

	public void setCustLevelNameFuzzy(String custLevelNameFuzzy){
		this.custLevelNameFuzzy = custLevelNameFuzzy;
	}

	public String getCustLevelNameFuzzy(){
		return this.custLevelNameFuzzy;
	}

	public void setCustLevel(Integer custLevel){
		this.custLevel = custLevel;
	}

	public Integer getCustLevel(){
		return this.custLevel;
	}

	public void setCustAmount(Integer custAmount){
		this.custAmount = custAmount;
	}

	public Integer getCustAmount(){
		return this.custAmount;
	}

}
