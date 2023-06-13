package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysUserQuery;
import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SysUserService {

	/**
	 * 根据条件查询列表
	 */
	List<SysUser> findListByParam(SysUserQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SysUserQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SysUser> findListByPage(SysUserQuery param);

	/**
	 * 新增
	 */
	Integer add(SysUser bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SysUser> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SysUser> listBean);

	/**
	 * 根据UserId查询对象
	 */
	SysUser getSysUserByUserId(Integer userId);


	/**
	 * 根据UserId修改
	 */
	Integer updateSysUserByUserId(SysUser bean,Integer userId);


	/**
	 * 根据UserId删除
	 */
	Integer deleteSysUserByUserId(Integer userId);

	String selectLogin(String text, String password);

	Integer updateByUserNameEmail(Integer id,String userEmail,String userName);

	SysUser selectByUserEmail(String userEmail);

	Integer updateEmailByEmail(String oldEmail,String newEmail);

	SysUser selectPasswordByEmail(String email,String password);

	Integer updatePasswordByEmail(String email,String newPassword);
	Integer selectUserIdByEmail(String email);
	Integer validateEmail(String email);
}