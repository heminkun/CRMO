package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.SalPlanQuery;
import com.hmk.crmdoem.entity.po.SalPlan;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SalPlanService;
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
@RestController("salPlanController")
@RequestMapping("salPlan")
@CrossOrigin
public class SalPlanController extends ABaseController{

	@Resource
	private SalPlanService salPlanService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SalPlanQuery query){
		return getSuccessResponseVO(salPlanService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody SalPlan bean) {
		salPlanService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SalPlan> listBean) {
		salPlanService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SalPlan> listBean) {
		salPlanService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PlaId查询对象
	 */
	@RequestMapping("getSalPlanByPlaId")
	public ResponseVO getSalPlanByPlaId(Integer plaId) {
		return getSuccessResponseVO(salPlanService.getSalPlanByPlaId(plaId));
	}

	/**
	 * 根据PlaId修改对象
	 */
	@RequestMapping("updateSalPlanByPlaId")
	public ResponseVO updateSalPlanByPlaId(SalPlan bean,Integer plaId) {
		salPlanService.updateSalPlanByPlaId(bean,plaId);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("updateSalPlanByPlaId2")
	public ResponseVO updateSalPlanByPlaId2(@RequestBody SalPlan bean) {
		System.out.println(bean);
		salPlanService.updateSalPlanByPlaId(bean,bean.getPlaId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PlaId删除
	 */
	@RequestMapping("deleteSalPlanByPlaId")
	public ResponseVO deleteSalPlanByPlaId(Integer plaId) {
		salPlanService.deleteSalPlanByPlaId(plaId);
		return getSuccessResponseVO(null);
	}
}