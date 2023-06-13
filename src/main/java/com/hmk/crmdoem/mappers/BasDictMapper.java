package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface BasDictMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据DictId更新
	 */
	 Integer updateByDictId(@Param("bean") T t,@Param("dictId") Integer dictId);


	/**
	 * 根据DictId删除
	 */
	 Integer deleteByDictId(@Param("dictId") Integer dictId);


	/**
	 * 根据DictId获取对象
	 */
	 T selectByDictId(@Param("dictId") Integer dictId);


}
