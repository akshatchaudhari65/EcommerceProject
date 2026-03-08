package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@Qualifier("fakeStoreCategoryRestTemplateGateway")
public class FakestoreCategoryRestTemplateGateway implements ICategoryGateway{
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return List.of();
    }

    @Override
    public List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException {
        return List.of();
    }
}
