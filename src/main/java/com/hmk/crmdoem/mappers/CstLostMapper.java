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
public interface CstLostMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据LstId更新
	 */
	 Integer updateByLstId(@Param("bean") T t,@Param("lstId") Integer lstId);


	/**
	 * 根据LstId删除
	 */
	 Integer deleteByLstId(@Param("lstId") Integer lstId);


	/**
	 * 根据LstId获取对象
	 */
	 T selectByLstId(@Param("lstId") Integer lstId);

	 @Update("update cst_lost set lst_cust_manager_name=#{name} where lst_cust_manager_id=#{id}")
	 Integer updateLstCustManagerNameByLstCustManagerId(String name,Integer id);
}
