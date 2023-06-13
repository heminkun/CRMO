package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.po.Echarts;
import com.hmk.crmdoem.entity.query.CstLevelQuery;
import com.hmk.crmdoem.entity.po.CstLevel;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstLevelService;
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
@RestController("cstLevelController")
@RequestMapping("cstLevel")
@CrossOrigin
public class CstLevelController extends ABaseController{

	@Resource
	private CstLevelService cstLevelService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstLevelQuery query){
		return getSuccessResponseVO(cstLevelService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(CstLevel bean) {
		cstLevelService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstLevel> listBean) {
		cstLevelService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstLevel> listBean) {
		cstLevelService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CustLevelId查询对象
	 */
	@RequestMapping("getCstLevelByCustLevelId")
	public ResponseVO getCstLevelByCustLevelId(Integer custLevelId) {
		return getSuccessResponseVO(cstLevelService.getCstLevelByCustLevelId(custLevelId));
	}

	/**
	 * 根据CustLevelId修改对象
	 */
	@RequestMapping("updateCstLevelByCustLevelId")
	public ResponseVO updateCstLevelByCustLevelId(CstLevel bean,Integer custLevelId) {
		cstLevelService.updateCstLevelByCustLevelId(bean,custLevelId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CustLevelId删除
	 */
	@RequestMapping("deleteCstLevelByCustLevelId")
	public ResponseVO deleteCstLevelByCustLevelId(Integer custLevelId) {
		cstLevelService.deleteCstLevelByCustLevelId(custLevelId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("getEchartsData")
	public ResponseVO getEchartsData(){
		return getSuccessResponseVO(cstLevelService.selectAll());
	}
}