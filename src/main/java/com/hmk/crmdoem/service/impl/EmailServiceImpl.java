package com.hmk.crmdoem.service.impl;

import com.hmk.crmdoem.service.EmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmailServiceImpl implements EmailService {
    @Resource
    JavaMailSender javaMailSender;
    public void sendEmail(String email,String code){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("CRM");
        message.setText("您的注册校验验证码为："+code+",有效期5分钟");
        message.setTo(email);
        message.setFrom("2118238817@qq.com");
        javaMailSender.send(message);
    }
    public void changeEmail(String email,String code){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("CRM");
        message.setText("您正在进行换绑邮箱操作,验证码为:"+code+",有效期5分钟,如果不是本人在操作,您的账号有被盗的风险！请尽快更改密码");
        message.setTo(email);
        message.setFrom("2118238817@qq.com");
        javaMailSender.send(message);
    }

    @Override
    public void forgotPass(String email, String code) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("CRM");
        message.setText("您正在进行找回密码操作,验证码为:"+code+",有效期5分钟,如果不是本人在操作,请不要让其他人知道该邮箱内容");
        message.setTo(email);
        message.setFrom("2118238817@qq.com");
        javaMailSender.send(message);
    }
}
