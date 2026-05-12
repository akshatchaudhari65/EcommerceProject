package com.example.EcommerceProject.controllers;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.dto.ProductWithCategoryDTO;
import com.example.EcommerceProject.exception.ProductNotFoundException;
import com.example.EcommerceProject.services.IProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(@Qualifier("productService") IProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long productId) throws Exception {
        ProductDTO response = this.productService.getProductById(productId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) throws Exception{
        return ResponseEntity.ok(productService.createProduct(dto));
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategory(@PathVariable long id) throws Exception{
        ProductWithCategoryDTO dto = productService.getProductWithCategory(id);
        return ResponseEntity.ok(dto);
    }


}
