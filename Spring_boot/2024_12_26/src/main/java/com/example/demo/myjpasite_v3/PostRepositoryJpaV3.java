package com.example.demo.myjpasite_v3;


import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class PostRepositoryJpaV3 {
    private final EntityManager emf;

    public PostJpaV3 save(PostJpaV3 post) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {

            tx.begin();
            em.persist(post);
            tx.commit();
            return post;

        } catch (Exception e) {

            tx.rollback();
            throw e;

        } finally {

            em.close();

        }
    }

//    public PostJpaV3 save(PostJpaV3 post){
//        em.persist(post);
//        return post;
//    }
//
//    public List<PostJpaV3> findAll(){
//        return em.createQuery("SELECT p FROM PostJpaV3 p", PostJpaV3.class)
//                .getResultList();
//    }
//
//    public PostJpaV3 findById(Long id) {
//        return em.find(PostJpaV3.class, id);
//    }
//
//    public PostJpaV3 update(Long id, PostJpaV3 updatedPost) {
//        PostJpaV3 post = em.find(PostJpaV3.class, id);
//
//        String newTitle = updatedPost.getTitle();
//        String newContent = updatedPost.getContent();
//
//        post.update(newTitle, newContent);
//        return post;
//    }
//
//    public void delete(Long id) {
//        PostJpaV3 post = em.find(PostJpaV3.class, id);
//        em.remove(post);
//    }









}



