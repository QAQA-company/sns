package com.sns.post.service;

import com.sns.post.domain.request.UploadPostRequest;
import com.sns.post.domain.response.GetPost;
import com.sns.post.domain.response.GetPostById;

import java.util.List;

public interface PostService {
    void savePost(UploadPostRequest request);
    GetPostById getPostById(int postId);
    List<GetPost> getPosts();
}
