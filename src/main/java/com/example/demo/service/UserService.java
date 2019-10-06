package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;

/**
 * Created by Meeta on 05/10/19.
 */
public interface UserService {
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto sortArray(UserDto userDto);
}
