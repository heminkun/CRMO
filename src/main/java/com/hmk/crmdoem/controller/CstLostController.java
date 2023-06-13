package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstLostQuery;
import com.hmk.crmdoem.entity.po.CstLost;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstLostService;
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
@RestController("cstLostController")
@RequestMapping("cstLost")
@CrossOrigin
public class CstLostController extends ABaseController{

	@Resource
	private CstLostService cstLostService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstLostQuery query){
		return getSuccessResponseVO(cstLostService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(CstLost bean) {
		cstLostService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstLost> listBean) {
		cstLostService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstLost> listBean) {
		cstLostService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据LstId查询对象
	 */
	@RequestMapping("getCstLostByLstId")
	public ResponseVO getCstLostByLstId(Integer lstId) {
		return getSuccessResponseVO(cstLostService.getCstLostByLstId(lstId));
	}

	/**
	 * 根据LstId修改对象
	 */
	@RequestMapping("updateCstLostByLstId")
	public ResponseVO updateCstLostByLstId(CstLost bean,Integer lstId) {
		cstLostService.updateCstLostByLstId(bean,lstId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("updateCstLostByLstId2")
	public ResponseVO updateCstLostByLstId2(@RequestBody CstLost bean) {
		cstLostService.updateCstLostByLstId(bean,bean.getLstId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据LstId删除
	 */
	@RequestMapping("deleteCstLostByLstId")
	public ResponseVO deleteCstLostByLstId(Integer lstId) {
		cstLostService.deleteCstLostByLstId(lstId);
		return getSuccessResponseVO(null);
	}
}