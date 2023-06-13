package com.hmk.crmdoem.mappers;

import com.hmk.crmdoem.entity.po.SalPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface SalPlanMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PlaId更新
	 */
	 Integer updateByPlaId(@Param("bean") T t,@Param("plaId") Integer plaId);


	/**
	 * 根据PlaId删除
	 */
	 Integer deleteByPlaId(@Param("plaId") Integer plaId);


	/**
	 * 根据PlaId获取对象
	 */
	 T selectByPlaId(@Param("plaId") Integer plaId);


}
