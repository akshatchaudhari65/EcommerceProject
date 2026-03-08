package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.gateway.IProductGateway;
import org.springframework.stereotype.Service;

@Service
public class FakestoreProductService implements IProductService{

    private final IProductGateway productGateway;

    public FakestoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }


    @Override
    public ProductDTO getProductById(Long productId) throws Exception {
        return this.productGateway.getProductById(productId);
    }
}
