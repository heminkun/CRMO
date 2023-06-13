package com.hmk.crmdoem.utils;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileNameSuffixUtil {
    @Value("${suffixwhitelist}")
    public String[] allowedExtensions;
    public boolean isAllowedFileType(String fileName) {
        if (fileName != null && !fileName.isEmpty()) {
            String extension = FilenameUtils.getExtension(fileName);
            for (String allowedExt : allowedExtensions) {
                if (allowedExt.equalsIgnoreCase(extension)) {
                    return true;
                }
            }
        }
        return false;
    }
}
