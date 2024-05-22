package com.sns.authservice.service;

import com.sns.authservice.domain.request.SignInRequest;
import com.sns.authservice.domain.response.TokenResponse;

public interface AuthService {
    TokenResponse Auth(SignInRequest request);
    TokenResponse Refresh(String AccessToken);
}
