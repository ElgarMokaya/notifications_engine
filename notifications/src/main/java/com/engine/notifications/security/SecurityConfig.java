package com.engine.notifications.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.engine.notifications.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private  CustomUserDetailsService userDetailsService;
	
	 @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("elgar/mokaya").hasRole("USER")
                .requestMatchers("/api/configure-slack").hasRole("USER")
                .requestMatchers("/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(formLogin -> formLogin
                .loginPage("/login")
            
            );


        return http.build();
    }
//	 
	 @Bean
	 public AuthenticationManager authenticationManager(HttpSecurity http,  CustomUserDetailsService userDetailService)  throws Exception {
		    return http.getSharedObject(AuthenticationManagerBuilder.class)
		    	      .userDetailsService(userDetailsService)
		    	      .and()
		    	      .build();
	 }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
