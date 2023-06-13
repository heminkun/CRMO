package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CstServiceQuery;
import com.hmk.crmdoem.entity.po.CstService;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstServiceService;
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
@RestController("cstServiceController")
@RequestMapping("cstService")
@CrossOrigin
public class CstServiceController extends ABaseController{

	@Resource
	private CstServiceService cstServiceService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstServiceQuery query){
		return getSuccessResponseVO(cstServiceService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody CstService bean) {
		cstServiceService.add(bean);
		return getSuccessResponseVO(null);
	}


	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstService> listBean) {
		cstServiceService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstService> listBean) {
		cstServiceService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据SvrId查询对象
	 */
	@RequestMapping("getCstServiceBySvrId")
	public ResponseVO getCstServiceBySvrId(Integer svrId) {
		return getSuccessResponseVO(cstServiceService.getCstServiceBySvrId(svrId));
	}

	/**
	 * 根据SvrId修改对象
	 */
	@RequestMapping("updateCstServiceBySvrId")
	public ResponseVO updateCstServiceBySvrId(CstService bean,Integer svrId) {
		cstServiceService.updateCstServiceBySvrId(bean,svrId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("updateCstServiceBySvrId2")
	public ResponseVO updateCstServiceBySvrId2(@RequestBody CstService bean) {
		System.out.println(bean);
		cstServiceService.updateCstServiceBySvrId2(bean,bean.getSvrId());
		return getSuccessResponseVO(null);

	}
	@RequestMapping("updateCstServiceSvrDealBySvrId")
	public ResponseVO updateCstServiceSvrDealBySvrId(@RequestBody CstService bean) {
		cstServiceService.updateCstServiceSvrDealBySvrId(bean,bean.getSvrId());
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据SvrId删除
	 */
	@RequestMapping("deleteCstServiceBySvrId")
	public ResponseVO deleteCstServiceBySvrId(Integer svrId) {
		cstServiceService.deleteCstServiceBySvrId(svrId);
		return getSuccessResponseVO(null);
	}
}