package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.StorageQuery;
import com.hmk.crmdoem.entity.po.Storage;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface StorageService {

	/**
	 * 根据条件查询列表
	 */
	List<Storage> findListByParam(StorageQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(StorageQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Storage> findListByPage(StorageQuery param);

	/**
	 * 新增
	 */
	Integer add(Storage bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Storage> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Storage> listBean);

	/**
	 * 根据StkId查询对象
	 */
	Storage getStorageByStkId(Integer stkId);


	/**
	 * 根据StkId修改
	 */
	Integer updateStorageByStkId(Storage bean,Integer stkId);


	/**
	 * 根据StkId删除
	 */
	Integer deleteStorageByStkId(Integer stkId);

}