package com.example.demo.converter;

import org.springframework.beans.BeanUtils;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.ViewDataDTO;
import com.example.demo.entity.User;
import com.example.demo.entity.ViewData;

/**
 * Created by Meeta on 05/10/19.
 */
public class UserConverter {


	public static User dtoToEntity(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto,user);
		ViewData viewDto=new ViewData();
		BeanUtils.copyProperties(userDto.getViewDataDto(),viewDto);
		user.setViewData(viewDto);
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user,userDto);
		ViewDataDTO viewDto=new ViewDataDTO();
		BeanUtils.copyProperties(user.getViewData(),viewDto);
		userDto.setViewDataDto(viewDto);
		return userDto;
	}
}
