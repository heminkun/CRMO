package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.BasDictQuery;
import com.hmk.crmdoem.entity.po.BasDict;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.BasDictService;
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
@RestController("basDictController")
@RequestMapping("basDict")
@CrossOrigin
public class BasDictController extends ABaseController{

	@Resource
	private BasDictService basDictService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(BasDictQuery query){
		return getSuccessResponseVO(basDictService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(BasDict bean) {
		basDictService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<BasDict> listBean) {
		basDictService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<BasDict> listBean) {
		basDictService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DictId查询对象
	 */
	@RequestMapping("getBasDictByDictId")
	public ResponseVO getBasDictByDictId(Integer dictId) {
		return getSuccessResponseVO(basDictService.getBasDictByDictId(dictId));
	}

	/**
	 * 根据DictId修改对象
	 */
	@RequestMapping("updateBasDictByDictId")
	public ResponseVO updateBasDictByDictId(BasDict bean,Integer dictId) {
		basDictService.updateBasDictByDictId(bean,dictId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DictId删除
	 */
	@RequestMapping("deleteBasDictByDictId")
	public ResponseVO deleteBasDictByDictId(Integer dictId) {
		basDictService.deleteBasDictByDictId(dictId);
		return getSuccessResponseVO(null);
	}
}