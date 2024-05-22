package com.sns.post.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "tbl_post")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    @NotBlank
    @Length(min = 1, max = 50)
    private String postTitle;
    @NotBlank
    @Length(min = 1, max = 500)
    private String postContent;
    @NotBlank
    private String postAuthor;

    private String postImageName;
    private String postImagePath;

    private int postLikeCount;

    @OneToMany
    private List<Comment> postComment;
    private int postCommentCount;
}
