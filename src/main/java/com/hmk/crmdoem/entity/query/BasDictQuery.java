package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class BasDictQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer dictId;

	/**
	 * 
	 */
	private String dictType;

	private String dictTypeFuzzy;

	/**
	 * 
	 */
	private String dictItem;

	private String dictItemFuzzy;

	/**
	 * 
	 */
	private String dictValue;

	private String dictValueFuzzy;

	/**
	 * 
	 */
	private String dictIsEditable;

	private String dictIsEditableFuzzy;


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

	public void setDictTypeFuzzy(String dictTypeFuzzy){
		this.dictTypeFuzzy = dictTypeFuzzy;
	}

	public String getDictTypeFuzzy(){
		return this.dictTypeFuzzy;
	}

	public void setDictItem(String dictItem){
		this.dictItem = dictItem;
	}

	public String getDictItem(){
		return this.dictItem;
	}

	public void setDictItemFuzzy(String dictItemFuzzy){
		this.dictItemFuzzy = dictItemFuzzy;
	}

	public String getDictItemFuzzy(){
		return this.dictItemFuzzy;
	}

	public void setDictValue(String dictValue){
		this.dictValue = dictValue;
	}

	public String getDictValue(){
		return this.dictValue;
	}

	public void setDictValueFuzzy(String dictValueFuzzy){
		this.dictValueFuzzy = dictValueFuzzy;
	}

	public String getDictValueFuzzy(){
		return this.dictValueFuzzy;
	}

	public void setDictIsEditable(String dictIsEditable){
		this.dictIsEditable = dictIsEditable;
	}

	public String getDictIsEditable(){
		return this.dictIsEditable;
	}

	public void setDictIsEditableFuzzy(String dictIsEditableFuzzy){
		this.dictIsEditableFuzzy = dictIsEditableFuzzy;
	}

	public String getDictIsEditableFuzzy(){
		return this.dictIsEditableFuzzy;
	}

}
