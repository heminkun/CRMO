package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysRoleQuery;
import com.hmk.crmdoem.entity.po.SysRole;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SysRoleService {

	/**
	 * 根据条件查询列表
	 */
	List<SysRole> findListByParam(SysRoleQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SysRoleQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SysRole> findListByPage(SysRoleQuery param);

	/**
	 * 新增
	 */
	Integer add(SysRole bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SysRole> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SysRole> listBean);

	/**
	 * 根据RoleId查询对象
	 */
	SysRole getSysRoleByRoleId(Integer roleId);


	/**
	 * 根据RoleId修改
	 */
	Integer updateSysRoleByRoleId(SysRole bean,Integer roleId);


	/**
	 * 根据RoleId删除
	 */
	Integer deleteSysRoleByRoleId(Integer roleId);

}