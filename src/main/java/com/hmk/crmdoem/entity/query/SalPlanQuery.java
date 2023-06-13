package com.hmk.crmdoem.entity.query;

import java.util.Date;


/**
 * 
 * 参数
 * 
 */
public class SalPlanQuery extends BaseParam {


	/**
	 * 
	 */
	private Integer plaId;

	/**
	 * 
	 */
	private Integer plaChcId;

	/**
	 * 
	 */
	private String plaDate;

	private String plaDateStart;

	private String plaDateEnd;

	/**
	 * 
	 */
	private String plaTodo;

	private String plaTodoFuzzy;

	/**
	 * 
	 */
	private String plaResult;

	private String plaResultFuzzy;


	public void setPlaId(Integer plaId){
		this.plaId = plaId;
	}

	public Integer getPlaId(){
		return this.plaId;
	}

	public void setPlaChcId(Integer plaChcId){
		this.plaChcId = plaChcId;
	}

	public Integer getPlaChcId(){
		return this.plaChcId;
	}

	public void setPlaDate(String plaDate){
		this.plaDate = plaDate;
	}

	public String getPlaDate(){
		return this.plaDate;
	}

	public void setPlaDateStart(String plaDateStart){
		this.plaDateStart = plaDateStart;
	}

	public String getPlaDateStart(){
		return this.plaDateStart;
	}
	public void setPlaDateEnd(String plaDateEnd){
		this.plaDateEnd = plaDateEnd;
	}

	public String getPlaDateEnd(){
		return this.plaDateEnd;
	}

	public void setPlaTodo(String plaTodo){
		this.plaTodo = plaTodo;
	}

	public String getPlaTodo(){
		return this.plaTodo;
	}

	public void setPlaTodoFuzzy(String plaTodoFuzzy){
		this.plaTodoFuzzy = plaTodoFuzzy;
	}

	public String getPlaTodoFuzzy(){
		return this.plaTodoFuzzy;
	}

	public void setPlaResult(String plaResult){
		this.plaResult = plaResult;
	}

	public String getPlaResult(){
		return this.plaResult;
	}

	public void setPlaResultFuzzy(String plaResultFuzzy){
		this.plaResultFuzzy = plaResultFuzzy;
	}

	public String getPlaResultFuzzy(){
		return this.plaResultFuzzy;
	}

}
