package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.hmk.crmdoem.entity.enums.DateTimePatternEnum;
import com.hmk.crmdoem.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class SalPlan implements Serializable {


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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date plaDate;

	/**
	 * 
	 */
	private String plaTodo;

	/**
	 * 
	 */
	private String plaResult;


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

	public void setPlaDate(Date plaDate){
		this.plaDate = plaDate;
	}

	public Date getPlaDate(){
		return this.plaDate;
	}

	public void setPlaTodo(String plaTodo){
		this.plaTodo = plaTodo;
	}

	public String getPlaTodo(){
		return this.plaTodo;
	}

	public void setPlaResult(String plaResult){
		this.plaResult = plaResult;
	}

	public String getPlaResult(){
		return this.plaResult;
	}

	@Override
	public String toString (){
		return "plaId:"+(plaId == null ? "空" : plaId)+"，plaChcId:"+(plaChcId == null ? "空" : plaChcId)+"，plaDate:"+(plaDate == null ? "空" : DateUtil.format(plaDate, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，plaTodo:"+(plaTodo == null ? "空" : plaTodo)+"，plaResult:"+(plaResult == null ? "空" : plaResult);
	}
}
