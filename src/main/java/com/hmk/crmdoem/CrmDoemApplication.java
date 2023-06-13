package com.hmk.crmdoem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CrmDoemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmDoemApplication.class, args);
    }

}
