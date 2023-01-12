package com.example.demo;

import com.example.demo.Userrepo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends CrudRepository<User, Long> {
    User findByEmailIdIgnoreCase(String emailId);
}
