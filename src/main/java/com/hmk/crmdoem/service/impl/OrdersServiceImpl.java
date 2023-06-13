package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.OrdersQuery;
import com.hmk.crmdoem.entity.po.Orders;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.OrdersMapper;
import com.hmk.crmdoem.service.OrdersService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersMapper<Orders,OrdersQuery> ordersMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Orders> findListByParam(OrdersQuery param) {
		return this.ordersMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(OrdersQuery param) {
		return this.ordersMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Orders> findListByPage(OrdersQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Orders> list = this.findListByParam(param);
		PaginationResultVO<Orders> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Orders bean){
		return this.ordersMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Orders> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ordersMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Orders> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ordersMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据OdrId获取对象
	 */
	@Override
	public Orders getOrdersByOdrId(Integer odrId){
		return this.ordersMapper.selectByOdrId(odrId);
	}

	/**
	 * 根据OdrId修改
	 */
	@Override
	public Integer updateOrdersByOdrId(Orders bean,Integer odrId){
		return this.ordersMapper.updateByOdrId(bean,odrId);
	}

	/**
	 * 根据OdrId删除
	 */
	@Override
	public Integer deleteOrdersByOdrId(Integer odrId){
		return this.ordersMapper.deleteByOdrId(odrId);
	}
}