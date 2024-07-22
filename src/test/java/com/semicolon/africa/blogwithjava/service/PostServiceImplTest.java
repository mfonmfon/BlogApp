package com.semicolon.africa.blogwithjava.service;

import com.semicolon.africa.blogwithjava.data.model.Post;
import com.semicolon.africa.blogwithjava.data.repository.PostRepositoryImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {

    @Test
    public void testThatPostServiceCanAddPost(){
        PostServiceImpl service = new PostServiceImpl();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        Post post = service.addPost("Semicolon", "A software enginnering school that train talent");
        repositoryImp.save(post);
        assertEquals(1,repositoryImp.findAll().size());
    }
    @Test
    public void testThatPostServiceCanGetAllPost(){
        PostServiceImpl service = new PostServiceImpl();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        Post post = new Post();
        post.setId(1);
        repositoryImp.findById(12);
        assertEquals(1,repositoryImp.count());
    }
}