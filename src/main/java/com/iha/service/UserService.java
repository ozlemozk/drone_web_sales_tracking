package com.iha.service;

import com.iha.model.UserDto;

public interface UserService {
    UserDto save(UserDto dto);

    UserDto update(UserDto dto);
}
