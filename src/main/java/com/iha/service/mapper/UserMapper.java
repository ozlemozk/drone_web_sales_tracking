package com.iha.service.mapper;

import com.iha.entity.User;
import com.iha.model.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    // @AfterMapping vs var

    UserDto dtoToEntity(User user);
}
