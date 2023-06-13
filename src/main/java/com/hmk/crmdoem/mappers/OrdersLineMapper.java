package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface OrdersLineMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据OddId更新
	 */
	 Integer updateByOddId(@Param("bean") T t,@Param("oddId") Integer oddId);


	/**
	 * 根据OddId删除
	 */
	 Integer deleteByOddId(@Param("oddId") Integer oddId);


	/**
	 * 根据OddId获取对象
	 */
	 T selectByOddId(@Param("oddId") Integer oddId);


}
