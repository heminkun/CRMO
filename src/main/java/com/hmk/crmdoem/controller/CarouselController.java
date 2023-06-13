package com.hmk.crmdoem.controller;

import java.util.List;

import com.hmk.crmdoem.entity.query.CarouselQuery;
import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.CarouselService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 
 *  Controller
 * 
 */
@RestController("carouselController")
@RequestMapping("carousel")
@CrossOrigin
public class CarouselController extends ABaseController{

	@Resource
	private CarouselService carouselService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CarouselQuery query){
		return getSuccessResponseVO(carouselService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("add")
	public ResponseVO add(Carousel bean) {
		carouselService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Carousel> listBean) {
		carouselService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Carousel> listBean) {
		carouselService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询对象
	 */
	@RequestMapping("getCarouselById")
	public ResponseVO getCarouselById(Integer id) {
		return getSuccessResponseVO(carouselService.getCarouselById(id));
	}

	/**
	 * 根据Id修改对象
	 */
	@RequestMapping("updateCarouselById")
	public ResponseVO updateCarouselById(Carousel bean,Integer id) {
		carouselService.updateCarouselById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteCarouselById")
	public ResponseVO deleteCarouselById(Integer id) {
		carouselService.deleteCarouselById(id);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("addCarousel")
	public ResponseVO addCarousel(MultipartFile[] files){
		Integer integer = carouselService.addCarousel(files);
		return getSuccessResponseVO("共上传"+files.length+"张图"+",成功"+integer+"张"+",失败"+(files.length-integer)+"张");
	}
	@RequestMapping("updateNameByName")
	public ResponseVO updateNameByName(String odlName,String newName,String path){
		Integer integer = carouselService.updateNameByName(odlName, newName,path);
		if (integer==0){
			return getServerErrorResponseVO(null);
		}
			return getSuccessResponseVO(null);
	}

	@RequestMapping("deleteByName")
	public ResponseVO deleteByName(String name,Integer id){
		Integer integer = carouselService.deleteByName(name,id);
		if (integer==0){
			return getServerErrorResponseVO(null);
		}else if (integer==2){
			return getServerErrorResponseVO("图片正在轮播中,请将它换下再进行删除！");
		}
		else {
			return getSuccessResponseVO(null);
		}
	}
}