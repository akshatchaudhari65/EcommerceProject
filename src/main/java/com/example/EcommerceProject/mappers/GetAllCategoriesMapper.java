package com.example.EcommerceProject.mappers;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.FakestoreCategoryResponseDTO;

import java.util.Arrays;
import java.util.List;

public class GetAllCategoriesMapper {
    // Helper method if you only want to map a single category
    public static CategoryDTO toCategoryDTO(FakestoreCategoryResponseDTO fakeCategory) {
        if (fakeCategory == null)
            return null;
        return new CategoryDTO(fakeCategory.getName());
    }

    // Takes the List/Array of FakeStore DTOs and converts to List of your internal
    // DTOs
    public static List<CategoryDTO> toCategoryDTOList(FakestoreCategoryResponseDTO[] fakeCategories) {
        if (fakeCategories == null)
            return List.of();

        return Arrays.stream(fakeCategories)
                .map(GetAllCategoriesMapper::toCategoryDTO)
                .toList();
    }
}
