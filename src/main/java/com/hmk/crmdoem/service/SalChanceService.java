package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SalChanceQuery;
import com.hmk.crmdoem.entity.po.SalChance;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SalChanceService {

	/**
	 * 根据条件查询列表
	 */
	List<SalChance> findListByParam(SalChanceQuery param);
	List<SalChance> findListByParam2(SalChanceQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SalChanceQuery param);
	Integer findCountByParam2(SalChanceQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SalChance> findListByPage(SalChanceQuery param);
	PaginationResultVO<SalChance> findListByPage2(SalChanceQuery param);

	/**
	 * 新增
	 */
	Integer add(SalChance bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SalChance> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SalChance> listBean);

	/**
	 * 根据ChcId查询对象
	 */
	SalChance getSalChanceByChcId(Integer chcId);


	/**
	 * 根据ChcId修改
	 */
	Integer updateSalChanceByChcId(SalChance bean,Integer chcId);


	/**
	 * 根据ChcId删除
	 */
	Integer deleteSalChanceByChcId(Integer chcId);

	Integer updateChcCreateByUserId(String username,Integer id);
	Integer updateChcDueToByUserId(String username,Integer id);
}