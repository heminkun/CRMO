package com.hmk.crmdoem.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;


public class IdGenerator {
    public static long generateId() {
        Instant now = Instant.now(); // 获取当前时间戳
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.systemDefault()).withLocale(Locale.CHINA);
        String formattedTime = formatter.format(now); // 将时间戳按指定格式转换为字符串
        return Long.parseLong(formattedTime); // 将字符串解析为long类型返回
    }
}
