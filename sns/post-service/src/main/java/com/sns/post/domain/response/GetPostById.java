package com.sns.post.domain.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetPostById {
    private String postTitle;
    private String postContent;
}
