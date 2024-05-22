package com.sns.post.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadPostRequest {
    private int postId;
    private String postTitle;
    private String postContent;
}
