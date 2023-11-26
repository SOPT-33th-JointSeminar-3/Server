package com.sopt.jointSeminar.dto.response;

import com.sopt.jointSeminar.domain.Post;

public record PostGetResponse(
    Long id,
    String title,
    String date
) {
    public static PostGetResponse of(Post post) {
        return new PostGetResponse(
                post.getPostId(),
                post.getTitle(),
                post.getDate()
        );
    }
}
