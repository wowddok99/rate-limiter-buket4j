package com.example.rate_limiter_buket4j_sample.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostApi {
    @GetMapping
    public String getPost() {
        return "게시글 조회 완료";
    }
}