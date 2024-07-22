package com.semicolon.africa.blogwithjava.data.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private String title;
    private String content;
    private int id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private  LocalDateTime updatedAt;
    private List<Comment> comments;
}
