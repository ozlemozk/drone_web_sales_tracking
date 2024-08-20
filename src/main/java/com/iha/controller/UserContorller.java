package com.iha.controller;

import com.iha.constants.ApiConstant;
import com.iha.model.UserDto;
import com.iha.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(ApiConstant.USER)
public class UserContorller {

    private final UserService service;

    public UserContorller(UserService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(description = "Save Meto")
    public ResponseEntity<UserDto> save(@RequestBody UserDto user) {
        service.save(user);
        return ResponseEntity.ok(user);
    }
}
