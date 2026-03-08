package com.example.EcommerceProject.controllers;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long productId) throws Exception {
        ProductDTO response = this.productService.getProductById(productId);
        return ResponseEntity.ok(response);
    }
}
