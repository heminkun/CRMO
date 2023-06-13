package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.ContributeQuery;
import com.hmk.crmdoem.entity.po.Contribute;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface ContributeService {

	/**
	 * 根据条件查询列表
	 */
	List<Contribute> findListByParam(ContributeQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ContributeQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Contribute> findListByPage(ContributeQuery param);

	/**
	 * 新增
	 */
	Integer add(Contribute bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Contribute> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Contribute> listBean);

	/**
	 * 根据Id查询对象
	 */
	Contribute getContributeById(Integer id);


	/**
	 * 根据Id修改
	 */
	Integer updateContributeById(Contribute bean,Integer id);


	/**
	 * 根据Id删除
	 */
	Integer deleteContributeById(Integer id);

}