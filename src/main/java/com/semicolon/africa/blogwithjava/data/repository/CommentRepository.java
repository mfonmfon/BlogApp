package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository {

    public   void deleteCommentById(int id);

    public Comment findCommentById(int id);

    public List<Comment> findAllComments();

    public  boolean isEmpty();

    public  Comment findCommentByPostId(int id);

    public void save(Comment comment);

    public void deleteAllComment();

    public long count();
}
