package com.hmk.crmdoem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.auth0.jwt.interfaces.Claim;
import com.hmk.crmdoem.controller.pojo.RegisterPojo;
import com.hmk.crmdoem.entity.query.SysUserQuery;
import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SysUserService;
import com.hmk.crmdoem.service.TokenService;
import com.hmk.crmdoem.utils.RedisService;
import com.hmk.crmdoem.utils.StringSubUtil;
import com.hmk.crmdoem.utils.TokenUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 
 *  Controller
 * 
 */
@RestController("sysUserController")
@RequestMapping("sysUser")
@CrossOrigin
public class SysUserController extends ABaseController{

	@Resource
	private SysUserService sysUserService;

	@Resource
	RedisService redisService;

	@Resource
	TokenService tokenService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SysUserQuery query){
		return getSuccessResponseVO(sysUserService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(SysUser bean) {
		sysUserService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SysUser> listBean) {
		sysUserService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SysUser> listBean) {
		sysUserService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId查询对象
	 */
	@RequestMapping("getSysUserByUserId")
	public ResponseVO getSysUserByUserId(Integer userId) {
		return getSuccessResponseVO(sysUserService.getSysUserByUserId(userId));
	}

	/**
	 * 根据UserId修改对象
	 */
	@RequestMapping("updateSysUserByUserId")
	public ResponseVO updateSysUserByUserId(SysUser bean,Integer userId) {
		sysUserService.updateSysUserByUserId(bean,userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId删除
	 */
	@RequestMapping("deleteSysUserByUserId")
	public ResponseVO deleteSysUserByUserId(Integer userId) {
		sysUserService.deleteSysUserByUserId(userId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("register")
	public ResponseVO register(@RequestBody RegisterPojo pojo){
		String code = redisService.getString(pojo.getEmail());
		if (code.equals(pojo.getCode())){
			sysUserService.add(new SysUser(pojo.getEmail(),pojo.getUsername(),pojo.getPassword()));
			return getSuccessResponseVO(null);
		}else {
			return getServerErrorResponseVO("验证码错误！");
		}
	}
	@RequestMapping("login")
	public ResponseVO Login(String text,String password){
		return getSuccessResponseVO(sysUserService.selectLogin(text, password));
	}
	@RequestMapping("logout")
	public ResponseVO logout(String username){
		redisService.delete(username);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("verifyToken")
	public ResponseVO verifyToken(String token){
		Map<String,Object> map=new HashMap<>();
		if (!TokenUtil.isExpired(token)){
			if (TokenUtil.verify(token)){
				String username =TokenUtil.getClaims(token).get("username").toString();
				String email=TokenUtil.getClaims(token).get("email").toString();
				String ico=TokenUtil.getClaims(token).get("ico").toString();
				String id=TokenUtil.getClaims(token).get("id").toString();
				String flag = TokenUtil.getClaims(token).get("flag").toString();
				String roleId = TokenUtil.getClaims(token).get("roleId").toString();
				map.put("flag",flag);
				map.put("roleId",roleId);
				map.put("id",id);
				map.put("username",StringSubUtil.SubString(username));
				map.put("email",StringSubUtil.SubString(email));
				map.put("ico",StringSubUtil.SubString(ico));
				return getSuccessResponseVO(map);
			}else {
				return getServerErrorResponseVO("token错误!");
			}
		}else {
			return getServerErrorResponseVO("token已过期");
		}
	}
	@RequestMapping("updateUserName")
	public ResponseVO updateUserNameByEmail(Integer id,String email,String userName){
		Integer integer = sysUserService.updateByUserNameEmail(id,email, userName);
		if (integer>0){
			return getSuccessResponseVO(null);
		}else {
			return getServerErrorResponseVO(null);
		}
	}
	@RequestMapping("changeEmail")
	public ResponseVO changeEmail(String oldEmail,String newEmail,String code){
		if (code.equals(redisService.getString(newEmail))){
			Integer integer = sysUserService.updateEmailByEmail(oldEmail, newEmail);
			if (integer>0){
				return getSuccessResponseVO("换绑邮箱成功,请重新登录");
			}else {
				return getServerErrorResponseVO(null);
			}
		}else {
			return getServerErrorResponseVO(null);
		}
	}
	@RequestMapping("verifyOldEmail")
	public ResponseVO verifyOldEmail(String code,String email) {
		String redisCode = redisService.getString(email);
		if (code.equals(redisCode)) {
			return getSuccessResponseVO(null);
		} else {
			return getServerErrorResponseVO("验证码错误或过期");
		}
	}
	@RequestMapping("selectPass")
	public ResponseVO selectPass(String email,String password){
		return getSuccessResponseVO(sysUserService.selectPasswordByEmail(email,password));
	}
	@RequestMapping("updatePass")
	public ResponseVO updatePass(String email,String newPassword,String oldPassword){
		SysUser sysUser = sysUserService.selectPasswordByEmail(email, oldPassword);
		if (sysUser!=null){
			return getSuccessResponseVO(sysUserService.updatePasswordByEmail(email,newPassword));
		}else {
			return getSuccessResponseVO("旧密码错误");
		}
	}
	@RequestMapping("validateEmail")
	public ResponseVO validateName(String email){
		if (sysUserService.validateEmail(email)==1){
			return getSuccessResponseVO(null);
		}
		return getServerErrorResponseVO(null);
	}
	@RequestMapping("forgotPassCode")
	public ResponseVO forgotPassCode(String email,String code){
		String string = redisService.getString(email);
		if (string.equals(code)){
			return getSuccessResponseVO(null);
		}
		return getServerErrorResponseVO("验证码错误！");
	}
	@RequestMapping("forgotPass")
	public ResponseVO forgotPass(String email,String pass){
		sysUserService.updatePasswordByEmail(email,pass);
		return getSuccessResponseVO(null);
	}
}