package com.sns.post.service;

import com.sns.post.domain.request.UploadPostRequest;
import com.sns.post.domain.response.GetPost;
import com.sns.post.domain.response.GetPostById;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Override
    public void savePost(UploadPostRequest request) {

    }

    @Override
    public GetPostById getPostById(int postId) {
        return null;
    }

    @Override
    public List<GetPost> getPosts() {
        return List.of();
    }

}
