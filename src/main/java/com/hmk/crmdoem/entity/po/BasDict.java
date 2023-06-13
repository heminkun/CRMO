package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class BasDict implements Serializable {


	/**
	 * 
	 */
	private Integer dictId;

	/**
	 * 
	 */
	private String dictType;

	/**
	 * 
	 */
	private String dictItem;

	/**
	 * 
	 */
	private String dictValue;

	/**
	 * 
	 */
	private String dictIsEditable;


	public void setDictId(Integer dictId){
		this.dictId = dictId;
	}

	public Integer getDictId(){
		return this.dictId;
	}

	public void setDictType(String dictType){
		this.dictType = dictType;
	}

	public String getDictType(){
		return this.dictType;
	}

	public void setDictItem(String dictItem){
		this.dictItem = dictItem;
	}

	public String getDictItem(){
		return this.dictItem;
	}

	public void setDictValue(String dictValue){
		this.dictValue = dictValue;
	}

	public String getDictValue(){
		return this.dictValue;
	}

	public void setDictIsEditable(String dictIsEditable){
		this.dictIsEditable = dictIsEditable;
	}

	public String getDictIsEditable(){
		return this.dictIsEditable;
	}

	@Override
	public String toString (){
		return "dictId:"+(dictId == null ? "空" : dictId)+"，dictType:"+(dictType == null ? "空" : dictType)+"，dictItem:"+(dictItem == null ? "空" : dictItem)+"，dictValue:"+(dictValue == null ? "空" : dictValue)+"，dictIsEditable:"+(dictIsEditable == null ? "空" : dictIsEditable);
	}
}
