package com.example.EcommerceProject.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakestoreCategoryResponseDTO {
    private Long id;
    private String name;
    private String slug;
    private String image;
    private String creationAt;
    private String updatedAt;
}