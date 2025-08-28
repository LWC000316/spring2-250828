package com.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // -> 스프링이 자기가 관리하는 객체로 등록하고 관리해줌 + 실행까지 시킴
    public PersonService personService() {
        System.out.println("AppConfig.personService 호출됨!");
        return new PersonService();
    }
}
