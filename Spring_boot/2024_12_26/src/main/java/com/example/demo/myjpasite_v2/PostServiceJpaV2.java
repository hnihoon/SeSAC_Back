package com.example.demo.myjpasite.myjpasite;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceJpa {

    private  final PostRepositoryJpa postRepositoryJpa;


    public PostServiceJpa(PostRepositoryJpa postRepositoryJpa) {
        this.postRepositoryJpa = postRepositoryJpa;
    }

    public PostJpa createPost(PostJpa post){
        return postRepositoryJpa.save(post);
    }

    public List<PostJpa> readPost(){
        return postRepositoryJpa.findAll();
    }

    public PostJpa readPostById(Long id){
        return postRepositoryJpa.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
    }

    public PostJpa updatePost(Long id, PostJpa updatePost ) {
        PostJpa post = postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다."));

        String title = updatePost.getTitle();
        String content = updatePost.getContent();

        post.update(title,content);

        return postRepositoryJpa.save(post);
    }

    public void deletePost(Long id){
        PostJpa post = postRepositoryJpa.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다."));
        postRepositoryJpa.delete(post);
    }
}
