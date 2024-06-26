package com.sns.post.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/post-service")
public class HealthCheckController {
    @GetMapping("/ping")
    public ResponseEntity<String> healthCheck() {
        log.info("###health check");
        return ResponseEntity.ok("pong");
    }
}