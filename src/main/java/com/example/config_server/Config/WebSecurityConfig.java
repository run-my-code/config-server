package com.example.config_server.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    // Spring boot security add a Basic Auth ,creates a default user with username
    // user and random
    // security
    // password: 2daf2fef-73a4-4149-9cae-d8cd3ab0bd4f
    // http://localhost:8888/config-server/default => 401

    // By default, Spring Security protects against CSRF attacks
    // This code configures Spring Security to disable CSRF and allow access to all
    // URLs without authentication.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
            throws Exception {
        return httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .build();
    }
}
