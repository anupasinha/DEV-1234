package com.myblog8.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//07/11
//07/13
//07/14 get all the blog
//07/17 update
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
        (
                name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
        )
public class Post {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;
}

