package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface ProductMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据ProdId更新
	 */
	 Integer updateByProdId(@Param("bean") T t,@Param("prodId") Integer prodId);


	/**
	 * 根据ProdId删除
	 */
	 Integer deleteByProdId(@Param("prodId") Integer prodId);


	/**
	 * 根据ProdId获取对象
	 */
	 T selectByProdId(@Param("prodId") Integer prodId);


}
