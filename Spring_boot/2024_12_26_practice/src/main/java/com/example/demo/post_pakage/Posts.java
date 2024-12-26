package com.example.demo.post_pakage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Posts {
    List<Post> posts = new ArrayList<>();
    Long num = 0L;

    {
        posts.add((new Post(++num, "제목"+num, "내용"+num)));
    }

    @GetMapping("/")
    public String postsHome(){
        return "홈화면";
    }


    // create
    @GetMapping("/posts/create")
    public Post postsCreate(){
        Post post = new Post(++num,"제목"+num, "내용"+num);
        posts.add(post);

        return post;
    }

    // rade-all
    @GetMapping("/posts")
    public List<Post> postsReadAll(){
        return posts;
    }

    // read-one
    @GetMapping("/posts/one/{id}")
    public Post postsReadOne(@PathVariable Long id){
        for (Post post : posts) {
            if (post.getId().equals(id)){
                return post;
            }
        }
        return null;
    }

    // update
    @GetMapping("posts/update/{id}")
    public Post postsUpdate(@PathVariable Long id){
        for (Post post : posts) {
            if (post.getId().equals(id)){
                post.setTitle("변경된 제목" + id);
                post.setContent("변경된 내용" + id);
                return post;
            }
        }
        return null;
    }

    // delete
    @GetMapping("posts/delete/{id}")
    public RedirectView postsDelete(@PathVariable Long id){
        Post removePost = null;
        for (Post post : posts) {
            if(post.getId().equals(id)){
                removePost = post;
            }
        }
        posts.remove(removePost);
        return null;
    }
}
