package com.hmk.crmdoem.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface SalChanceMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据ChcId更新
	 */
	 Integer updateByChcId(@Param("bean") T t,@Param("chcId") Integer chcId);


	/**
	 * 根据ChcId删除
	 */
	 Integer deleteByChcId(@Param("chcId") Integer chcId);


	/**
	 * 根据ChcId获取对象
	 */
	 T selectByChcId(@Param("chcId") Integer chcId);

	 @Update("update sal_chance set chc_create_by=#{username} where chc_create_id=#{id}")
	 Integer updateChcCreateByUserId(String username,Integer id);
	 @Update("update sal_chance set chc_due_to=#{username} where chc_due_id=#{id}")
	 Integer updateChcDueToByUserId(String username,Integer id);

}
