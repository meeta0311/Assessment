package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Meeta on 05/10/19.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
 public User findByUserName(String userName);
}
