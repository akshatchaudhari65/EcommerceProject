package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.FakestoreCategoryResponseDTO;
import com.example.EcommerceProject.gateway.api.FakestoreCategoryAPI;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakestoreCategoryGateway implements ICategoryGateway{

    private final FakestoreCategoryAPI fakestoreCategoryAPI;

    public FakestoreCategoryGateway(FakestoreCategoryAPI fakestoreCategoryAPI) {
        this.fakestoreCategoryAPI = fakestoreCategoryAPI;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        List<FakestoreCategoryResponseDTO> response = this.fakestoreCategoryAPI.getAllFakeCategories().execute().body();
        if (response == null) {
            throw new IOException("Failed to fetch categories");
        }
        return response.stream()
                .map(fakeCategory -> new CategoryDTO(fakeCategory.getName()))
                .toList();
    }
}
