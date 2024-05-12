package com.sabir.springboot.services;

import com.sabir.springboot.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> getUsers();

}
