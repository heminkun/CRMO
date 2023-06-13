package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstActivityQuery;
import com.hmk.crmdoem.entity.po.CstActivity;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstActivityService;
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
@RestController("cstActivityController")
@RequestMapping("cstActivity")
@CrossOrigin
public class CstActivityController extends ABaseController{

	@Resource
	private CstActivityService cstActivityService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstActivityQuery query){
		return getSuccessResponseVO(cstActivityService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody CstActivity bean) {
		cstActivityService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstActivity> listBean) {
		cstActivityService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstActivity> listBean) {
		cstActivityService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据AtvId查询对象
	 */
	@RequestMapping("getCstActivityByAtvId")
	public ResponseVO getCstActivityByAtvId(Integer atvId) {
		return getSuccessResponseVO(cstActivityService.getCstActivityByAtvId(atvId));
	}

	/**
	 * 根据AtvId修改对象
	 */
	@RequestMapping("updateCstActivityByAtvId")
	public ResponseVO updateCstActivityByAtvId(CstActivity bean,Integer atvId) {
		cstActivityService.updateCstActivityByAtvId(bean,atvId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("updateCstActivityByAtvId2")
	public ResponseVO updateCstActivityByAtvId2(@RequestBody CstActivity bean) {
		cstActivityService.updateCstActivityByAtvId(bean,bean.getAtvId());
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据AtvId删除
	 */
	@RequestMapping("deleteCstActivityByAtvId")
	public ResponseVO deleteCstActivityByAtvId(Integer atvId) {
		cstActivityService.deleteCstActivityByAtvId(atvId);
		return getSuccessResponseVO(null);
	}
}