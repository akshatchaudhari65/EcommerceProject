package com.example.EcommerceProject.dto;

import java.util.List;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakestoreProductCategoryDTO {
    private Long id;
    private String title;
    private String slug;
    private Double price;
    private String description;
    private FakestoreCategoryResponseDTO category;
    private List<String> images;
    private String creationAt;
    private String updatedAt;
}
