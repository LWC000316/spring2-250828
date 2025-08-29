package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

@Configuration
@RequiredArgsConstructor
public class AppConfig {


    @Autowired
    @Lazy
    private AppConfig self;  //중국집 연락처

    @Bean
    public ApplicationRunner myApplicationRunner3() {
        return args -> {
            //리얼 객체의 메서드 호출
            this.work1();
            this.work2();

            // 프록시 객체의 메서드 호출
            self.work1();
            self.work2();
        };
    }

    @Transactional
    public void work1() {
        System.out.println("work1");
    }

    @Transactional
    public void work2() {
        System.out.println("work2");
    }

}
