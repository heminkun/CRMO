package com.hmk.crmdoem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.ProductQuery;
import com.hmk.crmdoem.entity.po.Product;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.ProductMapper;
import com.hmk.crmdoem.service.ProductService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductMapper<Product,ProductQuery> productMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Product> findListByParam(ProductQuery param) {
		return this.productMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ProductQuery param) {
		return this.productMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Product> findListByPage(ProductQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Product> list = this.findListByParam(param);
		PaginationResultVO<Product> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Product bean){
		return this.productMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Product> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.productMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Product> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.productMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据ProdId获取对象
	 */
	@Override
	public Product getProductByProdId(Integer prodId){
		return this.productMapper.selectByProdId(prodId);
	}

	/**
	 * 根据ProdId修改
	 */
	@Override
	public Integer updateProductByProdId(Product bean,Integer prodId){
		return this.productMapper.updateByProdId(bean,prodId);
	}

	/**
	 * 根据ProdId删除
	 */
	@Override
	public Integer deleteProductByProdId(Integer prodId){
		return this.productMapper.deleteByProdId(prodId);
	}
}