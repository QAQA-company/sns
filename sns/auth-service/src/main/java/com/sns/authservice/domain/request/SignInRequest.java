package com.sns.authservice.domain.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequest {
    private String id;
    private String password;
}
