package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.hmk.crmdoem.entity.po.CstActivity;
import com.hmk.crmdoem.entity.po.CstCustomer;
import com.hmk.crmdoem.entity.query.CstCustomerQuery;
import com.hmk.crmdoem.mappers.CstCustomerMapper;
import com.hmk.crmdoem.utils.UuidUtil;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SalChanceQuery;
import com.hmk.crmdoem.entity.po.SalChance;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SalChanceMapper;
import com.hmk.crmdoem.service.SalChanceService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("salChanceService")
public class SalChanceServiceImpl implements SalChanceService {

	@Resource
	private SalChanceMapper<SalChance,SalChanceQuery> salChanceMapper;

	@Resource
	CstCustomerMapper<CstCustomer, CstCustomerQuery> customerMapper;


	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SalChance> findListByParam(SalChanceQuery param) {
		return this.salChanceMapper.selectList(param);
	}
	@Override
	public List<SalChance> findListByParam2(SalChanceQuery param) {
		return this.salChanceMapper.selectList2(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SalChanceQuery param) {
		return this.salChanceMapper.selectCount(param);
	}
	@Override
	public Integer findCountByParam2(SalChanceQuery param) {
		return this.salChanceMapper.selectCount2(param);
	}
	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SalChance> findListByPage(SalChanceQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SalChance> list = this.findListByParam(param);
		PaginationResultVO<SalChance> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}
	@Override
	public PaginationResultVO<SalChance> findListByPage2(SalChanceQuery param) {
		int count = this.findCountByParam2(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SalChance> list = this.findListByParam2(param);
		PaginationResultVO<SalChance> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SalChance bean){
		return this.salChanceMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SalChance> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.salChanceMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SalChance> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.salChanceMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据ChcId获取对象
	 */
	@Override
	public SalChance getSalChanceByChcId(Integer chcId){
		return this.salChanceMapper.selectByChcId(chcId);
	}

	/**
	 * 根据ChcId修改
	 */
	@Override
	public Integer updateSalChanceByChcId(SalChance bean,Integer chcId){
		if (bean.getChcStatus()!=null){
			if (bean.getChcStatus()==3){
				SalChance salChance = salChanceMapper.selectByChcId(chcId);
				CstCustomer cstCustomer=new CstCustomer();
				cstCustomer.setCustNo(UuidUtil.getUUID());
				cstCustomer.setCustName(salChance.getChcCustName());
				cstCustomer.setCustManagerId(salChance.getChcDueId());
				cstCustomer.setCustManagerName(salChance.getChcDueTo());
				cstCustomer.setCustTel(salChance.getChcTel());
				Integer insert = customerMapper.insert(cstCustomer);
				if (insert<0){
					return insert;
				}
			}
		}
		return this.salChanceMapper.updateByChcId(bean,chcId);
	}

	/**
	 * 根据ChcId删除
	 */
	@Override
	public Integer deleteSalChanceByChcId(Integer chcId){
		return this.salChanceMapper.deleteByChcId(chcId);
	}

	@Override
	public Integer updateChcCreateByUserId(String username, Integer id) {
		return this.salChanceMapper.updateChcCreateByUserId(username,id);
	}

	@Override
	public Integer updateChcDueToByUserId(String username, Integer id) {
		return this.salChanceMapper.updateChcDueToByUserId(username,id);
	}
}