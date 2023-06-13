package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface CstLinkmanMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据LkmId更新
	 */
	 Integer updateByLkmId(@Param("bean") T t,@Param("lkmId") Integer lkmId);


	/**
	 * 根据LkmId删除
	 */
	 Integer deleteByLkmId(@Param("lkmId") Integer lkmId);


	/**
	 * 根据LkmId获取对象
	 */
	 T selectByLkmId(@Param("lkmId") Integer lkmId);

	 Integer deleteByLkmCustNoInteger(String ikmCustNo);
}
