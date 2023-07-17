package com.mapstruct.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ProductDto {

    @Id
    private Integer id;
    private String name;
    private String desc;
    private Integer quantity;
    private Long price;
}
