package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.entity.query.SysUserQuery;
import com.hmk.crmdoem.mappers.SysUserMapper;
import com.hmk.crmdoem.service.SysUserService;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstServiceQuery;
import com.hmk.crmdoem.entity.po.CstService;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstServiceMapper;
import com.hmk.crmdoem.service.CstServiceService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstServiceService")
public class CstServiceServiceImpl implements CstServiceService {

	@Resource
	private CstServiceMapper<CstService,CstServiceQuery> cstServiceMapper;

	@Resource
	private SysUserMapper<SysUser, SysUserQuery> sysUserMapper;
	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstService> findListByParam(CstServiceQuery param) {
		return this.cstServiceMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstServiceQuery param) {
		return this.cstServiceMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstService> findListByPage(CstServiceQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstService> list = this.findListByParam(param);
		PaginationResultVO<CstService> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstService bean){
		return this.cstServiceMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstService> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstServiceMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstService> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstServiceMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据SvrId获取对象
	 */
	@Override
	public CstService getCstServiceBySvrId(Integer svrId){
		return this.cstServiceMapper.selectBySvrId(svrId);
	}

	/**
	 * 根据SvrId修改
	 */
	@Override
	public Integer updateCstServiceBySvrId(CstService bean,Integer svrId){
		return this.cstServiceMapper.updateBySvrId(bean,svrId);
	}

	@Override
	public Integer updateCstServiceSvrDealBySvrId(CstService bean, Integer svrId) {
		return this.cstServiceMapper.updateBySvrId(bean,svrId);
	}

	@Override
	public Integer updateCstServiceBySvrId2(CstService bean,Integer svrId){
		SysUser sysUserByUserId = sysUserMapper.selectByUserId(bean.getSvrDueId());
		bean.setSvrDueTo(sysUserByUserId.getUserName());
		return this.cstServiceMapper.updateBySvrId(bean,svrId);
	}

	/**
	 * 根据SvrId删除
	 */
	@Override
	public Integer deleteCstServiceBySvrId(Integer svrId){
		return this.cstServiceMapper.deleteBySvrId(svrId);
	}

	@Override
	public Integer updateSvrCreateByUserId(Integer id, String name) {
		return this.cstServiceMapper.updateSvrCreateByUserId(id,name);
	}

	@Override
	public Integer updateSvrDeuToByUserId(Integer id, String name) {
		return cstServiceMapper.updateSvrDeuToByUserId(id,name);
	}

	@Override
	public Integer updateSvrDealByByUserId(Integer id, String name) {
		return cstServiceMapper.updateSvrDealByByUserId(id,name);
	}
}