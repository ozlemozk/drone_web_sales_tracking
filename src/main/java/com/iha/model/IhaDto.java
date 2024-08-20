package com.iha.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IhaDto implements Serializable {

    private UUID id;
    private String brand;
    private String model;
    private BigDecimal weight;
    private String category;
}
