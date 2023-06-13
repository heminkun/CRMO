package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SalPlanQuery;
import com.hmk.crmdoem.entity.po.SalPlan;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SalPlanService {

	/**
	 * 根据条件查询列表
	 */
	List<SalPlan> findListByParam(SalPlanQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SalPlanQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SalPlan> findListByPage(SalPlanQuery param);

	/**
	 * 新增
	 */
	Integer add(SalPlan bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SalPlan> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SalPlan> listBean);

	/**
	 * 根据PlaId查询对象
	 */
	SalPlan getSalPlanByPlaId(Integer plaId);


	/**
	 * 根据PlaId修改
	 */
	Integer updateSalPlanByPlaId(SalPlan bean,Integer plaId);


	/**
	 * 根据PlaId删除
	 */
	Integer deleteSalPlanByPlaId(Integer plaId);



}