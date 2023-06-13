package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.hmk.crmdoem.entity.enums.DateTimePatternEnum;
import com.hmk.crmdoem.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@Data
@NoArgsConstructor
public class SalChance implements Serializable {


	/**
	 * 
	 */
	private Integer chcId;

	/**
	 * 
	 */
	private String chcSource;

	/**
	 * 
	 */
	private String chcCustName;

	/**
	 * 
	 */
	private String chcTitle;

	/**
	 * 
	 */
	private Integer chcRate;

	/**
	 * 
	 */
	private String chcLinkman;

	/**
	 * 
	 */
	private String chcTel;

	/**
	 * 
	 */
	private String chcDesc;

	/**
	 * 
	 */
	private Integer chcCreateId;

	/**
	 * 
	 */
	private String chcCreateBy;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date chcCreateDate;

	/**
	 * 
	 */
	private Integer chcDueId;

	/**
	 * 
	 */
	private String chcDueTo;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date chcDueDate;

	/**
	 * 
	 */
	private Integer chcStatus;

	public SalChance(String chcCustName,String chcSource,Integer chcRate,
					 String chcLinkman,String chcTel,String chcTitle,
					 String chcDesc,String chcCreateBy,Integer chcCreateId){
		this.chcCustName=chcCustName;
		this.chcSource=chcSource;
		this.chcRate=chcRate;
		this.chcLinkman=chcLinkman;
		this.chcTel=chcTel;
		this.chcTitle=chcTitle;
		this.chcDesc=chcDesc;
		this.chcCreateBy=chcCreateBy;
		this.chcCreateId=chcCreateId;
	}


	public SalChance(String chcCustName,String chcSource,Integer chcRate,
					 String chcLinkman,String chcTel,String chcTitle,
					 String chcDesc,String chcCreateBy,Integer chcCreateId,
					 Integer chcDueId,String chcDueTo,Date chcDueDate,Integer chcStatus){
		this.chcCustName=chcCustName;
		this.chcSource=chcSource;
		this.chcRate=chcRate;
		this.chcLinkman=chcLinkman;
		this.chcTel=chcTel;
		this.chcTitle=chcTitle;
		this.chcDesc=chcDesc;
		this.chcCreateBy=chcCreateBy;
		this.chcCreateId=chcCreateId;
		this.chcDueId=chcDueId;
		this.chcDueTo=chcDueTo;
		this.chcDueDate=chcDueDate;
		this.chcStatus=chcStatus;
	}

	public SalChance(Integer chcDueId,String chcDueTo,Date chcDueDate,Integer chcStatus){
		this.chcDueId=chcDueId;
		this.chcDueTo=chcDueTo;
		this.chcDueDate=chcDueDate;
		this.chcStatus=chcStatus;
	}

}
