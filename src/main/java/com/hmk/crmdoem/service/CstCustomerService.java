package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstCustomerQuery;
import com.hmk.crmdoem.entity.po.CstCustomer;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstCustomerService {

	/**
	 * 根据条件查询列表
	 */
	List<CstCustomer> findListByParam(CstCustomerQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstCustomerQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstCustomer> findListByPage(CstCustomerQuery param);

	/**
	 * 新增
	 */
	Integer add(CstCustomer bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstCustomer> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstCustomer> listBean);

	/**
	 * 根据CustNo查询对象
	 */
	CstCustomer getCstCustomerByCustNo(String custNo);


	/**
	 * 根据CustNo修改
	 */
	Integer updateCstCustomerByCustNo(CstCustomer bean,String custNo);


	/**
	 * 根据CustNo删除
	 */
	Integer deleteCstCustomerByCustNo(String custNo);
	Integer updateCustManagerNameByCustManagerId(String name,Integer id);
}