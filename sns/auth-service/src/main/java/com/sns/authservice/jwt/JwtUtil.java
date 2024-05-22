package com.sns.authservice.jwt;

import com.sns.authservice.domain.request.SignInRequest;
import io.jsonwebtoken.Jwts;

public class JwtUtil {

    public String generateAccessToken(SignInRequest request) {
        return Jwts.builder()
                .compact();
    }

}
