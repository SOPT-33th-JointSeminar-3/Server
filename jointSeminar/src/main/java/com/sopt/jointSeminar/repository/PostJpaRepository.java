package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostJpaRepository extends JpaRepository<Post, Long> {
}
