package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstLostQuery;
import com.hmk.crmdoem.entity.po.CstLost;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstLostMapper;
import com.hmk.crmdoem.service.CstLostService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstLostService")
public class CstLostServiceImpl implements CstLostService {

	@Resource
	private CstLostMapper<CstLost,CstLostQuery> cstLostMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstLost> findListByParam(CstLostQuery param) {
		return this.cstLostMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstLostQuery param) {
		return this.cstLostMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstLost> findListByPage(CstLostQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstLost> list = this.findListByParam(param);
		PaginationResultVO<CstLost> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstLost bean){
		return this.cstLostMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstLost> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLostMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstLost> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLostMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据LstId获取对象
	 */
	@Override
	public CstLost getCstLostByLstId(Integer lstId){
		return this.cstLostMapper.selectByLstId(lstId);
	}

	/**
	 * 根据LstId修改
	 */
	@Override
	public Integer updateCstLostByLstId(CstLost bean,Integer lstId){
		return this.cstLostMapper.updateByLstId(bean,lstId);
	}

	/**
	 * 根据LstId删除
	 */
	@Override
	public Integer deleteCstLostByLstId(Integer lstId){
		return this.cstLostMapper.deleteByLstId(lstId);
	}

	@Override
	public Integer updateLstCustManagerNameByLstCustManagerId(String name, Integer id) {
		return this.cstLostMapper.updateLstCustManagerNameByLstCustManagerId(name,id);
	}


}