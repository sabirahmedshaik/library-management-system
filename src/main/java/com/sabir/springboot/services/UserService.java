package com.sabir.springboot.services;

import com.sabir.springboot.dto.UserDto;
import com.sabir.springboot.entities.User;

public interface UserService {
    UserDto addUser(User user);

}
