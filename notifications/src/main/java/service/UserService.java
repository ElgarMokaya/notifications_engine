package service;

import org.springframework.stereotype.Service;

import model.User;


public interface UserService {
	 User findByUsername(String username);
	    void saveUser(User user);
}
