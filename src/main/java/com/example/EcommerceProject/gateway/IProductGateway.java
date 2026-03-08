package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.ProductDTO;

public interface IProductGateway {
    ProductDTO getProductById(Long productId) throws Exception;
}
