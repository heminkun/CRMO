package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface StorageMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据StkId更新
	 */
	 Integer updateByStkId(@Param("bean") T t,@Param("stkId") Integer stkId);


	/**
	 * 根据StkId删除
	 */
	 Integer deleteByStkId(@Param("stkId") Integer stkId);


	/**
	 * 根据StkId获取对象
	 */
	 T selectByStkId(@Param("stkId") Integer stkId);


}
