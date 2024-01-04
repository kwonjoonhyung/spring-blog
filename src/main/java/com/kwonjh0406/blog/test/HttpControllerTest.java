package com.kwonjh0406.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


// 사용자가 요청 -> 응답(DATA) -> RestController
@Controller
public class HttpControllerTest {

    //http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(){
        return "get 요청";
    }
    @GetMapping("/home")
    public String homeTest(){
        return "/home.html";
    }

    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
