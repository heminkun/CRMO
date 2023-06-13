package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class ContributeQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 
	 */
	private Integer totalPrice;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
	}

	public void setTotalPrice(Integer totalPrice){
		this.totalPrice = totalPrice;
	}

	public Integer getTotalPrice(){
		return this.totalPrice;
	}

}
