package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstCustomerQuery;
import com.hmk.crmdoem.entity.po.CstCustomer;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstCustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 
 *  Controller
 * 
 */
@RestController("cstCustomerController")
@RequestMapping("cstCustomer")
@CrossOrigin
public class CstCustomerController extends ABaseController{

	@Resource
	private CstCustomerService cstCustomerService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstCustomerQuery query){
		return getSuccessResponseVO(cstCustomerService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(CstCustomer bean) {
		cstCustomerService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstCustomer> listBean) {
		cstCustomerService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstCustomer> listBean) {
		cstCustomerService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CustNo查询对象
	 */
	@RequestMapping("getCstCustomerByCustNo")
	public ResponseVO getCstCustomerByCustNo(String custNo) {
		return getSuccessResponseVO(cstCustomerService.getCstCustomerByCustNo(custNo));
	}

	/**
	 * 根据CustNo修改对象
	 */
	@RequestMapping("updateCstCustomerByCustNo")
	public ResponseVO updateCstCustomerByCustNo(CstCustomer bean,String custNo) {
		cstCustomerService.updateCstCustomerByCustNo(bean,custNo);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("updateCstCustomerByCustNo2")
	public ResponseVO updateCstCustomerByCustNo2(@RequestBody CstCustomer bean) {
		cstCustomerService.updateCstCustomerByCustNo(bean,bean.getCustNo());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CustNo删除
	 */
	@RequestMapping("deleteCstCustomerByCustNo")
	public ResponseVO deleteCstCustomerByCustNo(String custNo) {
		cstCustomerService.deleteCstCustomerByCustNo(custNo);
		return getSuccessResponseVO(null);
	}
}