package com.example.EcommerceProject.controllers;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import com.example.EcommerceProject.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

//    @Autowired -> this is useless when we are using constructor injection, because the constructor will automatically inject the service into the controller, so we don't need to use @Autowired annotation. But if we are using field injection, then we need to use @Autowired annotation to inject the service into the controller.
    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws java.io.IOException {
        List<CategoryDTO> response = this.categoryService.getAllCategories();
        return ResponseEntity.ok(response);
    }

    @GetMapping(("/{categoryId}/products"))
    public List<ProductCategoryDTO> getProductsByCategory(@PathVariable Long categoryId) throws IOException {
        return this.categoryService.getProductsByCategory(categoryId);
    }
}
