package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.ProductQuery;
import com.hmk.crmdoem.entity.po.Product;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;


/**
 * 
 *  业务接口
 * 
 */
public interface ProductService {

	/**
	 * 根据条件查询列表
	 */
	List<Product> findListByParam(ProductQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ProductQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Product> findListByPage(ProductQuery param);

	/**
	 * 新增
	 */
	Integer add(Product bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Product> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Product> listBean);

	/**
	 * 根据ProdId查询对象
	 */
	Product getProductByProdId(Integer prodId);


	/**
	 * 根据ProdId修改
	 */
	Integer updateProductByProdId(Product bean,Integer prodId);


	/**
	 * 根据ProdId删除
	 */
	Integer deleteProductByProdId(Integer prodId);

}