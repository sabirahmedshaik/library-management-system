package com.sabir.springboot.services.impl;

import com.sabir.springboot.dto.UserDto;
import com.sabir.springboot.entities.User;
import com.sabir.springboot.mapper.UserMapper;
import com.sabir.springboot.repositories.UserRepository;
import com.sabir.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }
}
