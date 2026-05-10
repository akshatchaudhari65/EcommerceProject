package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.mappers.ProductMapper;
import com.example.EcommerceProject.repository.ProductRepository;
import com.example.EcommerceProject.entity.Product;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService implements IProductService{

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
//        return repo.findById(id)
//                .map(ProductMapper::toDto)
//                .orElseThrow(() -> new Exception("Product not found with id: " + id));   -- this is the same as the code below, just more concise.

        Product product = repo.findById(id)
                .orElseThrow(() -> new Exception("Product not found with id: " + id));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Product saved = repo.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDto(saved);
    }
}
