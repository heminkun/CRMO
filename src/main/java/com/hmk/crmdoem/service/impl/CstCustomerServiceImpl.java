package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstCustomerQuery;
import com.hmk.crmdoem.entity.po.CstCustomer;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstCustomerMapper;
import com.hmk.crmdoem.service.CstCustomerService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstCustomerService")
public class CstCustomerServiceImpl implements CstCustomerService {

	@Resource
	private CstCustomerMapper<CstCustomer,CstCustomerQuery> cstCustomerMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstCustomer> findListByParam(CstCustomerQuery param) {
		return this.cstCustomerMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstCustomerQuery param) {
		return this.cstCustomerMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstCustomer> findListByPage(CstCustomerQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstCustomer> list = this.findListByParam(param);
		PaginationResultVO<CstCustomer> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstCustomer bean){
		return this.cstCustomerMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstCustomer> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstCustomerMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstCustomer> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstCustomerMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据CustNo获取对象
	 */
	@Override
	public CstCustomer getCstCustomerByCustNo(String custNo){
		return this.cstCustomerMapper.selectByCustNo(custNo);
	}

	/**
	 * 根据CustNo修改
	 */
	@Override
	public Integer updateCstCustomerByCustNo(CstCustomer bean,String custNo){
		return this.cstCustomerMapper.updateByCustNo(bean,custNo);
	}

	/**
	 * 根据CustNo删除
	 */
	@Override
	public Integer deleteCstCustomerByCustNo(String custNo){
		return this.cstCustomerMapper.deleteByCustNo(custNo);
	}

	@Override
	public Integer updateCustManagerNameByCustManagerId(String name, Integer id) {
		return this.cstCustomerMapper.updateCustManagerNameByCustManagerId(name,id);
	}
}