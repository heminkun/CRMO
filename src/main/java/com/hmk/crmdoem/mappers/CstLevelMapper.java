package com.hmk.crmdoem.mappers;

import com.hmk.crmdoem.entity.po.CstLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface CstLevelMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据CustLevelId更新
	 */
	 Integer updateByCustLevelId(@Param("bean") T t,@Param("custLevelId") Integer custLevelId);


	/**
	 * 根据CustLevelId删除
	 */
	 Integer deleteByCustLevelId(@Param("custLevelId") Integer custLevelId);


	/**
	 * 根据CustLevelId获取对象
	 */
	 T selectByCustLevelId(@Param("custLevelId") Integer custLevelId);

	 List<T> selectAll();
}
