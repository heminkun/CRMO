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
public interface CstCustomerMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据CustNo更新
	 */
	 Integer updateByCustNo(@Param("bean") T t,@Param("custNo") String custNo);


	/**
	 * 根据CustNo删除
	 */
	 Integer deleteByCustNo(@Param("custNo") String custNo);


	/**
	 * 根据CustNo获取对象
	 */
	 T selectByCustNo(@Param("custNo") String custNo);

	 T selectCustNoByCustManagerId(Integer custManagerId);

	 @Update("update cst_customer set cust_manager_name=#{name} where cust_manager_id=#{id}")
	 Integer updateCustManagerNameByCustManagerId(String name,Integer id);
}
