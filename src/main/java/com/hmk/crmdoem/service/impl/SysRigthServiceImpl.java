package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SysRigthQuery;
import com.hmk.crmdoem.entity.po.SysRigth;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SysRigthMapper;
import com.hmk.crmdoem.service.SysRigthService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("sysRigthService")
public class SysRigthServiceImpl implements SysRigthService {

	@Resource
	private SysRigthMapper<SysRigth,SysRigthQuery> sysRigthMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysRigth> findListByParam(SysRigthQuery param) {
		return this.sysRigthMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SysRigthQuery param) {
		return this.sysRigthMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SysRigth> findListByPage(SysRigthQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SysRigth> list = this.findListByParam(param);
		PaginationResultVO<SysRigth> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SysRigth bean){
		return this.sysRigthMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SysRigth> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRigthMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SysRigth> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysRigthMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据RightId获取对象
	 */
	@Override
	public SysRigth getSysRigthByRightId(Integer rightId){
		return this.sysRigthMapper.selectByRightId(rightId);
	}

	/**
	 * 根据RightId修改
	 */
	@Override
	public Integer updateSysRigthByRightId(SysRigth bean,Integer rightId){
		return this.sysRigthMapper.updateByRightId(bean,rightId);
	}

	/**
	 * 根据RightId删除
	 */
	@Override
	public Integer deleteSysRigthByRightId(Integer rightId){
		return this.sysRigthMapper.deleteByRightId(rightId);
	}
}