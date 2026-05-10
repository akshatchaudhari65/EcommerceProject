package com.example.EcommerceProject.mappers;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.entity.Category;

public class CategoryMapper {
    public static CategoryDTO toDto(Category category){
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto) {
        return Category.builder()
                .name(dto.getName())
                .build();
    }
}
