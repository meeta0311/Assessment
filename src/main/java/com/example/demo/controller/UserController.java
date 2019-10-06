package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.utils.Constants;

/**
 * Created by Meeta on 05/10/19.
 */
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		System.out.println("test controller"+userDto.getUserName());
		System.out.println("value"+userDto.getViewDataDto());
		System.out.println("length"+userDto.getViewDataDto().getInputArray().length);
		userDto=userService.sortArray(userDto);
		userService.saveUser(userDto);
	}
}
