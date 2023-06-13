package com.hmk.crmdoem.controller;

import com.hmk.crmdoem.entity.vo.ResponseVO;
import com.hmk.crmdoem.service.EmailService;
import com.hmk.crmdoem.utils.EmailCodeUtil;
import com.hmk.crmdoem.utils.RedisService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;

@RestController
@RequestMapping("email")
@CrossOrigin
public class EmailController extends ABaseController {
    @Resource
    private RedisService redisService;
    @Resource
    EmailService emailService;

    @RequestMapping("send")
    public ResponseVO sendEmailCode(String email){
        String code= EmailCodeUtil.getCode();
        emailService.sendEmail(email,code);
        redisService.put(email,code,5);
        return getSuccessResponseVO(null);
    }
    @RequestMapping("verifyOldEmail")
    public ResponseVO verifyOldEmail(String email){
        String code=EmailCodeUtil.getCode();
        emailService.changeEmail(email,code);
        redisService.put(email,code,5);
        return getSuccessResponseVO(null);
    }
    @RequestMapping("change")
    public ResponseVO ChangeEmail(String email){
        String code=EmailCodeUtil.getCode();
        emailService.changeEmail(email,code);
        redisService.put(email,code,5);
        return getSuccessResponseVO(null);
    }
    @RequestMapping("forgotPass")
    public ResponseVO forgotPass(String email){
        String code=EmailCodeUtil.getCode();
        emailService.forgotPass(email,code);
        redisService.put(email,code,5);
        return getSuccessResponseVO(null);
    }

}
