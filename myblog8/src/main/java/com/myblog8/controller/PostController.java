package com.myblog8.controller;

import com.myblog8.entity.Post;
import com.myblog8.payload.PostDto;
import com.myblog8.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/onboard")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);//201
    }
    //http://localhost:8080/api/post/1
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return new ResponseEntity<>("post is deleted",HttpStatus.OK);//200

    }
    //http://localhost:8080/api/post/1
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@PathVariable Long id,@RequestBody PostDto postDto){
        postService.updatePost(id,postDto);
        return new ResponseEntity<>(dto,HttpStatus.Ok);

    }

    //http://localhost:8080/api/post/1
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("id") long id){
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }


}
