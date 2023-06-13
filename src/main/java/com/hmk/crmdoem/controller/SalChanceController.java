package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.controller.pojo.SalChancePojo;
import com.hmk.crmdoem.entity.query.SalChanceQuery;
import com.hmk.crmdoem.entity.po.SalChance;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SalChanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 
 *  Controller
 * 
 */
@RestController("salChanceController")
@RequestMapping("salChance")
@CrossOrigin
public class SalChanceController extends ABaseController{

	@Resource
	private SalChanceService salChanceService;
	/**
	 * 根据条件分页查询
	 */

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SalChanceQuery query){
		return getSuccessResponseVO(salChanceService.findListByPage(query));
	}

	@RequestMapping("loadDataList2")
	public ResponseVO loadDataList2(SalChanceQuery query){
		return getSuccessResponseVO(salChanceService.findListByPage2(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody SalChance bean) {
		System.out.println(bean);
		salChanceService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SalChance> listBean) {
		salChanceService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SalChance> listBean) {
		salChanceService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ChcId查询对象
	 */
	@RequestMapping("getSalChanceByChcId")
	public ResponseVO getSalChanceByChcId(Integer chcId) {
		return getSuccessResponseVO(salChanceService.getSalChanceByChcId(chcId));
	}

	/**
	 * 根据ChcId修改对象
	 */
	@RequestMapping("updateSalChanceByChcId")
	public ResponseVO updateSalChanceByChcId(@RequestBody SalChancePojo pojo) {
		SalChance bean=new SalChance(pojo.getChcCustName(),pojo.getChcSource(),
				pojo.getChcRate(),pojo.getChcLinkman(),pojo.getChcTel(),
				pojo.getChcTitle(),pojo.getChcDesc(),pojo.getChcCreateBy(),
				pojo.getChcCreateId());
		salChanceService.updateSalChanceByChcId(bean,pojo.getChcId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ChcId删除
	 */
	@RequestMapping("deleteSalChanceByChcId")
	public ResponseVO deleteSalChanceByChcId(Integer chcId) {
		salChanceService.deleteSalChanceByChcId(chcId);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("updateAssignByChcId")
	public ResponseVO updateAssignByChcId(@RequestBody SalChancePojo pojo) {
		SalChance bean=new SalChance(pojo.getChcDueId(),pojo.getChcDueTo(), pojo.getChcDueDate(),pojo.getChcStatus());
		salChanceService.updateSalChanceByChcId(bean,pojo.getChcId());
		return getSuccessResponseVO(null);
	}
}