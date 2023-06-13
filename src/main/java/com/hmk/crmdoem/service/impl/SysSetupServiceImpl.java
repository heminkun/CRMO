package com.hmk.crmdoem.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.hmk.crmdoem.entity.po.Carousel;
import com.hmk.crmdoem.entity.query.CarouselQuery;
import com.hmk.crmdoem.mappers.CarouselMapper;
import com.hmk.crmdoem.utils.StringSubUtil;
import org.springframework.stereotype.Service;

import com.hmk.crmdoem.entity.enums.PageSize;
import com.hmk.crmdoem.entity.query.SysSetupQuery;
import com.hmk.crmdoem.entity.po.SysSetup;
import com.hmk.crmdoem.entity.vo.PaginationResultVO;
import com.hmk.crmdoem.entity.query.SimplePage;
import com.hmk.crmdoem.mappers.SysSetupMapper;
import com.hmk.crmdoem.service.SysSetupService;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("sysSetupService")
public class SysSetupServiceImpl implements SysSetupService {

	@Resource
	private SysSetupMapper<SysSetup,SysSetupQuery> sysSetupMapper;

	@Resource
	private CarouselMapper<Carousel, CarouselQuery> carouselMapper;
	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SysSetup> findListByParam(SysSetupQuery param) {
		return this.sysSetupMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SysSetupQuery param) {
		return this.sysSetupMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<SysSetup> findListByPage(SysSetupQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<SysSetup> list = this.findListByParam(param);
		PaginationResultVO<SysSetup> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(),page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SysSetup bean){
		return this.sysSetupMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SysSetup> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysSetupMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<SysSetup> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.sysSetupMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id获取对象
	 */
	@Override
	public SysSetup getSysSetupById(Integer id){
		return this.sysSetupMapper.selectById(id);
	}

	/**
	 * 根据Id修改
	 */
	@Override
	public Integer updateSysSetupById(SysSetup bean,Integer id){
		return this.sysSetupMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteSysSetupById(Integer id){
		return this.sysSetupMapper.deleteById(id);
	}
	public List<Carousel>getSetUpCarousel(){
		SysSetup sysSetup = sysSetupMapper.selectById(1);
		List<Carousel> carouselList=new ArrayList<>();
		List<Integer> list= Arrays.stream(StringSubUtil.SubString(sysSetup.getRotation()).trim()
				.replaceAll("\\s+", "")
				.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		for (Integer integer : list) {
			Carousel carousel = carouselMapper.selectById(integer);
			carouselList.add(carousel);
		}
		return carouselList;
	}

	@Override
	public List<Integer> getSetUp() {
		SysSetup sysSetup = sysSetupMapper.selectById(1);
		List<Integer> list= Arrays.stream(StringSubUtil.SubString(sysSetup.getRotation()).trim()
				.replaceAll("\\s+", "")
				.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		return list;
	}

	@Override
	public Integer updateSetUpCarousel(Integer[] integers) {
		SysSetup sysSetup=new SysSetup();
		sysSetup.setRotation(Arrays.toString(integers));
		return sysSetupMapper.updateById(sysSetup,1);
	}
}