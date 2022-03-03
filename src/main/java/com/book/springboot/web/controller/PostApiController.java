package com.book.springboot.web.controller;

import com.book.springboot.web.dto.PostsSaveDto;
import com.book.springboot.web.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveDto postsSaveDto) {
        return postsService.save(postsSaveDto);
    }

}
