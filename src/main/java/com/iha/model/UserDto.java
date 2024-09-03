package com.iha.model;

import com.iha.entity.Rent;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto implements Serializable {
    private UUID id;
    private Long version;
    private String userName;
    private String password;
    private LocalDate passwordDate;

    private Set<RentDto> rent;

}
