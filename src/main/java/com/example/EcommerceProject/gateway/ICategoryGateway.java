package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;

import java.io.IOException;
import java.util.List;

public interface  ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
    List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException;
}
