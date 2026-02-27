package org.example.expert.config;

import lombok.Getter;

@Getter
public class CustomPrincipal {
    private final Long userId;
    private final String role;

    public CustomPrincipal(Long userId, String role) {
        this.userId = userId;
        this.role = role;
    }
}
