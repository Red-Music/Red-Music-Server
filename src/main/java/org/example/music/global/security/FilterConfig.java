package org.example.music.global.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.music.global.error.ExceptionFilter;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;

@RequiredArgsConstructor
public class FilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    private final ObjectMapper objectMapper;

    @Override
    public void configure(HttpSecurity builder) {
        ExceptionFilter exceptionFilter = new ExceptionFilter(objectMapper);
        builder.addFilterBefore(exceptionFilter, AuthorizationFilter.class);
    }
}