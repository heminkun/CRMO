package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.StorageQuery;
import com.hmk.crmdoem.entity.po.Storage;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.StorageService;
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
@RestController("storageController")
@RequestMapping("storage")
@CrossOrigin
public class StorageController extends ABaseController{

	@Resource
	private StorageService storageService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(StorageQuery query){
		return getSuccessResponseVO(storageService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(Storage bean) {
		storageService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Storage> listBean) {
		storageService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Storage> listBean) {
		storageService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StkId查询对象
	 */
	@RequestMapping("getStorageByStkId")
	public ResponseVO getStorageByStkId(Integer stkId) {
		return getSuccessResponseVO(storageService.getStorageByStkId(stkId));
	}

	/**
	 * 根据StkId修改对象
	 */
	@RequestMapping("updateStorageByStkId")
	public ResponseVO updateStorageByStkId(Storage bean,Integer stkId) {
		storageService.updateStorageByStkId(bean,stkId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StkId删除
	 */
	@RequestMapping("deleteStorageByStkId")
	public ResponseVO deleteStorageByStkId(Integer stkId) {
		storageService.deleteStorageByStkId(stkId);
		return getSuccessResponseVO(null);
	}
}