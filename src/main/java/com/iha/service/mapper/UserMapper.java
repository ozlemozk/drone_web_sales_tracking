package com.iha.service.mapper;

import com.iha.entity.User;
import com.iha.model.UserDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", uses = {RentMapper.class})

public interface UserMapper {

    //  @AfterMapping olan kısmı yappp


    UserDto dtoToEntity(User user);

    User entityToDTO(UserDto user);


}
