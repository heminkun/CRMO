package com.hmk.crmdoem.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.hmk.crmdoem.entity.po.Echarts;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstLevelQuery;
import com.hmk.crmdoem.entity.po.CstLevel;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstLevelMapper;
import com.hmk.crmdoem.service.CstLevelService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstLevelService")
public class CstLevelServiceImpl implements CstLevelService {

	@Resource
	private CstLevelMapper<CstLevel,CstLevelQuery> cstLevelMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstLevel> findListByParam(CstLevelQuery param) {
		return this.cstLevelMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstLevelQuery param) {
		return this.cstLevelMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstLevel> findListByPage(CstLevelQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstLevel> list = this.findListByParam(param);
		PaginationResultVO<CstLevel> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstLevel bean){
		return this.cstLevelMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstLevel> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLevelMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstLevel> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstLevelMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据CustLevelId获取对象
	 */
	@Override
	public CstLevel getCstLevelByCustLevelId(Integer custLevelId){
		return this.cstLevelMapper.selectByCustLevelId(custLevelId);
	}

	/**
	 * 根据CustLevelId修改
	 */
	@Override
	public Integer updateCstLevelByCustLevelId(CstLevel bean,Integer custLevelId){
		return this.cstLevelMapper.updateByCustLevelId(bean,custLevelId);
	}

	/**
	 * 根据CustLevelId删除
	 */
	@Override
	public Integer deleteCstLevelByCustLevelId(Integer custLevelId){
		return this.cstLevelMapper.deleteByCustLevelId(custLevelId);
	}

	@Override
	public List<Echarts> selectAll() {
		List<CstLevel> cstLevels = cstLevelMapper.selectAll();
		List<Echarts> echartsList= new ArrayList<>();
		for (CstLevel cstLevel : cstLevels) {
			Echarts echarts=new Echarts();
			echarts.setName(cstLevel.getCustLevelName());
			echarts.setValue(cstLevel.getCustAmount());
			echartsList.add(echarts);
		}
		return echartsList;
	}
}