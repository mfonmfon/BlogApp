package com.semicolon.africa.blogwithjava.service;

import com.semicolon.africa.blogwithjava.data.model.Post;

public interface PostService {


    Post addPost(String title, String content);

    Post findPostById(int id);

}
