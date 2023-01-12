package com.example.demo;

import com.example.demo.UserIp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Flightrepo extends CrudRepository<UserIp, Long> {
}



















