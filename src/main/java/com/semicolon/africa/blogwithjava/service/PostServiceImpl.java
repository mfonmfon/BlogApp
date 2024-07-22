package com.semicolon.africa.blogwithjava.service;

import com.semicolon.africa.blogwithjava.data.model.Comment;
import com.semicolon.africa.blogwithjava.data.model.Post;
import com.semicolon.africa.blogwithjava.data.repository.PostRepositoryImp;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements  PostService{
    private PostRepositoryImp repositoryImp = new PostRepositoryImp();
    private Post post = new Post();

    @Override
    public Post addPost(String title, String content) {
        post.setTitle(title);
        post.setContent(content);
        return repositoryImp.save(post);
    }

    @Override
    public Post findPostById(int id) {
       return repositoryImp.findById(id);
    }

}
