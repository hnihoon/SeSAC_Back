package com.example.demo.myjpasite_v4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostRepositoryV4 extends JpaRepository<PostV4, Long> {
}