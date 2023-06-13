package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstServiceQuery;
import com.hmk.crmdoem.entity.po.CstService;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface CstServiceService {

	/**
	 * 根据条件查询列表
	 */
	List<CstService> findListByParam(CstServiceQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CstServiceQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CstService> findListByPage(CstServiceQuery param);

	/**
	 * 新增
	 */
	Integer add(CstService bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<CstService> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<CstService> listBean);

	/**
	 * 根据SvrId查询对象
	 */
	CstService getCstServiceBySvrId(Integer svrId);


	/**
	 * 根据SvrId修改
	 */
	Integer updateCstServiceBySvrId(CstService bean,Integer svrId);

	Integer updateCstServiceSvrDealBySvrId(CstService bean,Integer svrId);
	Integer updateCstServiceBySvrId2(CstService bean,Integer svrId);
	/**
	 * 根据SvrId删除
	 */
	Integer deleteCstServiceBySvrId(Integer svrId);

	Integer updateSvrCreateByUserId(Integer id,String name);
	Integer updateSvrDeuToByUserId(Integer id,String name);

	Integer updateSvrDealByByUserId(Integer id,String name);
}