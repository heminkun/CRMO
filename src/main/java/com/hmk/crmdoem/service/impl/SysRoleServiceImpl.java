package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SysRoleQuery;
import com.hmk.crmdoem.entity.po.SysRole;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SysRoleMapper;
import com.hmk.crmdoem.service.SysRoleService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

	@Resource
	private SysRoleMapper<SysRole,SysRoleQuery> sysRoleMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysRole> findListByParam(SysRoleQuery param) {
		return this.sysRoleMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SysRoleQuery param) {
		return this.sysRoleMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SysRole> findListByPage(SysRoleQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SysRole> list = this.findListByParam(param);
		PaginationResultVO<SysRole> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SysRole bean){
		return this.sysRoleMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SysRole> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRoleMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SysRole> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRoleMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据RoleId获取对象
	 */
	@Override
	public SysRole getSysRoleByRoleId(Integer roleId){
		return this.sysRoleMapper.selectByRoleId(roleId);
	}

	/**
	 * 根据RoleId修改
	 */
	@Override
	public Integer updateSysRoleByRoleId(SysRole bean,Integer roleId){
		return this.sysRoleMapper.updateByRoleId(bean,roleId);
	}

	/**
	 * 根据RoleId删除
	 */
	@Override
	public Integer deleteSysRoleByRoleId(Integer roleId){
		return this.sysRoleMapper.deleteByRoleId(roleId);
	}
}