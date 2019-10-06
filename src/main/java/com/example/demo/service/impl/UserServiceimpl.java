package com.example.demo.service.impl;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.ViewDataDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Meeta on 05/10/19.
 */
@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Cacheable("user")
	@Override
	public void saveUser(UserDto userDto) { userRepository.save(UserConverter.dtoToEntity(userDto)); }

	@Override
	public List<UserDto> getAllUsers() {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public UserDto sortArray(UserDto userDto) {
		long startTime=System.nanoTime();;
		ViewDataDTO view=userDto.getViewDataDto();
		System.out.println("checking "+view.getInputArray().length);
		int x[]=Arrays.copyOf(view.getInputArray(),view.getInputArray().length);
		int count=bubbleSort(x);
		view.setOutArray(x);
		long endTime=System.nanoTime();
		view.setTimeToSort(endTime-startTime);
		view.setNoOfComparisons(count);
		userDto.setViewDataDto(view);
		return userDto;
	}

	private int bubbleSort(int arr[])
	{
		int n = arr.length;
		int count=0;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
		return count;
	}


}
