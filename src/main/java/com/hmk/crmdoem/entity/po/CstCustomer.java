package com.hmk.crmdoem.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 * 
 * 
 */
public class CstCustomer implements Serializable {


	/**
	 * 
	 */
	private String custNo;

	/**
	 * 
	 */
	private String custName;

	/**
	 * 
	 */
	private String custRegion;

	/**
	 * 
	 */
	private Integer custManagerId;

	/**
	 * 
	 */
	private String custManagerName;

	/**
	 * 
	 */
	private Integer custLevel;

	/**
	 * 
	 */
	private Integer custSatisfy;

	/**
	 * 
	 */
	private Integer custCredit;

	/**
	 * 
	 */
	private String custAddr;

	/**
	 * 
	 */
	private String custZip;

	/**
	 * 
	 */
	private String custTel;
	/**
	 * 
	 */
	private String custFax;
	/**
	 * 
	 */
	private String custWebsite;

	/**
	 * 
	 */
	private String custLicenceNo;

	/**
	 * 
	 */
	private String custChieftain;

	/**
	 * 
	 */
	private Integer custBankroll;

	/**
	 * 
	 */
	private Integer custTurnover;

	/**
	 * 
	 */
	private String custBank;

	/**
	 * 
	 */
	private String custBankAccount;

	/**
	 * 
	 */
	private String custLocalTaxNo;

	/**
	 * 
	 */
	private String custNationalTaxNo;

	/**
	 * 
	 */
	private String custStatus;


	public void setCustNo(String custNo){
		this.custNo = custNo;
	}

	public String getCustNo(){
		return this.custNo;
	}

	public void setCustName(String custName){
		this.custName = custName;
	}

	public String getCustName(){
		return this.custName;
	}

	public void setCustRegion(String custRegion){
		this.custRegion = custRegion;
	}

	public String getCustRegion(){
		return this.custRegion;
	}

	public void setCustManagerId(Integer custManagerId){
		this.custManagerId = custManagerId;
	}

	public Integer getCustManagerId(){
		return this.custManagerId;
	}

	public void setCustManagerName(String custManagerName){
		this.custManagerName = custManagerName;
	}

	public String getCustManagerName(){
		return this.custManagerName;
	}

	public void setCustLevel(Integer custLevel){
		this.custLevel = custLevel;
	}

	public Integer getCustLevel(){
		return this.custLevel;
	}

	public void setCustSatisfy(Integer custSatisfy){
		this.custSatisfy = custSatisfy;
	}

	public Integer getCustSatisfy(){
		return this.custSatisfy;
	}

	public void setCustCredit(Integer custCredit){
		this.custCredit = custCredit;
	}

	public Integer getCustCredit(){
		return this.custCredit;
	}

	public void setCustAddr(String custAddr){
		this.custAddr = custAddr;
	}

	public String getCustAddr(){
		return this.custAddr;
	}

	public void setCustZip(String custZip){
		this.custZip = custZip;
	}

	public String getCustZip(){
		return this.custZip;
	}

	public void setCustTel(String custTel){
		this.custTel = custTel;
	}

	public String getCustTel(){
		return this.custTel;
	}

	public void setCustFax(String custFax){
		this.custFax = custFax;
	}

	public String getCustFax(){
		return this.custFax;
	}

	public void setCustWebsite(String custWebsite){
		this.custWebsite = custWebsite;
	}

	public String getCustWebsite(){
		return this.custWebsite;
	}

	public void setCustLicenceNo(String custLicenceNo){
		this.custLicenceNo = custLicenceNo;
	}

	public String getCustLicenceNo(){
		return this.custLicenceNo;
	}

	public void setCustChieftain(String custChieftain){
		this.custChieftain = custChieftain;
	}

	public String getCustChieftain(){
		return this.custChieftain;
	}

	public void setCustBankroll(Integer custBankroll){
		this.custBankroll = custBankroll;
	}

	public Integer getCustBankroll(){
		return this.custBankroll;
	}

	public void setCustTurnover(Integer custTurnover){
		this.custTurnover = custTurnover;
	}

	public Integer getCustTurnover(){
		return this.custTurnover;
	}

	public void setCustBank(String custBank){
		this.custBank = custBank;
	}

	public String getCustBank(){
		return this.custBank;
	}

	public void setCustBankAccount(String custBankAccount){
		this.custBankAccount = custBankAccount;
	}

	public String getCustBankAccount(){
		return this.custBankAccount;
	}

	public void setCustLocalTaxNo(String custLocalTaxNo){
		this.custLocalTaxNo = custLocalTaxNo;
	}

	public String getCustLocalTaxNo(){
		return this.custLocalTaxNo;
	}

	public void setCustNationalTaxNo(String custNationalTaxNo){
		this.custNationalTaxNo = custNationalTaxNo;
	}

	public String getCustNationalTaxNo(){
		return this.custNationalTaxNo;
	}

	public void setCustStatus(String custStatus){
		this.custStatus = custStatus;
	}

	public String getCustStatus(){
		return this.custStatus;
	}

	@Override
	public String toString (){
		return "custNo:"+(custNo == null ? "空" : custNo)+"，custName:"+(custName == null ? "空" : custName)+"，custRegion:"+(custRegion == null ? "空" : custRegion)+"，custManagerId:"+(custManagerId == null ? "空" : custManagerId)+"，custManagerName:"+(custManagerName == null ? "空" : custManagerName)+"，custLevel:"+(custLevel == null ? "空" : custLevel)+"，custSatisfy:"+(custSatisfy == null ? "空" : custSatisfy)+"，custCredit:"+(custCredit == null ? "空" : custCredit)+"，custAddr:"+(custAddr == null ? "空" : custAddr)+"，custZip:"+(custZip == null ? "空" : custZip)+"，custTel:"+(custTel == null ? "空" : custTel)+"，custFax:"+(custFax == null ? "空" : custFax)+"，custWebsite:"+(custWebsite == null ? "空" : custWebsite)+"，custLicenceNo:"+(custLicenceNo == null ? "空" : custLicenceNo)+"，custChieftain:"+(custChieftain == null ? "空" : custChieftain)+"，custBankroll:"+(custBankroll == null ? "空" : custBankroll)+"，custTurnover:"+(custTurnover == null ? "空" : custTurnover)+"，custBank:"+(custBank == null ? "空" : custBank)+"，custBankAccount:"+(custBankAccount == null ? "空" : custBankAccount)+"，custLocalTaxNo:"+(custLocalTaxNo == null ? "空" : custLocalTaxNo)+"，custNationalTaxNo:"+(custNationalTaxNo == null ? "空" : custNationalTaxNo)+"，custStatus:"+(custStatus == null ? "空" : custStatus);
	}
}
