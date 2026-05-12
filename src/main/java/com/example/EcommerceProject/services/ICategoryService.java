package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getAllCategories() throws IOException;
//    List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException;
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO getByName(String name) throws IOException;
}
