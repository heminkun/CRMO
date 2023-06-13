package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstLinkmanQuery;
import com.hmk.crmdoem.entity.po.CstLinkman;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstLinkmanService;
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
@RestController("cstLinkmanController")
@RequestMapping("cstLinkman")
@CrossOrigin
public class CstLinkmanController extends ABaseController{

	@Resource
	private CstLinkmanService cstLinkmanService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstLinkmanQuery query){
		return getSuccessResponseVO(cstLinkmanService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody CstLinkman bean) {
		cstLinkmanService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstLinkman> listBean) {
		cstLinkmanService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstLinkman> listBean) {
		cstLinkmanService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据LkmId查询对象
	 */
	@RequestMapping("getCstLinkmanByLkmId")
	public ResponseVO getCstLinkmanByLkmId(Integer lkmId) {
		return getSuccessResponseVO(cstLinkmanService.getCstLinkmanByLkmId(lkmId));
	}

	/**
	 * 根据LkmId修改对象
	 */
	@RequestMapping("updateCstLinkmanByLkmId")
	public ResponseVO updateCstLinkmanByLkmId(CstLinkman bean,Integer lkmId) {
		cstLinkmanService.updateCstLinkmanByLkmId(bean,lkmId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("updateCstLinkmanByLkmId2")
	public ResponseVO updateCstLinkmanByLkmId2(@RequestBody CstLinkman bean) {
		cstLinkmanService.updateCstLinkmanByLkmId(bean,bean.getLkmId());
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据LkmId删除
	 */
	@RequestMapping("deleteCstLinkmanByLkmId")
	public ResponseVO deleteCstLinkmanByLkmId(Integer lkmId) {
		cstLinkmanService.deleteCstLinkmanByLkmId(lkmId);
		return getSuccessResponseVO(null);
	}
}