package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstLinkmanQuery;
import com.hmk.crmdoem.entity.po.CstLinkman;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstLinkmanService {

	/**
	 * 根据条件查询列表
	 */
	List<CstLinkman> findListByParam(CstLinkmanQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstLinkmanQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstLinkman> findListByPage(CstLinkmanQuery param);

	/**
	 * 新增
	 */
	Integer add(CstLinkman bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstLinkman> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstLinkman> listBean);

	/**
	 * 根据LkmId查询对象
	 */
	CstLinkman getCstLinkmanByLkmId(Integer lkmId);


	/**
	 * 根据LkmId修改
	 */
	Integer updateCstLinkmanByLkmId(CstLinkman bean,Integer lkmId);


	/**
	 * 根据LkmId删除
	 */
	Integer deleteCstLinkmanByLkmId(Integer lkmId);

}