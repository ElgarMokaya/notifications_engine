package com.engine.notifications.service;

import org.springframework.stereotype.Service;

import com.engine.notifications.models.User;


public interface UserService {
	 User findByUsername(String username);
	    void saveUser(User user);
}
