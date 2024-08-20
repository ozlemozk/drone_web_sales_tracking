package com.iha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "iha")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Iha {
    //( Marka, Model, Ağırlık, Kategori )

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "brand") //marka
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "category")
    private String category; //uuid must be beacuse more than one options category

    @OneToMany(mappedBy = "iha")
    private Set<Rent> rent;
}
