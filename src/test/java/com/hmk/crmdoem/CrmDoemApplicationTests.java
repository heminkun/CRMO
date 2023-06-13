package com.hmk.crmdoem;


import com.hmk.crmdoem.config.QiNiuConf;
import com.hmk.crmdoem.entity.po.*;
import com.hmk.crmdoem.entity.query.*;
import com.hmk.crmdoem.mappers.*;
import com.hmk.crmdoem.service.SysSetupService;
import com.hmk.crmdoem.service.SysUserService;
import com.hmk.crmdoem.utils.FileNameSuffixUtil;
import com.hmk.crmdoem.utils.IdGenerator;
import com.hmk.crmdoem.utils.QiNiuUtil;
import com.hmk.crmdoem.utils.StringSubUtil;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class CrmDoemApplicationTests {

    @Resource
    private CarouselMapper<Carousel,CarouselQuery> carouselMapper;

    @Resource
    private SysSetupMapper<SysSetup, SysSetupQuery> sysSetupMapper;
    @Test
    void contextLoads() {
        String str = "example/path/to/file.txt";
        String result = str.replaceFirst("/[^/]*$", "/replacement");

        System.out.println(result); // example/path/to/replacement
    }
}
