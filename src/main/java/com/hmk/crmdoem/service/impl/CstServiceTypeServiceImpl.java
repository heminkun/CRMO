package com.hmk.crmdoem.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.hmk.crmdoem.entity.po.Echarts;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CstServiceTypeQuery;
import com.hmk.crmdoem.entity.po.CstServiceType;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CstServiceTypeMapper;
import com.hmk.crmdoem.service.CstServiceTypeService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("cstServiceTypeService")
public class CstServiceTypeServiceImpl implements CstServiceTypeService {

	@Resource
	private CstServiceTypeMapper<CstServiceType,CstServiceTypeQuery> cstServiceTypeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<CstServiceType> findListByParam(CstServiceTypeQuery param) {
		return this.cstServiceTypeMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CstServiceTypeQuery param) {
		return this.cstServiceTypeMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<CstServiceType> findListByPage(CstServiceTypeQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<CstServiceType> list = this.findListByParam(param);
		PaginationResultVO<CstServiceType> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(CstServiceType bean){
		return this.cstServiceTypeMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<CstServiceType> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstServiceTypeMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<CstServiceType> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.cstServiceTypeMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据CstId获取对象
	 */
	@Override
	public CstServiceType getCstServiceTypeByCstId(Integer cstId){
		return this.cstServiceTypeMapper.selectByCstId(cstId);
	}

	/**
	 * 根据CstId修改
	 */
	@Override
	public Integer updateCstServiceTypeByCstId(CstServiceType bean,Integer cstId){
		return this.cstServiceTypeMapper.updateByCstId(bean,cstId);
	}

	/**
	 * 根据CstId删除
	 */
	@Override
	public Integer deleteCstServiceTypeByCstId(Integer cstId){
		return this.cstServiceTypeMapper.deleteByCstId(cstId);
	}

	@Override
	public List<Echarts> selectAll() {
		List<CstServiceType> cstServiceTypes = cstServiceTypeMapper.selectAll();
		List<Echarts> echartsList=new ArrayList<>();
		for (CstServiceType cstServiceType : cstServiceTypes) {
			Echarts echarts=new Echarts();
			echarts.setName(cstServiceType.getCstServiceType());
			echarts.setValue(Integer.parseInt(cstServiceType.getCstAmount()));
			echartsList.add(echarts);
		}
		return echartsList;
	}
}