package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface CstServiceTypeMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据CstId更新
	 */
	 Integer updateByCstId(@Param("bean") T t,@Param("cstId") Integer cstId);


	/**
	 * 根据CstId删除
	 */
	 Integer deleteByCstId(@Param("cstId") Integer cstId);


	/**
	 * 根据CstId获取对象
	 */
	 T selectByCstId(@Param("cstId") Integer cstId);

	 List<T>selectAll();
}
