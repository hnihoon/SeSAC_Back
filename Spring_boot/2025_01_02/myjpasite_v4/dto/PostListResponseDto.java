package com.example.demo.myjpasite_v4.dto;

import com.example.demo.myjpasite_v4.PostV4;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostListResponseDto {
    private final Long id;

    private final String title;

    public static PostListResponseDto from(PostV4 entity) {
        return PostListResponseDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .build();

    }
}
