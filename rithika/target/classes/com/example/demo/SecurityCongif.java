package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityCongif {

}

/*
@Configuration
public class SecurityConfiguration {
	@Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authz) -> authz
                .anyRequest().authenticated());
        return http.build();
    }

}
*/

