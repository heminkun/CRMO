package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstLostQuery;
import com.hmk.crmdoem.entity.po.CstLost;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstLostService {

	/**
	 * 根据条件查询列表
	 */
	List<CstLost> findListByParam(CstLostQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstLostQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstLost> findListByPage(CstLostQuery param);

	/**
	 * 新增
	 */
	Integer add(CstLost bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstLost> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstLost> listBean);

	/**
	 * 根据LstId查询对象
	 */
	CstLost getCstLostByLstId(Integer lstId);


	/**
	 * 根据LstId修改
	 */
	Integer updateCstLostByLstId(CstLost bean,Integer lstId);


	/**
	 * 根据LstId删除
	 */
	Integer deleteCstLostByLstId(Integer lstId);
	Integer updateLstCustManagerNameByLstCustManagerId(String name,Integer id);
}