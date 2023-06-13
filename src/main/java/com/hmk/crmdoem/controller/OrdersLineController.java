package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.OrdersLineQuery;
import com.hmk.crmdoem.entity.po.OrdersLine;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.OrdersLineService;
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
@RestController("ordersLineController")
@RequestMapping("ordersLine")
@CrossOrigin
public class OrdersLineController extends ABaseController{

	@Resource
	private OrdersLineService ordersLineService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(OrdersLineQuery query){
		return getSuccessResponseVO(ordersLineService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(OrdersLine bean) {
		ordersLineService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<OrdersLine> listBean) {
		ordersLineService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<OrdersLine> listBean) {
		ordersLineService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据OddId查询对象
	 */
	@RequestMapping("getOrdersLineByOddId")
	public ResponseVO getOrdersLineByOddId(Integer oddId) {
		return getSuccessResponseVO(ordersLineService.getOrdersLineByOddId(oddId));
	}

	/**
	 * 根据OddId修改对象
	 */
	@RequestMapping("updateOrdersLineByOddId")
	public ResponseVO updateOrdersLineByOddId(OrdersLine bean,Integer oddId) {
		ordersLineService.updateOrdersLineByOddId(bean,oddId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据OddId删除
	 */
	@RequestMapping("deleteOrdersLineByOddId")
	public ResponseVO deleteOrdersLineByOddId(Integer oddId) {
		ordersLineService.deleteOrdersLineByOddId(oddId);
		return getSuccessResponseVO(null);
	}
}