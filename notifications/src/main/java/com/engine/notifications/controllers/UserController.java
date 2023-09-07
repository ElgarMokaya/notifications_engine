package com.engine.notifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.notifications.models.User;
import com.engine.notifications.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
    @Autowired
    private AuthenticationManager authenticationManager;

    

    @Autowired
    private UserService userService;
    
     @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser) {
        // Authenticate the user
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword()));
        
        // Set the authentication in the security context
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Return a success response
        return ResponseEntity.ok("Login successful!");
    }
        


}
