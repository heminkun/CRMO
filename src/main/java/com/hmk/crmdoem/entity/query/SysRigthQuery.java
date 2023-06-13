package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class SysRigthQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer rightId;

	/**
	 * 
	 */
	private String rightParentId;

	private String rightParentIdFuzzy;

	/**
	 * 
	 */
	private Integer rightType;

	/**
	 * 
	 */
	private String rightText;

	private String rightTextFuzzy;

	/**
	 * 
	 */
	private String rightUrl;

	private String rightUrlFuzzy;


	public void setRightId(Integer rightId){
		this.rightId = rightId;
	}

	public Integer getRightId(){
		return this.rightId;
	}

	public void setRightParentId(String rightParentId){
		this.rightParentId = rightParentId;
	}

	public String getRightParentId(){
		return this.rightParentId;
	}

	public void setRightParentIdFuzzy(String rightParentIdFuzzy){
		this.rightParentIdFuzzy = rightParentIdFuzzy;
	}

	public String getRightParentIdFuzzy(){
		return this.rightParentIdFuzzy;
	}

	public void setRightType(Integer rightType){
		this.rightType = rightType;
	}

	public Integer getRightType(){
		return this.rightType;
	}

	public void setRightText(String rightText){
		this.rightText = rightText;
	}

	public String getRightText(){
		return this.rightText;
	}

	public void setRightTextFuzzy(String rightTextFuzzy){
		this.rightTextFuzzy = rightTextFuzzy;
	}

	public String getRightTextFuzzy(){
		return this.rightTextFuzzy;
	}

	public void setRightUrl(String rightUrl){
		this.rightUrl = rightUrl;
	}

	public String getRightUrl(){
		return this.rightUrl;
	}

	public void setRightUrlFuzzy(String rightUrlFuzzy){
		this.rightUrlFuzzy = rightUrlFuzzy;
	}

	public String getRightUrlFuzzy(){
		return this.rightUrlFuzzy;
	}

}
