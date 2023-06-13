package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.po.Echarts;
import com.hmk.crmdoem.entity.query.CstLevelQuery;
import com.hmk.crmdoem.entity.po.CstLevel;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstLevelService {

	/**
	 * 根据条件查询列表
	 */
	List<CstLevel> findListByParam(CstLevelQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstLevelQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstLevel> findListByPage(CstLevelQuery param);

	/**
	 * 新增
	 */
	Integer add(CstLevel bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstLevel> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstLevel> listBean);

	/**
	 * 根据CustLevelId查询对象
	 */
	CstLevel getCstLevelByCustLevelId(Integer custLevelId);


	/**
	 * 根据CustLevelId修改
	 */
	Integer updateCstLevelByCustLevelId(CstLevel bean,Integer custLevelId);


	/**
	 * 根据CustLevelId删除
	 */
	Integer deleteCstLevelByCustLevelId(Integer custLevelId);

	List<Echarts> selectAll();

}