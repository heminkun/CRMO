package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysRoleRigthQuery;
import com.hmk.crmdoem.entity.po.SysRoleRigth;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SysRoleRigthService;
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
@RestController("sysRoleRigthController")
@RequestMapping("sysRoleRigth")
@CrossOrigin
public class SysRoleRigthController extends ABaseController{

	@Resource
	private SysRoleRigthService sysRoleRigthService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SysRoleRigthQuery query){
		return getSuccessResponseVO(sysRoleRigthService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(SysRoleRigth bean) {
		sysRoleRigthService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SysRoleRigth> listBean) {
		sysRoleRigthService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SysRoleRigth> listBean) {
		sysRoleRigthService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}
}