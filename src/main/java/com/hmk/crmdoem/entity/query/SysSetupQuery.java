package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class SysSetupQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String rotation;

	private String rotationFuzzy;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setRotation(String rotation){
		this.rotation = rotation;
	}

	public String getRotation(){
		return this.rotation;
	}

	public void setRotationFuzzy(String rotationFuzzy){
		this.rotationFuzzy = rotationFuzzy;
	}

	public String getRotationFuzzy(){
		return this.rotationFuzzy;
	}

}
