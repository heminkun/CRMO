package com.hmk.crmdoem.controller.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SalChancePojo {

    private Integer chcId;
    private String chcCustName;
    private String chcSource;
    private Integer chcRate;;
    private String chcLinkman;
    private String chcTel;
    private String chcTitle;
    private String chcDesc;
    private String  chcCreateBy;
    private Integer chcCreateId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chcCreateDate;
    private Integer chcDueId;
    private String chcDueTo;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date chcDueDate;
    private Integer chcStatus;
}
