package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository{
     List<Comment> comments = new ArrayList<>();
    private boolean isDeleteAll = true;
    private long count = 1;


    @Override
    public void deleteCommentById(int id) {
        for (Comment comment : comments){
            if (comment.getUserId() == id){
                comments.remove(id);
                break;
            }
        }
    }

    @Override
    public Comment findCommentById(int id) {
       for (Comment comment : comments){
           if (comment.getPostId() == id){
               return comment;
           }
       }
       return null;
    }

    @Override
    public List<Comment> findAllComments() {
        return comments;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Comment findCommentByPostId(int id) {
       for (Comment comment : comments){
           if(comment.getPostId() == id){
               return comment;
           }
       }
       return null;
    }

    @Override
    public void save(Comment comment) {
        comments.add(comment);
    }

    @Override
    public void deleteAllComment() {
        comments.clear();
    }

    @Override
    public long count() {
        return count;
    }
}
