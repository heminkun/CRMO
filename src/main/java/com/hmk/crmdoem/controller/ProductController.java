package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.ProductQuery;
import com.hmk.crmdoem.entity.po.Product;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.ProductService;
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
@RestController("productController")
@RequestMapping("product")
@CrossOrigin
public class ProductController extends ABaseController{

	@Resource
	private ProductService productService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(ProductQuery query){
		return getSuccessResponseVO(productService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(Product bean) {
		productService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Product> listBean) {
		productService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Product> listBean) {
		productService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ProdId查询对象
	 */
	@RequestMapping("getProductByProdId")
	public ResponseVO getProductByProdId(Integer prodId) {
		return getSuccessResponseVO(productService.getProductByProdId(prodId));
	}

	/**
	 * 根据ProdId修改对象
	 */
	@RequestMapping("updateProductByProdId")
	public ResponseVO updateProductByProdId(Product bean,Integer prodId) {
		productService.updateProductByProdId(bean,prodId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ProdId删除
	 */
	@RequestMapping("deleteProductByProdId")
	public ResponseVO deleteProductByProdId(Integer prodId) {
		productService.deleteProductByProdId(prodId);
		return getSuccessResponseVO(null);
	}
}