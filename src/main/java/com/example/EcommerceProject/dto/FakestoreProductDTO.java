package com.example.EcommerceProject.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakestoreProductDTO {
    private Long id;
    private String title;
    private String slug;
    private Double price;
    private String description;
    private Category category;
    private List<String> images;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Category {
        private Long id;
        private String name;
        private String image;
        private String slug;
    }
}
