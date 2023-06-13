package com.hmk.crmdoem.mappers;

import com.hmk.crmdoem.entity.po.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *  数据库操作接口
 * 
 */
@Mapper
public interface SysUserMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean") T t,@Param("userId") Integer userId);


	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") Integer userId);


	/**
	 * 根据UserId获取对象
	 */
	 T selectByUserId(@Param("userId") Integer userId);


	 SysUser selectLoginByUsername(String userName,String userPassword);


	 SysUser selectLoginByEmail(String userEmail,String userPassword);

	 Integer updateByUserNameEmail(String userEmail,String userName);

	 SysUser selectByUserEmail(String userEmail);

	 Integer updateEmailByEmail(String oldEmail,String newEmail);

	 SysUser selectPasswordByEmail(String email,String password);

	 Integer updatePasswordByEmail(String email,String newPassword);

	 SysUser selectPassByPass(String password);

	 Integer updateUserIcoByID(String ico,Integer id);

	 @Select("select user_id from sys_user where user_email=#{email}")
	 Integer selectUserIdByEmail(String email);
}
