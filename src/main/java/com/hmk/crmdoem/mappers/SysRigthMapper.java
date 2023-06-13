package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface SysRigthMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据RightId更新
	 */
	 Integer updateByRightId(@Param("bean") T t,@Param("rightId") Integer rightId);


	/**
	 * 根据RightId删除
	 */
	 Integer deleteByRightId(@Param("rightId") Integer rightId);


	/**
	 * 根据RightId获取对象
	 */
	 T selectByRightId(@Param("rightId") Integer rightId);


}
