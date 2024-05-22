package com.sns.authservice.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.validator.constraints.Length;

@Entity
public class User {
    @Id
    @Column(nullable = false, length = 30)
    private String id;
    @Column(nullable = false, length = 100)
    private String password;
    @Column(length = 30)
    private String introduce;
}
