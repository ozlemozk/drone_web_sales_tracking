package com.iha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "rent")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rent {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finsh_date")
    private LocalDate finshDate;

    @ManyToOne
    private User user;

    @ManyToOne
    private Iha iha;


}
