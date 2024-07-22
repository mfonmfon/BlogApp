package com.semicolon.africa.blogwithjava.data.repository;

import com.semicolon.africa.blogwithjava.data.model.Comment;
import com.semicolon.africa.blogwithjava.data.model.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    CommentRepositoryImpl commentRepository = new CommentRepositoryImpl();

    @Test
    public void testThatCommentRepoCanAddComment(){
        Comment comment = new Comment();
        comment.setPostComment("Hello");
        commentRepository.save(comment);
        assertEquals(1,commentRepository.findAllComments().size());
    }
    @Test
    public void testThatCommentRepo_isEmpty(){
        Comment comment= new Comment();
        assertTrue(commentRepository.isEmpty());
    }
    @Test
    public void testThatCommentRepoCanFindCommentById(){
        Comment comment = new Comment();
        comment.setUserId(12);
        comment.setPostComment("Pew-Pew");
        commentRepository.save(comment);
        commentRepository.findCommentById(12);
        assertEquals( null, commentRepository.findCommentById(12));
    }

    @Test
    public void testThatCommentRepoCanDeleteCommentById(){
        Comment comment = new Comment();
        comment.setUserId(123);
        comment.setPostComment("Come and eat");
        commentRepository.save(comment);
        commentRepository.deleteCommentById(12);
        assertEquals(null, commentRepository.findCommentById(123));
    }
}