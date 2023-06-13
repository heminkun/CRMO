package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SysRoleRigthQuery;
import com.hmk.crmdoem.entity.po.SysRoleRigth;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SysRoleRigthMapper;
import com.hmk.crmdoem.service.SysRoleRigthService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("sysRoleRigthService")
public class SysRoleRigthServiceImpl implements SysRoleRigthService {

	@Resource
	private SysRoleRigthMapper<SysRoleRigth,SysRoleRigthQuery> sysRoleRigthMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysRoleRigth> findListByParam(SysRoleRigthQuery param) {
		return this.sysRoleRigthMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SysRoleRigthQuery param) {
		return this.sysRoleRigthMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SysRoleRigth> findListByPage(SysRoleRigthQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SysRoleRigth> list = this.findListByParam(param);
		PaginationResultVO<SysRoleRigth> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SysRoleRigth bean){
		return this.sysRoleRigthMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SysRoleRigth> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRoleRigthMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SysRoleRigth> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRoleRigthMapper.insertOrUpdateBatch(listBean);
	}
}