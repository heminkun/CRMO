package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.BasDictQuery;
import com.hmk.crmdoem.entity.po.BasDict;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface BasDictService {

	/**
	 * 根据条件查询列表
	 */
	List<BasDict> findListByParam(BasDictQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(BasDictQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<BasDict> findListByPage(BasDictQuery param);

	/**
	 * 新增
	 */
	Integer add(BasDict bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<BasDict> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<BasDict> listBean);

	/**
	 * 根据DictId查询对象
	 */
	BasDict getBasDictByDictId(Integer dictId);


	/**
	 * 根据DictId修改
	 */
	Integer updateBasDictByDictId(BasDict bean,Integer dictId);


	/**
	 * 根据DictId删除
	 */
	Integer deleteBasDictByDictId(Integer dictId);

}