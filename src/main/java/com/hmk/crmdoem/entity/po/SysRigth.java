package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SysRigth implements Serializable {


	/**
	 * 
	 */
	private Integer rightId;

	/**
	 * 
	 */
	private String rightParentId;

	/**
	 * 
	 */
	private Integer rightType;

	/**
	 * 
	 */
	private String rightText;

	/**
	 * 
	 */
	private String rightUrl;


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

	public void setRightUrl(String rightUrl){
		this.rightUrl = rightUrl;
	}

	public String getRightUrl(){
		return this.rightUrl;
	}

	@Override
	public String toString (){
		return "rightId:"+(rightId == null ? "空" : rightId)+"，rightParentId:"+(rightParentId == null ? "空" : rightParentId)+"，rightType:"+(rightType == null ? "空" : rightType)+"，rightText:"+(rightText == null ? "空" : rightText)+"，rightUrl:"+(rightUrl == null ? "空" : rightUrl);
	}
}
