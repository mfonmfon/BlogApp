package com.semicolon.africa.blogwithjava.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int userId;
    private int postId;
    private String postComment;
    private LocalDateTime createdAt;
}
