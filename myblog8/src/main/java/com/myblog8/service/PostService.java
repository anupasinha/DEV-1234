package com.myblog8.service;

import com.myblog8.payload.PostDto;
    public interface PostService {
        PostDto createPost(PostDto postDto);

        void deletePost(Long id);

        PostDto updatePost(Long id, PostDto postDto);

        PostDto getPostById(long id);
    }


