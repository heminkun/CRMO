package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface OrdersMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据OdrId更新
	 */
	 Integer updateByOdrId(@Param("bean") T t,@Param("odrId") Integer odrId);


	/**
	 * 根据OdrId删除
	 */
	 Integer deleteByOdrId(@Param("odrId") Integer odrId);


	/**
	 * 根据OdrId获取对象
	 */
	 T selectByOdrId(@Param("odrId") Integer odrId);


}
