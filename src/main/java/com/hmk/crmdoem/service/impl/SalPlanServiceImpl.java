package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SalPlanQuery;
import com.hmk.crmdoem.entity.po.SalPlan;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SalPlanMapper;
import com.hmk.crmdoem.service.SalPlanService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("salPlanService")
public class SalPlanServiceImpl implements SalPlanService {

	@Resource
	private SalPlanMapper<SalPlan,SalPlanQuery> salPlanMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SalPlan> findListByParam(SalPlanQuery param) {
		return this.salPlanMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SalPlanQuery param) {
		return this.salPlanMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SalPlan> findListByPage(SalPlanQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SalPlan> list = this.findListByParam(param);
		PaginationResultVO<SalPlan> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SalPlan bean){
		return this.salPlanMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SalPlan> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.salPlanMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SalPlan> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.salPlanMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据PlaId获取对象
	 */
	@Override
	public SalPlan getSalPlanByPlaId(Integer plaId){
		return this.salPlanMapper.selectByPlaId(plaId);
	}

	/**
	 * 根据PlaId修改
	 */
	@Override
	public Integer updateSalPlanByPlaId(SalPlan bean,Integer plaId){
		return this.salPlanMapper.updateByPlaId(bean,plaId);
	}

	/**
	 * 根据PlaId删除
	 */
	@Override
	public Integer deleteSalPlanByPlaId(Integer plaId){
		return this.salPlanMapper.deleteByPlaId(plaId);
	}
}