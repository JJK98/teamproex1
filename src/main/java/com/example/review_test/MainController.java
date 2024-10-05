package com.example.review_test;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/main")
    public String main(){
        return "MainPage";
    }


    @GetMapping("/admin")
    public String adminreview(){
        return "admin_page";
    }
//    @GetMapping("/notice")
//    public String notice(){
//        return "board_notice";
//    }
}

