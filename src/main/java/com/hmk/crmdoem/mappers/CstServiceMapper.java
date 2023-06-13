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
public interface CstServiceMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据SvrId更新
	 */
	 Integer updateBySvrId(@Param("bean") T t,@Param("svrId") Integer svrId);


	/**
	 * 根据SvrId删除
	 */
	 Integer deleteBySvrId(@Param("svrId") Integer svrId);


	/**
	 * 根据SvrId获取对象
	 */
	 T selectBySvrId(@Param("svrId") Integer svrId);


	 @Update("update cst_service set svr_create_by=#{name} where svr_create_id=#{id} ")
	 Integer updateSvrCreateByUserId(Integer id,String name);
	 @Update("update cst_service set svr_due_to=#{name} where svr_due_id=#{id}")
	 Integer updateSvrDeuToByUserId(Integer id,String name);
	 @Update("update cst_service set svr_deal_by=#{name} where svr_deal_id=#{id}")
	 Integer updateSvrDealByByUserId(Integer id,String name);
}
