package com.hmk.crmdoem.service.impl;

import com.hmk.crmdoem.config.QiNiuConf;
import com.hmk.crmdoem.controller.pojo.UserPojo;
import com.hmk.crmdoem.entity.po.SysUser;
import com.hmk.crmdoem.mappers.SysUserMapper;
import com.hmk.crmdoem.service.QiNiuService;
import com.hmk.crmdoem.utils.FileNameSuffixUtil;
import com.hmk.crmdoem.utils.FileSizeUtil;
import com.hmk.crmdoem.utils.QiNiuUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@Service("qiNiuService")
public class QiNiuServiceImpl implements QiNiuService {

    @Resource
    QiNiuUtil qiNiuUtil;
    @Resource
    SysUserMapper userMapper;
    @Resource
    QiNiuConf qiNiuConf;
    @Resource
    FileNameSuffixUtil fileNameSuffixUtil;

    @Override
    public Integer upload(MultipartFile file, UserPojo pojo) throws IOException {
        if (FileSizeUtil.handleFileUpload(file)){
            if (fileNameSuffixUtil.isAllowedFileType(file.getOriginalFilename())){
                String fileName = QiNiuUtil.getRandomImgName(file.getOriginalFilename());
                String path= qiNiuConf.getCdn()+qiNiuConf.getPrefix()+"/icon"+"/"+fileName;
                userMapper.updateUserIcoByID(path, pojo.getId());
                return qiNiuUtil.uploadFile(file,fileName,"/icon");
            }else {
                return 0;
            }
        }
        return 0;
    }
}
