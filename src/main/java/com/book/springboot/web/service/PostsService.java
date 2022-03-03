package com.book.springboot.web.service;

import com.book.springboot.web.Repository.PostsRepository;
import com.book.springboot.web.dto.PostsSaveDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // 생성자 만들어 의존성 주입 해줌
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public long save(PostsSaveDto postsSaveDto) {
        return postsRepository.save(postsSaveDto.toEntity()).getId();
    }
}
