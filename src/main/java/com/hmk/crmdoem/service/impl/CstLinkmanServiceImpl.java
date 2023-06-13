package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstLinkmanQuery;
import com.hmk.crmdoem.entity.po.CstLinkman;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstLinkmanMapper;
import com.hmk.crmdoem.service.CstLinkmanService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstLinkmanService")
public class CstLinkmanServiceImpl implements CstLinkmanService {

	@Resource
	private CstLinkmanMapper<CstLinkman,CstLinkmanQuery> cstLinkmanMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstLinkman> findListByParam(CstLinkmanQuery param) {
		return this.cstLinkmanMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstLinkmanQuery param) {
		return this.cstLinkmanMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstLinkman> findListByPage(CstLinkmanQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstLinkman> list = this.findListByParam(param);
		PaginationResultVO<CstLinkman> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstLinkman bean){
		return this.cstLinkmanMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstLinkman> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLinkmanMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstLinkman> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLinkmanMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据LkmId获取对象
	 */
	@Override
	public CstLinkman getCstLinkmanByLkmId(Integer lkmId){
		return this.cstLinkmanMapper.selectByLkmId(lkmId);
	}

	/**
	 * 根据LkmId修改
	 */
	@Override
	public Integer updateCstLinkmanByLkmId(CstLinkman bean,Integer lkmId){
		return this.cstLinkmanMapper.updateByLkmId(bean,lkmId);
	}

	/**
	 * 根据LkmId删除
	 */
	@Override
	public Integer deleteCstLinkmanByLkmId(Integer lkmId){
		return this.cstLinkmanMapper.deleteByLkmId(lkmId);
	}
}