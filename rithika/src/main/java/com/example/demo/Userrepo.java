package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ravibabu.flightaware.models.User;
import com.ravibabu.flightaware.models.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}
