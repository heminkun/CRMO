package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.po.Echarts;
import com.hmk.crmdoem.entity.query.CstServiceTypeQuery;
import com.hmk.crmdoem.entity.po.CstServiceType;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstServiceTypeService {

	/**
	 * 根据条件查询列表
	 */
	List<CstServiceType> findListByParam(CstServiceTypeQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstServiceTypeQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstServiceType> findListByPage(CstServiceTypeQuery param);

	/**
	 * 新增
	 */
	Integer add(CstServiceType bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstServiceType> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstServiceType> listBean);

	/**
	 * 根据CstId查询对象
	 */
	CstServiceType getCstServiceTypeByCstId(Integer cstId);


	/**
	 * 根据CstId修改
	 */
	Integer updateCstServiceTypeByCstId(CstServiceType bean,Integer cstId);


	/**
	 * 根据CstId删除
	 */
	Integer deleteCstServiceTypeByCstId(Integer cstId);

	List<Echarts>selectAll();
}