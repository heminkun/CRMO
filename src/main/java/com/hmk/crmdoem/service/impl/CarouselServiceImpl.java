package com.hmk.crmdoem.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.hmk.crmdoem.config.QiNiuConf;
import com.hmk.crmdoem.entity.po.SysSetup;
import com.hmk.crmdoem.entity.query.SysSetupQuery;
import com.hmk.crmdoem.mappers.SysSetupMapper;
import com.hmk.crmdoem.utils.MultipartFileHash;
import com.hmk.crmdoem.utils.QiNiuUtil;
import com.hmk.crmdoem.utils.StringSubUtil;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.CarouselQuery;
import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.CarouselMapper;
import com.hmk.crmdoem.service.CarouselService;
import org.springframework.web.multipart.MultipartFile;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("carouselService")
public class CarouselServiceImpl implements CarouselService {

	@Resource
	private CarouselMapper<Carousel,CarouselQuery> carouselMapper;
	
	@Resource
	private SysSetupMapper<SysSetup, SysSetupQuery> sysSetupMapper;
	@Resource
	private QiNiuUtil qiNiuUtil;

	@Resource
	private QiNiuConf qiNiuConf;
	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Carousel> findListByParam(CarouselQuery param) {
		return this.carouselMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(CarouselQuery param) {
		return this.carouselMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Carousel> findListByPage(CarouselQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Carousel> list = this.findListByParam(param);
		PaginationResultVO<Carousel> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Carousel bean){
		return this.carouselMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Carousel> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.carouselMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Carousel> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.carouselMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public Carousel getCarouselById(Integer id){
		return this.carouselMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateCarouselById(Carousel bean,Integer id){
		return this.carouselMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteCarouselById(Integer id){
		return this.carouselMapper.deleteById(id);
	}

	@Override
	public Integer addCarousel(MultipartFile[] files) {
		int success=0;
		for (MultipartFile file:files){
			String hash= MultipartFileHash.getHash(file);
			if (carouselMapper.selectByHash(hash)!=null){
				continue;
			}else {
				String originalFilename = Objects.requireNonNull(file.getOriginalFilename());
				String fileName = QiNiuUtil.getRandomImgName(originalFilename);
				String key = qiNiuConf.getPrefix() + "/rotation/" + fileName;
				String path = qiNiuConf.getCdn()+ key;
				Carousel bean=new Carousel(fileName,hash,path);
				try {
					qiNiuUtil.uploadFile(file,fileName,"/rotation");
					carouselMapper.insert(bean);
					success++;
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		return success;
	}

	@Override
	public Integer updateNameByName(String oldName, String newName,String path) {
		if (carouselMapper.selectByName(newName)==null){
			Integer integer = carouselMapper.updateNameByName(oldName, newName);
			carouselMapper.updatePathByPath(path,path.replaceFirst("/[^/]*$", "/"+newName));
			if (integer==1){
				return qiNiuUtil.updateFileName(oldName, newName);
			}
		}
		return 0;
	}

	@Override
	public Integer deleteByName(String name,Integer id) {
		SysSetup sysSetup = sysSetupMapper.selectById(1);
		List<Integer> list= Arrays.stream(StringSubUtil.SubString(sysSetup.getRotation()).trim()
				.replaceAll("\\s+", "")
				.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		boolean t=false;
		for (Integer integer : list) {
			if (id.equals(integer)){
				t=true;
				return 2;
			}
		}
		Integer integer = qiNiuUtil.deleteFiles(name, "/rotation");
		if (integer==1){
			return carouselMapper.deleteByName(name);
		}
		return 0;
	}
}