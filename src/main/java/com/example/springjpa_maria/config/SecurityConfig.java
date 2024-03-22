package com.example.springjpa_maria.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                // Các yêu cầu API có thể truy cập mà không cần xác thực
                .dispatcherTypeMatchers(HttpMethod.valueOf("/**")).permitAll()
                // Các yêu cầu khác yêu cầu xác thực
                .anyRequest().authenticated()
                .and()
                .formLogin(withDefaults()); // Cấu hình form login mặc định
    }
    /*
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin(withDefaults()); // Cấu hình form login mặc định
        return http.build();
    }*/
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.build();
    }

}