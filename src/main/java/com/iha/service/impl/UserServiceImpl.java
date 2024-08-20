package com.iha.service.impl;

import com.iha.model.UserDto;
import com.iha.repository.UserRepository;
import com.iha.service.UserService;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDto save(UserDto dto) {
        return null;
    }
}
