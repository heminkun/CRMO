package com.hmk.crmdoem.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MultipartFileHash {
    public static String getHash(MultipartFile file) {
        try {
            // 创建 MessageDigest 对象并指定哈希算法
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // 获取文件输入流
            InputStream is = file.getInputStream();
            // 读取文件内容并计算哈希值
            int readCount;
            byte[] buffer = new byte[8192];
            while ((readCount = is.read(buffer)) > 0) {
                md.update(buffer, 0, readCount);
            }
            // 关闭文件输入流
            is.close();
            // 获取哈希结果并转化为十六进制字符串
            byte[] digest = md.digest();
            String hashString = new BigInteger(1, digest).toString(16);
            // 返回哈希值结果
            return hashString;
        } catch (NoSuchAlgorithmException | IOException ex) {
            // 处理异常
            ex.printStackTrace();
            return null;
        }
    }
}