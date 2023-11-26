package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<Post, Long> {
}
