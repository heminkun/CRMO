package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface CstActivityMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据AtvId更新
	 */
	 Integer updateByAtvId(@Param("bean") T t,@Param("atvId") Integer atvId);


	/**
	 * 根据AtvId删除
	 */
	 Integer deleteByAtvId(@Param("atvId") Integer atvId);


	/**
	 * 根据AtvId获取对象
	 */
	 T selectByAtvId(@Param("atvId") Integer atvId);

	 Integer deleteByAtvCustNoInteger(String atvCustNo);
}
