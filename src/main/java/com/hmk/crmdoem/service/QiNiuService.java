package com.hmk.crmdoem.service;

import com.hmk.crmdoem.controller.pojo.UserPojo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface QiNiuService {

    Integer upload(MultipartFile file, UserPojo pojo) throws IOException;
}
