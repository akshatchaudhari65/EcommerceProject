package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import com.example.EcommerceProject.entity.Category;
import com.example.EcommerceProject.mappers.CategoryMapper;
import com.example.EcommerceProject.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("categoryService")
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return categoryRepository.findAll().stream()
                .map(category -> CategoryDTO.builder()
                        .id(category.getId())
                        .name(category.getName())
                        .build())
                .toList();
    }

//    @Override
//    public List<ProductCategoryDTO> getProductsByCategory(Long categoryId) throws IOException {
//        return List.of(); // TODO: implement
//    }
    @Override
    public CategoryDTO createCategory(CategoryDTO dto) {
        Category category = Category.builder()
                .name(dto.getName())
                .build();
        Category saved = categoryRepository.save(category);
        return CategoryMapper.toDto(saved);
    }

    @Override
    public CategoryDTO getByName(String name) throws IOException {
        Category category = categoryRepository.findByName(name)
                .orElseThrow(() -> new IOException("Category not found with name: " + name));
        return CategoryMapper.toDto(category);
    }
}
