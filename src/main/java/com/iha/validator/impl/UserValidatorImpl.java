package com.iha.validator.impl;

import com.iha.validator.UserValidator;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserValidatorImpl implements UserValidator {
    @Override
    public void updateControl(LocalDate passvordDate) {
        //6 ay konrolü ekle

    }
}
