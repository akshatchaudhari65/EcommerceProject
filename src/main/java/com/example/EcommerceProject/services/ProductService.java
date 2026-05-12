package com.example.EcommerceProject.services;

import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.dto.ProductWithCategoryDTO;
import com.example.EcommerceProject.entity.Category;
import com.example.EcommerceProject.exception.ProductNotFoundException;
import com.example.EcommerceProject.mappers.ProductMapper;
import com.example.EcommerceProject.repository.CategoryRepository;
import com.example.EcommerceProject.repository.ProductRepository;
import com.example.EcommerceProject.entity.Product;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductService implements IProductService{

    private final ProductRepository repo;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository repo, CategoryRepository categoryRepository) {
        this.repo = repo;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
//        return repo.findById(id)
//                .map(ProductMapper::toDto)
//                .orElseThrow(() -> new Exception("Product not found with id: " + id));   -- this is the same as the code below, just more concise.

        Product product = repo.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Category category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + dto.getCategoryId()));
        Product saved = repo.save(ProductMapper.toEntity(dto, category));
        return ProductMapper.toDto(saved);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception {
        Product product = repo.findById(id)
                .orElseThrow(() -> new Exception("Product not found with id: " + id));
        return ProductMapper.toProductWithCategoryDto(product);
    }
}
