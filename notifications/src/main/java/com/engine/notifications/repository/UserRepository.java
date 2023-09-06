package com.engine.notifications.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.engine.notifications.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	User findByUsername(String username);

}
