package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.po.Echarts;
import com.hmk.crmdoem.entity.query.CstServiceTypeQuery;
import com.hmk.crmdoem.entity.po.CstServiceType;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CstServiceTypeService;
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
@RestController("cstServiceTypeController")
@RequestMapping("cstServiceType")
@CrossOrigin
public class CstServiceTypeController extends ABaseController{

	@Resource
	private CstServiceTypeService cstServiceTypeService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CstServiceTypeQuery query){
		return getSuccessResponseVO(cstServiceTypeService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(CstServiceType bean) {
		cstServiceTypeService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<CstServiceType> listBean) {
		cstServiceTypeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<CstServiceType> listBean) {
		cstServiceTypeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CstId查询对象
	 */
	@RequestMapping("getCstServiceTypeByCstId")
	public ResponseVO getCstServiceTypeByCstId(Integer cstId) {
		return getSuccessResponseVO(cstServiceTypeService.getCstServiceTypeByCstId(cstId));
	}

	/**
	 * 根据CstId修改对象
	 */
	@RequestMapping("updateCstServiceTypeByCstId")
	public ResponseVO updateCstServiceTypeByCstId(CstServiceType bean,Integer cstId) {
		cstServiceTypeService.updateCstServiceTypeByCstId(bean,cstId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CstId删除
	 */
	@RequestMapping("deleteCstServiceTypeByCstId")
	public ResponseVO deleteCstServiceTypeByCstId(Integer cstId) {
		cstServiceTypeService.deleteCstServiceTypeByCstId(cstId);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("getEchartsData")
	public ResponseVO getEchartsData(){
		List<Echarts> echartsList = cstServiceTypeService.selectAll();
		return getSuccessResponseVO(echartsList);
	}
}