package com.example.EcommerceProject.controllers;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import com.example.EcommerceProject.entity.Category;
import com.example.EcommerceProject.services.CategoryService;
import com.example.EcommerceProject.services.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    public CategoryController(@Qualifier("categoryService") CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<?> getAllCategories(@RequestParam(required = false) String name) throws Exception {
        if(name != null && !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getByName(name);
            return ResponseEntity.ok(categoryDTO);
        }
        else{
            List<CategoryDTO> response = this.categoryService.getAllCategories();
            return ResponseEntity.ok(response);
        }
    }

    // @GetMapping(("/{categoryId}/products"))
    // public List<ProductCategoryDTO> getProductsByCategory(@PathVariable Long
    // categoryId) throws IOException {
    // return this.categoryService.getProductsByCategory(categoryId);
    // }
    // do this as homework

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO created = categoryService.createCategory(categoryDTO);
        return ResponseEntity.ok(created);
    }
}
