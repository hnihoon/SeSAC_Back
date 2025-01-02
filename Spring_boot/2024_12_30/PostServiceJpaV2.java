package com.example.demo.myjpasite_v2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceJpaV2 {

    private  final PostRepositoryJpaV2 postRepositoryJpaV2;

//  수정한 코드
    public PostJpaV2 createPost(PostJpaV2 post){
        return postRepositoryJpaV2.save(post);
    }


//    --------------------------------- 기존코드 ---------------------------------

//    public List<PostJpaV2> readPost(){
//        return postRepositoryJpaV2.findAll();
//    }
//
//    public PostJpaV2 readPostById(Long id){
//        return postRepositoryJpaV2.findById(id).orElseThrow(() -> new IllegalArgumentException("id가 없습니다"));
//    }
//
//    public PostJpaV2 updatePost(Long id, PostJpaV2 updatePost ) {
//        PostJpaV2 post = postRepositoryJpaV2.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("없는 Post입니다."));
//
//        String title = updatePost.getTitle();
//        String content = updatePost.getContent();
//
//        post.update(title,content);
//
//        return postRepositoryJpaV2.save(post);
//    }
//
//    public void deletePost(Long id){
//        PostJpaV2 post = postRepositoryJpaV2.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("id가 없습니다."));
//        postRepositoryJpaV2.delete(post);
//    }
//    --------------------------------- 기존코드 ---------------------------------



}
