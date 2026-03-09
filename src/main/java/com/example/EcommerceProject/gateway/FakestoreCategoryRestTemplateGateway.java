package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.FakestoreCategoryResponseDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.EcommerceProject.mappers.GetAllCategoriesMapper;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreCategoryRestTemplateGateway")
public class FakestoreCategoryRestTemplateGateway implements ICategoryGateway {
    private final RestTemplate restTemplate;

    public FakestoreCategoryRestTemplateGateway(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        String url = "https://api.escuelajs.co/api/v1/categories";
        ResponseEntity<FakestoreCategoryResponseDTO[]> response = restTemplate.getForEntity(url,
                FakestoreCategoryResponseDTO[].class);
        if (response.getBody() == null) {
            throw new IOException("Failed to fetch categories");
        }
        return GetAllCategoriesMapper.toCategoryDTOList(response.getBody());
    }

    @Override
    public List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException {
        return List.of();
    }
}
