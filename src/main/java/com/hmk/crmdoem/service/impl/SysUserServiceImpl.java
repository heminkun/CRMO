package com.hmk.crmdoem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hmk.crmdoem.service.*;
import com.hmk.crmdoem.utils.MD5Utils;
import com.hmk.crmdoem.utils.RedisService;
import com.hmk.crmdoem.utils.TokenUtil;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SysUserQuery;
import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SysUserMapper;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {


	@Resource
	private SysUserMapper<SysUser,SysUserQuery> sysUserMapper;

	@Resource
	private RedisService redisService;
	@Resource
	private SalChanceService salChanceService;

	@Resource
	private CstServiceService cstServiceService;

	@Resource
	private CstLostService lostService;

	@Resource
	private CstCustomerService cstCustomerService;
	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysUser> findListByParam(SysUserQuery param) {
		return this.sysUserMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SysUserQuery param) {
		return this.sysUserMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SysUser> findListByPage(SysUserQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SysUser> list = this.findListByParam(param);
		PaginationResultVO<SysUser> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SysUser bean){
		String password=bean.getUserPassword();
		String s = MD5Utils.encryptMD5(password);
		bean.setUserPassword(s);
		return this.sysUserMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SysUser> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysUserMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SysUser> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysUserMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据UserId获取对象
	 */
	@Override
	public SysUser getSysUserByUserId(Integer userId){
		return this.sysUserMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId修改
	 */
	@Override
	public Integer updateSysUserByUserId(SysUser bean,Integer userId){
		return this.sysUserMapper.updateByUserId(bean,userId);
	}

	/**
	 * 根据UserId删除
	 */
	@Override
	public Integer deleteSysUserByUserId(Integer userId){
		return this.sysUserMapper.deleteByUserId(userId);
	}

	public String selectLogin(String text, String password) {
		String s = MD5Utils.encryptMD5(password);
		SysUser sysUser;
		if (text.contains("@")){
			 sysUser=sysUserMapper.selectLoginByEmail(text, s);
		}else {
			sysUser = sysUserMapper.selectLoginByUsername(text,s);
		}
		Map<String,Object> map=new HashMap<>();
		if (sysUser!=null){
			if (sysUser.getUserRoleId()!=null){
				map.put("roleId",sysUser.getUserRoleId());
			}
			if (sysUser.getUserFlag()!=null){
				map.put("flag",sysUser.getUserFlag());
			}
			if (sysUser.getUserId()!=null){
				map.put("id",sysUser.getUserId());
			}
			if (sysUser.getUserName()!=null){
				map.put("username",sysUser.getUserName());
			}
			if (sysUser.getUserEmail()!=null){
				map.put("email",sysUser.getUserEmail());
			}
			if (sysUser.getUserIco()!=null){
				map.put("ico",sysUser.getUserIco());
			}
			if (sysUser.getUserFlag()!=null){
				map.put("flag",sysUser.getUserFlag());
			}
			if (map.size()>0){
				String token = TokenUtil.sign(map);
				redisService.put(sysUser.getUserName(),token,60*24);
				return token;
			}
		}
		return null;
	}

	@Override
	public Integer updateByUserNameEmail(Integer id,String userEmail,String userName) {
		Integer integer = sysUserMapper.selectUserIdByEmail(userEmail);
		cstCustomerService.updateCustManagerNameByCustManagerId(userName,integer);
		lostService.updateLstCustManagerNameByLstCustManagerId(userName,integer);
		salChanceService.updateChcCreateByUserId(userName,integer);
		salChanceService.updateChcDueToByUserId(userName,integer);
		cstServiceService.updateSvrCreateByUserId(integer,userName);
		cstServiceService.updateSvrDealByByUserId(integer,userName);
		cstServiceService.updateSvrDeuToByUserId(integer,userName);
		return sysUserMapper.updateByUserNameEmail(userEmail,userName);
	}

	@Override
	public SysUser selectByUserEmail(String userEmail) {
		return sysUserMapper.selectByUserEmail(userEmail);
	}

	@Override
	public Integer updateEmailByEmail(String oldEmail, String newEmail) {
		return sysUserMapper.updateEmailByEmail(oldEmail,newEmail);
	}

	@Override
	public SysUser selectPasswordByEmail(String email, String password) {
		return sysUserMapper.selectPasswordByEmail(email, MD5Utils.encryptMD5(password));
	}

	@Override
	public Integer updatePasswordByEmail(String email, String newPassword) {
		return sysUserMapper.updatePasswordByEmail(email,MD5Utils.encryptMD5(newPassword));
	}

	@Override
	public Integer selectUserIdByEmail(String email) {
		return sysUserMapper.selectUserIdByEmail(email);
	}

	@Override
	public Integer validateEmail(String email) {
		if (sysUserMapper.selectByUserEmail(email)!=null){
			return 1;
		}
		return 0;
	}
}