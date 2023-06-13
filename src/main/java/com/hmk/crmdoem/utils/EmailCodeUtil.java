package com.hmk.crmdoem.utils;

import java.util.Random;

public class EmailCodeUtil {
    public static String getCode() {
        // 定义随机数字符串的取值范围
        String range="0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(range.length());
            sb.append(range.charAt(index));
        }
        return sb.toString();
    }

}
