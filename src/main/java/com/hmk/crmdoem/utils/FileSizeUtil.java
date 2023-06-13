package com.hmk.crmdoem.utils;

import org.springframework.web.multipart.MultipartFile;

public class FileSizeUtil {
    public static Boolean handleFileUpload(MultipartFile file) {
        // 获取文件大小（单位为字节）
        long fileSize = file.getSize();
        // 判断文件大小是否超过限制（例如，不超过 5 MB）
        long maxFileSize = 5 * 1024 * 1024; // 5 MB
        // 处理上传逻辑...
        return fileSize <= maxFileSize;

    }
}
