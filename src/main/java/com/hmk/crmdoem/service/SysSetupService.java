package com.hmk.crmdoem.service;

import java.util.ArrayList;
import java.util.List;

import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.query.SysSetupQuery;
import com.hmk.crmdoem.entity.po.SysSetup;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface SysSetupService {

	/**
	 * 根据条件查询列表
	 */
	List<SysSetup> findListByParam(SysSetupQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(SysSetupQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<SysSetup> findListByPage(SysSetupQuery param);

	/**
	 * 新增
	 */
	Integer add(SysSetup bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<SysSetup> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<SysSetup> listBean);

	/**
	 * 根据Id查询对象
	 */
	SysSetup getSysSetupById(Integer id);


	/**
	 * 根据Id修改
	 */
	Integer updateSysSetupById(SysSetup bean,Integer id);


	/**
	 * 根据Id删除
	 */
	Integer deleteSysSetupById(Integer id);

	List<Carousel>getSetUpCarousel();

	List<Integer>getSetUp();

	Integer updateSetUpCarousel(Integer[] integers);
}