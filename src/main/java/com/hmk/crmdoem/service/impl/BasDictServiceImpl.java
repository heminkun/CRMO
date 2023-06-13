package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.BasDictQuery;
import com.hmk.crmdoem.entity.po.BasDict;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.BasDictMapper;
import com.hmk.crmdoem.service.BasDictService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("basDictService")
public class BasDictServiceImpl implements BasDictService {

	@Resource
	private BasDictMapper<BasDict,BasDictQuery> basDictMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<BasDict> findListByParam(BasDictQuery param) {
		return this.basDictMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(BasDictQuery param) {
		return this.basDictMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<BasDict> findListByPage(BasDictQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<BasDict> list = this.findListByParam(param);
		PaginationResultVO<BasDict> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(BasDict bean){
		return this.basDictMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<BasDict> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.basDictMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<BasDict> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.basDictMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据DictId获取对象
	 */
	@Override
	public BasDict getBasDictByDictId(Integer dictId){
		return this.basDictMapper.selectByDictId(dictId);
	}

	/**
	 * 根据DictId修改
	 */
	@Override
	public Integer updateBasDictByDictId(BasDict bean,Integer dictId){
		return this.basDictMapper.updateByDictId(bean,dictId);
	}

	/**
	 * 根据DictId删除
	 */
	@Override
	public Integer deleteBasDictByDictId(Integer dictId){
		return this.basDictMapper.deleteByDictId(dictId);
	}
}