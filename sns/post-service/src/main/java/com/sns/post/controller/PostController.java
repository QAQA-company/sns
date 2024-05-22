package com.sns.post.controller;

import com.sns.post.domain.request.UploadPostRequest;
import com.sns.post.domain.response.GetPost;
import com.sns.post.domain.response.GetPostById;
import com.sns.post.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/post-service")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public void createPost(@RequestBody UploadPostRequest request) {
        postService.savePost(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetPostById> getPost(@PathVariable int id) {
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @GetMapping("")
    public ResponseEntity<List<GetPost>> getPosts() {
        return ResponseEntity.ok().body(postService.getPosts());
    }

}