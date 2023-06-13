package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.ContributeQuery;
import com.hmk.crmdoem.entity.po.Contribute;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.ContributeService;
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
@RestController("contributeController")
@RequestMapping("contribute")
@CrossOrigin
public class ContributeController extends ABaseController{

	@Resource
	private ContributeService contributeService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(ContributeQuery query){
		return getSuccessResponseVO(contributeService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(Contribute bean) {
		contributeService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Contribute> listBean) {
		contributeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Contribute> listBean) {
		contributeService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("getContributeById")
	public ResponseVO getContributeById(Integer id) {
		return getSuccessResponseVO(contributeService.getContributeById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("updateContributeById")
	public ResponseVO updateContributeById(Contribute bean,Integer id) {
		contributeService.updateContributeById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteContributeById")
	public ResponseVO deleteContributeById(Integer id) {
		contributeService.deleteContributeById(id);
		return getSuccessResponseVO(null);
	}
}