package com.sns.post.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadImageRequest {
    private int postId;
    private String fileName;
    private String filePath;
}
