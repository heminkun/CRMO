package com.hmk.crmdoem.controller;

import com.hmk.crmdoem.controller.pojo.UserPojo;
import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.QiNiuService;
import com.hmk.crmdoem.utils.QiNiuUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController("qiNiuController")
@RequestMapping("qiniu")
@CrossOrigin
public class QiNiuController extends ABaseController {
    @Resource
    QiNiuService qiNiuService;
    @RequestMapping("/upload")
    public ResponseVO upload(MultipartFile file, UserPojo pojo) throws IOException {
        if (qiNiuService.upload(file,pojo)>0){
            return getSuccessResponseVO(null);
        }
        return getServerErrorResponseVO(null);
    }
}
