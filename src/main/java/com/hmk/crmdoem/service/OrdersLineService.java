package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.OrdersLineQuery;
import com.hmk.crmdoem.entity.po.OrdersLine;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface OrdersLineService {

	/**
	 * 根据条件查询列表
	 */
	List<OrdersLine> findListByParam(OrdersLineQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(OrdersLineQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<OrdersLine> findListByPage(OrdersLineQuery param);

	/**
	 * 新增
	 */
	Integer add(OrdersLine bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<OrdersLine> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<OrdersLine> listBean);

	/**
	 * 根据OddId查询对象
	 */
	OrdersLine getOrdersLineByOddId(Integer oddId);


	/**
	 * 根据OddId修改
	 */
	Integer updateOrdersLineByOddId(OrdersLine bean,Integer oddId);


	/**
	 * 根据OddId删除
	 */
	Integer deleteOrdersLineByOddId(Integer oddId);

}