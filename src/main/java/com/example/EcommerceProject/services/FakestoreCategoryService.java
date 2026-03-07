package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.CategoryDTO;
import org.springframework.stereotype.Service;
import com.example.EcommerceProject.gateway.ICategoryGateway;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    public FakestoreCategoryService(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}
