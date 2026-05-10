package com.example.EcommerceProject.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO{
    private Long id;
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private String title;
    private Long categoryId;
    private String brand;
    private boolean popular;
}
