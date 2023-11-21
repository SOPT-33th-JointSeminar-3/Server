package com.sopt.jointSeminar.service;

import com.sopt.jointSeminar.dto.response.PostGetResponse;
import com.sopt.jointSeminar.repository.PostJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostJpaRepository postJpaRepository;

    public List<PostGetResponse> getPosts() {
        return postJpaRepository.findAll()
                .stream()
                .map(post -> PostGetResponse.of(post))
                .toList();
    }
}
