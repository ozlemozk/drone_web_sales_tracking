package com.iha.service.impl;

import com.iha.model.UserDto;
import com.iha.repository.UserRepository;
import com.iha.service.UserService;
import com.iha.service.mapper.UserMapper;
import com.iha.validator.UserValidator;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;
    private final UserValidator validator;


    public UserServiceImpl(UserRepository repository, UserMapper mapper, UserValidator validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }


    //zorunluluklar düzenlenemli @Valid eklenmeli
    @Override
    public UserDto save(UserDto dto) {
        dto.setPasswordDate(LocalDate.now());
        dto.setVersion(0L);
        return mapper.dtoToEntity(repository.save(mapper.entityToDTO(dto)));

    }

    @Override
    public UserDto update(UserDto dto) {
        UserDto dtoDb = mapper.dtoToEntity(repository.findById(dto.getId()).get());
        validator.updateControl(dtoDb.getPasswordDate());
        dtoDb.setVersion(dtoDb.getVersion() + 1);
        dtoDb.setUserName(dto.getUserName());
        dtoDb.setPassword(dto.getPassword());
        dtoDb.setPasswordDate(LocalDate.now());
        return mapper.dtoToEntity(repository.save(mapper.entityToDTO(dto)));

    }


}
