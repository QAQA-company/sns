package com.sns.authservice.service.impl;

import com.sns.authservice.domain.request.SignInRequest;
import com.sns.authservice.domain.response.TokenResponse;
import com.sns.authservice.security.CustomUserDetails;
import com.sns.authservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;

    @Override
    public TokenResponse Auth(SignInRequest request) {
        Authentication authenticate = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getId(), request.getPassword()));

        CustomUserDetails principal = (CustomUserDetails) authenticate.getPrincipal();


        return null;
    }

    @Override
    public TokenResponse Refresh(String AccessToken) {
        return null;
    }
}
