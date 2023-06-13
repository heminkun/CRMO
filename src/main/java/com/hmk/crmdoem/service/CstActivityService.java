package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstActivityQuery;
import com.hmk.crmdoem.entity.po.CstActivity;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstActivityService {

	/**
	 * 根据条件查询列表
	 */
	List<CstActivity> findListByParam(CstActivityQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstActivityQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstActivity> findListByPage(CstActivityQuery param);

	/**
	 * 新增
	 */
	Integer add(CstActivity bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstActivity> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstActivity> listBean);

	/**
	 * 根据AtvId查询对象
	 */
	CstActivity getCstActivityByAtvId(Integer atvId);


	/**
	 * 根据AtvId修改
	 */
	Integer updateCstActivityByAtvId(CstActivity bean,Integer atvId);


	/**
	 * 根据AtvId删除
	 */
	Integer deleteCstActivityByAtvId(Integer atvId);

}