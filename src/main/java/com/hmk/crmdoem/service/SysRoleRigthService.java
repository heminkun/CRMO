package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysRoleRigthQuery;
import com.hmk.crmdoem.entity.po.SysRoleRigth;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SysRoleRigthService {

	/**
	 * 根据条件查询列表
	 */
	List<SysRoleRigth> findListByParam(SysRoleRigthQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SysRoleRigthQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SysRoleRigth> findListByPage(SysRoleRigthQuery param);

	/**
	 * 新增
	 */
	Integer add(SysRoleRigth bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SysRoleRigth> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SysRoleRigth> listBean);
}