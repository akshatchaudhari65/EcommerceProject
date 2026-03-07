package com.example.EcommerceProject.controllers;

import com.example.EcommerceProject.dto.CategoryDTO;
import com.example.EcommerceProject.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

//    @Autowired -> this is useless when we are using constructor injection, because the constructor will automatically inject the service into the controller, so we don't need to use @Autowired annotation. But if we are using field injection, then we need to use @Autowired annotation to inject the service into the controller.
    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

//    CategoryController(ICategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
    // this we are doing manually by creating a constructor and passing the service as an argument, but we can also do it by using @Autowired annotation, which will automatically inject the service into the controller. This is dependency injection, which is a design pattern that allows us to decouple the components of our application and make it more modular and testable.

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws java.io.IOException {
        return this.categoryService.getAllCategories();
    }
}
