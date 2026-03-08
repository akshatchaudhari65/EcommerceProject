package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.ProductDTO;

public interface IProductService {
    ProductDTO getProductById(Long productId) throws Exception;
}
