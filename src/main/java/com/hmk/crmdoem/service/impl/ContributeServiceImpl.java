package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.hmk.crmdoem.mappers.ContributeMapper;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.ContributeQuery;
import com.hmk.crmdoem.entity.po.Contribute;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.service.ContributeService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("contributeService")
public class ContributeServiceImpl implements ContributeService {

	@Resource
	private ContributeMapper<Contribute,ContributeQuery> contributeMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Contribute> findListByParam(ContributeQuery param) {
		return this.contributeMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ContributeQuery param) {
		return this.contributeMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Contribute> findListByPage(ContributeQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Contribute> list = this.findListByParam(param);
		PaginationResultVO<Contribute> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Contribute bean){
		return this.contributeMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Contribute> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.contributeMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Contribute> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.contributeMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public Contribute getContributeById(Integer id){
		return this.contributeMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateContributeById(Contribute bean,Integer id){
		return this.contributeMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteContributeById(Integer id){
		return this.contributeMapper.deleteById(id);
	}
}