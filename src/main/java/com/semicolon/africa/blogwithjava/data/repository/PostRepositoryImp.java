package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImp implements PostRepository{

    private List<Post> posts = new ArrayList<>();
    private long count = 1;
    private boolean isEmpty = true;


    @Override
    public Post findById(int id) {
       for (Post listOfPosts : posts){
           if(listOfPosts.getId() == id){
               return listOfPosts;
           }
       }
       return null;
    }

    @Override
    public Post save(Post post) {
        posts.add(post);
        return post;
    }

    @Override
    public void deleteById(int postId) {
       for (Post listOfPosts : posts){
           if(listOfPosts.getId() == postId){
                posts.remove(postId);
                break;
           }
       }
    }

    @Override
    public void deleteAll() {
        posts.clear();
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
