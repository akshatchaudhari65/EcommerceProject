package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.EcommerceProject.gateway.ICategoryGateway;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    public FakestoreCategoryService(@Qualifier("fakeStoreCategoryRestTemplateGateway") ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    @Override
    public List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException {
        return this.categoryGateway.getProductsByCategory(categoryId);
    }
}
