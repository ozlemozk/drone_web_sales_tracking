package com.iha.validator;

import com.iha.model.UserDto;

import java.time.LocalDate;

public interface UserValidator {
    void updateControl(LocalDate passvordDate);
}
