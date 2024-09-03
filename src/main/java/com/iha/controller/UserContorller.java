package com.iha.controller;

import com.iha.constants.ApiConstant;
import com.iha.model.UserDto;
import com.iha.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping
    @Operation(description = "Update Meto")
    public ResponseEntity<UserDto> update(@RequestBody UserDto user) {
        service.update(user);
        return ResponseEntity.ok(user);
    }
}
