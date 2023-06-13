package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.OrdersQuery;
import com.hmk.crmdoem.entity.po.Orders;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface OrdersService {

	/**
	 * 根据条件查询列表
	 */
	List<Orders> findListByParam(OrdersQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(OrdersQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Orders> findListByPage(OrdersQuery param);

	/**
	 * 新增
	 */
	Integer add(Orders bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Orders> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Orders> listBean);

	/**
	 * 根据OdrId查询对象
	 */
	Orders getOrdersByOdrId(Integer odrId);


	/**
	 * 根据OdrId修改
	 */
	Integer updateOrdersByOdrId(Orders bean,Integer odrId);


	/**
	 * 根据OdrId删除
	 */
	Integer deleteOrdersByOdrId(Integer odrId);

}