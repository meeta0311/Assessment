package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meeta on 05/10/19.
 */
public class UserDto {
    private Integer userId;
    private String userName;
    private ViewDataDTO viewDataDto;

    public UserDto(Integer userId, String userName, ViewDataDTO viewDataDto) {
        this.userId = userId;
        this.userName = userName;
        this.viewDataDto = viewDataDto;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ViewDataDTO getViewDataDto() {
        return viewDataDto;
    }

    public void setViewDataDto(ViewDataDTO viewDataDto) {
        this.viewDataDto = viewDataDto;
    }
}
