package com.hmk.crmdoem.service;

public interface EmailService {

    void sendEmail(String email,String code);
    void changeEmail(String email,String code);
    void forgotPass(String email,String code);
}
