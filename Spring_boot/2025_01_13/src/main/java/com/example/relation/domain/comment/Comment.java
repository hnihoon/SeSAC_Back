package com.example.relation.domain.comment;

import com.example.relation.domain.comment.dto.CommentRequestDto;
import com.example.relation.domain.post.entity.Post;
import com.example.relation.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티니까 필요
@Getter // 엔티티는 정보를 불러와 사용해야 하기에 필요
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA를 사용하기 위해서는 엔티티에 기본 생성자 필수
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @Builder
    public Comment(String content, Post post) {
        this.content = content;
//        this.post = post;
        setPost(post);
    }

    public Comment update(CommentRequestDto requestDto){
        this.content = requestDto.getContent();
        return this;
    }

    //편의 메소드
    public void setPost(Post post) {
        this.post = post;

        post.getComments().add(this);
    }
}
