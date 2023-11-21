package com.sopt.jointSeminar.controller;

import com.sopt.jointSeminar.common.response.ApiResponse;
import com.sopt.jointSeminar.common.response.SuccessStatus;
import com.sopt.jointSeminar.dto.response.PostGetResponse;
import com.sopt.jointSeminar.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public ApiResponse<List<PostGetResponse>> getPosts() {
        return ApiResponse.success(SuccessStatus.POST_GET_OK, postService.getPosts());
    }
}
