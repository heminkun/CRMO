package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstActivityQuery;
import com.hmk.crmdoem.entity.po.CstActivity;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstActivityMapper;
import com.hmk.crmdoem.service.CstActivityService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstActivityService")
public class CstActivityServiceImpl implements CstActivityService {

	@Resource
	private CstActivityMapper<CstActivity,CstActivityQuery> cstActivityMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstActivity> findListByParam(CstActivityQuery param) {
		return this.cstActivityMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstActivityQuery param) {
		return this.cstActivityMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstActivity> findListByPage(CstActivityQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstActivity> list = this.findListByParam(param);
		PaginationResultVO<CstActivity> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstActivity bean){
		return this.cstActivityMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstActivity> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstActivityMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstActivity> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstActivityMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据AtvId获取对象
	 */
	@Override
	public CstActivity getCstActivityByAtvId(Integer atvId){
		return this.cstActivityMapper.selectByAtvId(atvId);
	}

	/**
	 * 根据AtvId修改
	 */
	@Override
	public Integer updateCstActivityByAtvId(CstActivity bean,Integer atvId){
		return this.cstActivityMapper.updateByAtvId(bean,atvId);
	}

	/**
	 * 根据AtvId删除
	 */
	@Override
	public Integer deleteCstActivityByAtvId(Integer atvId){
		return this.cstActivityMapper.deleteByAtvId(atvId);
	}
}