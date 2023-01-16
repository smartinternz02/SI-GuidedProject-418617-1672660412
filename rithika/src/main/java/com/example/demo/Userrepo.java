package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User;
import com.example.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}
