package com.hmk.crmdoem.entity.query;



/**
 * 
 * 参数
 * 
 */
public class StorageQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer stkId;

	/**
	 * 
	 */
	private Integer stkProdId;

	/**
	 * 
	 */
	private String stkWarehouse;

	private String stkWarehouseFuzzy;

	/**
	 * 
	 */
	private String stkWare;

	private String stkWareFuzzy;

	/**
	 * 
	 */
	private Integer stkCount;

	/**
	 * 
	 */
	private String stkMemo;

	private String stkMemoFuzzy;


	public void setStkId(Integer stkId){
		this.stkId = stkId;
	}

	public Integer getStkId(){
		return this.stkId;
	}

	public void setStkProdId(Integer stkProdId){
		this.stkProdId = stkProdId;
	}

	public Integer getStkProdId(){
		return this.stkProdId;
	}

	public void setStkWarehouse(String stkWarehouse){
		this.stkWarehouse = stkWarehouse;
	}

	public String getStkWarehouse(){
		return this.stkWarehouse;
	}

	public void setStkWarehouseFuzzy(String stkWarehouseFuzzy){
		this.stkWarehouseFuzzy = stkWarehouseFuzzy;
	}

	public String getStkWarehouseFuzzy(){
		return this.stkWarehouseFuzzy;
	}

	public void setStkWare(String stkWare){
		this.stkWare = stkWare;
	}

	public String getStkWare(){
		return this.stkWare;
	}

	public void setStkWareFuzzy(String stkWareFuzzy){
		this.stkWareFuzzy = stkWareFuzzy;
	}

	public String getStkWareFuzzy(){
		return this.stkWareFuzzy;
	}

	public void setStkCount(Integer stkCount){
		this.stkCount = stkCount;
	}

	public Integer getStkCount(){
		return this.stkCount;
	}

	public void setStkMemo(String stkMemo){
		this.stkMemo = stkMemo;
	}

	public String getStkMemo(){
		return this.stkMemo;
	}

	public void setStkMemoFuzzy(String stkMemoFuzzy){
		this.stkMemoFuzzy = stkMemoFuzzy;
	}

	public String getStkMemoFuzzy(){
		return this.stkMemoFuzzy;
	}

}
