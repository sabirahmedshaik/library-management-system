package com.sabir.springboot.mapper;

import com.sabir.springboot.dto.UserDto;
import com.sabir.springboot.entities.User;

public class UserMapper {

    public UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }

    public User mapToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        return user;
    }
}
