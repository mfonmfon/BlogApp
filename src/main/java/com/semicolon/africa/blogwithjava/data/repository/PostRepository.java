package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository {

    Post findById(int id);

    Post save(Post post);

    void deleteById(int post);

    void  deleteAll();

    List<Post> findAll();

    long count();

    boolean isEmpty();

}
