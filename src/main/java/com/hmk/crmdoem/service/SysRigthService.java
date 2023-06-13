package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysRigthQuery;
import com.hmk.crmdoem.entity.po.SysRigth;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SysRigthService {

	/**
	 * 根据条件查询列表
	 */
	List<SysRigth> findListByParam(SysRigthQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SysRigthQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SysRigth> findListByPage(SysRigthQuery param);

	/**
	 * 新增
	 */
	Integer add(SysRigth bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SysRigth> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SysRigth> listBean);

	/**
	 * 根据RightId查询对象
	 */
	SysRigth getSysRigthByRightId(Integer rightId);


	/**
	 * 根据RightId修改
	 */
	Integer updateSysRigthByRightId(SysRigth bean,Integer rightId);


	/**
	 * 根据RightId删除
	 */
	Integer deleteSysRigthByRightId(Integer rightId);

}