package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.dto.ProductWithCategoryDTO;

public interface IProductService {
    ProductDTO getProductById(Long productId) throws Exception;
    ProductDTO createProduct(ProductDTO dto);

    ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception;
}
