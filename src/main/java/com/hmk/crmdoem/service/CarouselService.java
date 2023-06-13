package com.hmk.crmdoem.service;

import java.util.List;

import com.hmk.crmdoem.entity.query.CarouselQuery;
import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import org.springframework.web.multipart.MultipartFile;


/**
 * 
 *  业务接口
 * 
 */
public interface CarouselService {

	/**
	 * 根据条件查询列表
	 */
	List<Carousel> findListByParam(CarouselQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(CarouselQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Carousel> findListByPage(CarouselQuery param);

	/**
	 * 新增
	 */
	Integer add(Carousel bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Carousel> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Carousel> listBean);

	/**
	 * 根据Id查询对象
	 */
	Carousel getCarouselById(Integer id);


	/**
	 * 根据Id修改
	 */
	Integer updateCarouselById(Carousel bean,Integer id);


	/**
	 * 根据Id删除
	 */
	Integer deleteCarouselById(Integer id);

	Integer addCarousel (MultipartFile[] files);

	Integer updateNameByName(String oldName,String newName,String path);

	Integer deleteByName(String name,Integer id);
}