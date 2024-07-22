package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImpTest {



    @Test
    public void testThatMyPostIsEmpty(){
        PostRepositoryImp postRepositoryImp = new PostRepositoryImp();
       assertTrue(postRepositoryImp.isEmpty());
    }


    @Test
    public void testThatPostRepositoryCanSavePost(){
        Post posts = new Post();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        posts.setTitle("Mfon");
        posts.setContent("Mfon is a software engineer");
        repositoryImp.save(posts);
        assertEquals(1,repositoryImp.count());
    }

    @Test
    public void testThatPostRepositoryCanFindPostById(){
        Post post = new Post();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        post.setTitle("Mfon");
        post.setContent("Mfon is a very good backend engineer");
        post.setId(12);
        repositoryImp.save(post);
        assertEquals(12,repositoryImp.findById(12).getId());
    }

    @Test
    public void testThatCanSetPostById(){
        Post post = new Post();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        post.setId(123);
        repositoryImp.save(post);
        assertEquals(1, repositoryImp.count());
    }

    @Test
    public void testThatYouCanDeletePostById(){
        Post post = new Post();
        PostRepositoryImp repositoryImp = new PostRepositoryImp();
        post.setId(12);
        post.setTitle("Semicolon");
        post.setContent("Training software talents");
        repositoryImp.save(post);
        repositoryImp.deleteById(1);
        assertEquals(post, repositoryImp.findById(12));
    }
}