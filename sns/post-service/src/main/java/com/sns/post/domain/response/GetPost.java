package com.sns.post.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetPost {
    private int postId;
    private String postTitle;
    private String postContent;
}
