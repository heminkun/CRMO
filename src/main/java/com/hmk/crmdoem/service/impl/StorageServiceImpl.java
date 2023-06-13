package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.StorageQuery;
import com.hmk.crmdoem.entity.po.Storage;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.StorageMapper;
import com.hmk.crmdoem.service.StorageService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("storageService")
public class StorageServiceImpl implements StorageService {

	@Resource
	private StorageMapper<Storage,StorageQuery> storageMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Storage> findListByParam(StorageQuery param) {
		return this.storageMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(StorageQuery param) {
		return this.storageMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Storage> findListByPage(StorageQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Storage> list = this.findListByParam(param);
		PaginationResultVO<Storage> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Storage bean){
		return this.storageMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Storage> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storageMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Storage> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storageMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据StkId获取对象
	 */
	@Override
	public Storage getStorageByStkId(Integer stkId){
		return this.storageMapper.selectByStkId(stkId);
	}

	/**
	 * 根据StkId修改
	 */
	@Override
	public Integer updateStorageByStkId(Storage bean,Integer stkId){
		return this.storageMapper.updateByStkId(bean,stkId);
	}

	/**
	 * 根据StkId删除
	 */
	@Override
	public Integer deleteStorageByStkId(Integer stkId){
		return this.storageMapper.deleteByStkId(stkId);
	}
}