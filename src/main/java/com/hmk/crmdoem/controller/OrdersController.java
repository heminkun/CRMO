package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.OrdersQuery;
import com.hmk.crmdoem.entity.po.Orders;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.OrdersService;
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
@RestController("ordersController")
@RequestMapping("orders")
@CrossOrigin
public class OrdersController extends ABaseController{

	@Resource
	private OrdersService ordersService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(OrdersQuery query){
		return getSuccessResponseVO(ordersService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(Orders bean) {
		ordersService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Orders> listBean) {
		ordersService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Orders> listBean) {
		ordersService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据OdrId查询对象
	 */
	@RequestMapping("getOrdersByOdrId")
	public ResponseVO getOrdersByOdrId(Integer odrId) {
		return getSuccessResponseVO(ordersService.getOrdersByOdrId(odrId));
	}

	/**
	 * 根据OdrId修改对象
	 */
	@RequestMapping("updateOrdersByOdrId")
	public ResponseVO updateOrdersByOdrId(Orders bean,Integer odrId) {
		ordersService.updateOrdersByOdrId(bean,odrId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据OdrId删除
	 */
	@RequestMapping("deleteOrdersByOdrId")
	public ResponseVO deleteOrdersByOdrId(Integer odrId) {
		ordersService.deleteOrdersByOdrId(odrId);
		return getSuccessResponseVO(null);
	}
}