package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.OrdersLineQuery;
import com.hmk.crmdoem.entity.po.OrdersLine;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.OrdersLineMapper;
import com.hmk.crmdoem.service.OrdersLineService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("ordersLineService")
public class OrdersLineServiceImpl implements OrdersLineService {

	@Resource
	private OrdersLineMapper<OrdersLine,OrdersLineQuery> ordersLineMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<OrdersLine> findListByParam(OrdersLineQuery param) {
		return this.ordersLineMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(OrdersLineQuery param) {
		return this.ordersLineMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<OrdersLine> findListByPage(OrdersLineQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<OrdersLine> list = this.findListByParam(param);
		PaginationResultVO<OrdersLine> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(OrdersLine bean){
		return this.ordersLineMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<OrdersLine> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ordersLineMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<OrdersLine> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ordersLineMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据OddId获取对象
	 */
	@Override
	public OrdersLine getOrdersLineByOddId(Integer oddId){
		return this.ordersLineMapper.selectByOddId(oddId);
	}

	/**
	 * 根据OddId修改
	 */
	@Override
	public Integer updateOrdersLineByOddId(OrdersLine bean,Integer oddId){
		return this.ordersLineMapper.updateByOddId(bean,oddId);
	}

	/**
	 * 根据OddId删除
	 */
	@Override
	public Integer deleteOrdersLineByOddId(Integer oddId){
		return this.ordersLineMapper.deleteByOddId(oddId);
	}
}