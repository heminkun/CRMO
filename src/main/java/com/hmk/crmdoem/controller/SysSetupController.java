package com.hmk.crmdoem.controller;

import java.util.ArrayList;
import java.util.List;

import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.query.SysSetupQuery;
import com.hmk.crmdoem.entity.po.SysSetup;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.SysSetupService;
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
@RestController("sysSetupController")
@RequestMapping("sysSetup")
@CrossOrigin
public class SysSetupController extends ABaseController{

	@Resource
	private SysSetupService sysSetupService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SysSetupQuery query){
		return getSuccessResponseVO(sysSetupService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(SysSetup bean) {
		sysSetupService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<SysSetup> listBean) {
		sysSetupService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SysSetup> listBean) {
		sysSetupService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("getSysSetupById")
	public ResponseVO getSysSetupById(Integer id) {
		return getSuccessResponseVO(sysSetupService.getSysSetupById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("updateSysSetupById")
	public ResponseVO updateSysSetupById(SysSetup bean,Integer id) {
		sysSetupService.updateSysSetupById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteSysSetupById")
	public ResponseVO deleteSysSetupById(Integer id) {
		sysSetupService.deleteSysSetupById(id);
		return getSuccessResponseVO(null);
	}
	@RequestMapping("getSetUpCarousel")
	public ResponseVO getSetUpCarousel(){
		List<Carousel> setUpCarousel = sysSetupService.getSetUpCarousel();
		return getSuccessResponseVO(setUpCarousel);
	}
	@RequestMapping("getSetUp")
	public ResponseVO getSetUp(){
		return getSuccessResponseVO(sysSetupService.getSetUp());
	}

	@RequestMapping("updateSetUpCarousel")
	public ResponseVO updateSetUpCarousel(@RequestBody Integer[] list){
		return getSuccessResponseVO(sysSetupService.updateSetUpCarousel(list));
	}
}