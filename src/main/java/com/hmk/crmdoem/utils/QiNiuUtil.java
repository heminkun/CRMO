package com.hmk.crmdoem.utils;


import com.hmk.crmdoem.config.QiNiuConf;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.UUID;

@Component
public class QiNiuUtil {
    @Resource
    QiNiuConf qiNiuConf;

    public Integer uploadFile(MultipartFile file,String filename,String folder) throws IOException {
        Zone zone=Zone.zone2();
        Configuration cfg = new Configuration(zone);
        UploadManager uploadManager = new UploadManager(cfg);
        Auth auth = Auth.create(qiNiuConf.getAccessKey(), qiNiuConf.getSecretKey());
        String upToken = auth.uploadToken(qiNiuConf.getBucket());
        try {
            if (file!=null) {
                byte[] data = file.getBytes();
                String key = qiNiuConf.getPrefix()+ folder + "/" + filename;
                Response response = uploadManager.put(data, key, upToken);
                return 1;
            }
        } catch (QiniuException ex) {
            System.err.println(ex.response.bodyString());
            return 0;
        }
        return 0;
    }
    public Integer deleteFiles(String fileName,String folder){
        int i=0;
        Zone zone=Zone.zone2();
        Auth auth = Auth.create(qiNiuConf.getAccessKey(), qiNiuConf.getSecretKey());
        BucketManager bucketManager = new BucketManager(auth, new Configuration(zone));
        try {
            bucketManager.delete(qiNiuConf.getBucket(),qiNiuConf.getPrefix()+folder+"/"+fileName);
            i=1;
        }catch (QiniuException ex){
            System.err.println(ex.response);
        }
        return i;
    }
    public Integer updateFileName(String oldName,String newName){
        int i=0;
        Zone zone=Zone.zone2();
        Auth auth = Auth.create(qiNiuConf.getAccessKey(), qiNiuConf.getSecretKey());
        BucketManager bucketManager = new BucketManager(auth, new Configuration(zone));
        try {
            bucketManager.rename(qiNiuConf.getBucket(),"crm/rotation/"+oldName,"crm/rotation/"+newName);
            i=1;
            return i;
        }catch (QiniuException ex){
            System.err.println(ex.response);
            return i;
        }
    }
    public static String getRandomImgName(String fileName) throws IllegalArgumentException {
        int index = fileName.lastIndexOf(".");

        if (fileName.isEmpty() || index == -1) {
            throw new IllegalArgumentException();
        }
        // 获取文件后缀
        String suffix = fileName.substring(index).toLowerCase();
        // 生成UUID
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 拼接新的名称
        return uuid + suffix;
    }
}
