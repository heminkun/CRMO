package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.SysRigthQuery;
import com.hmk.crmdoem.entity.po.SysRigth;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SysRigthService;
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
@RestController("sysRigthController")
@RequestMapping("sysRigth")
@CrossOrigin
public class SysRigthController extends ABaseController{

	@Resource
	private SysRigthService sysRigthService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SysRigthQuery query){
		return getSuccessResponseVO(sysRigthService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(SysRigth bean) {
		sysRigthService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SysRigth> listBean) {
		sysRigthService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SysRigth> listBean) {
		sysRigthService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RightId查询对象
	 */
	@RequestMapping("getSysRigthByRightId")
	public ResponseVO getSysRigthByRightId(Integer rightId) {
		return getSuccessResponseVO(sysRigthService.getSysRigthByRightId(rightId));
	}

	/**
	 * 根据RightId修改对象
	 */
	@RequestMapping("updateSysRigthByRightId")
	public ResponseVO updateSysRigthByRightId(SysRigth bean,Integer rightId) {
		sysRigthService.updateSysRigthByRightId(bean,rightId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RightId删除
	 */
	@RequestMapping("deleteSysRigthByRightId")
	public ResponseVO deleteSysRigthByRightId(Integer rightId) {
		sysRigthService.deleteSysRigthByRightId(rightId);
		return getSuccessResponseVO(null);
	}
}