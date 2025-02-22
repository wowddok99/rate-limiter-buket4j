package com.example.rate_limiter_buket4j_sample.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {
    @GetMapping
    public String getTest() {
        return "테스트 완료";
    }
}
