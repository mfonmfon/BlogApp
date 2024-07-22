package com.semicolon.africa.blogwithjava.web;

import com.semicolon.africa.blogwithjava.data.model.Post;
import com.semicolon.africa.blogwithjava.data.repository.PostRepositoryImp;
import com.semicolon.africa.blogwithjava.service.PostServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PostController {

    @PostMapping("/post{}")
    public String createPost(@PathVariable String title, @PathVariable String content){
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        PostServiceImpl service = new PostServiceImpl();
        Post post = service.addPost(title, content);
        return "successfully posted";
    }

    @GetMapping("/post{id}")
    public Post getPost(@PathVariable int id){
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        return repositoryImp.findById(id);
    }
}
