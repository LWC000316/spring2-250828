package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonService personService; // AppConfig에서 스프링이 관리하는 객체를 주입해줌

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "사람 수 : %d".formatted(personService.count());
    }

}