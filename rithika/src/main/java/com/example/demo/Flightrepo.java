package com.example.demo;
import com.example.demo.User;
import com.example.demo.UserIp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public interface Flightrepo extends CrudRepository<UserIp, Long> {
}



















