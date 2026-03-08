package com.example.EcommerceProject.gateway;

import com.example.EcommerceProject.dto.FakestoreProductDTO;
import com.example.EcommerceProject.dto.ProductCategoryDTO;
import com.example.EcommerceProject.dto.ProductDTO;
import com.example.EcommerceProject.gateway.api.FakestoreProductAPI;
import org.springframework.stereotype.Component;

@Component
public class FakestoreProductGateway implements IProductGateway{

    private final FakestoreProductAPI fakestoreProductAPI;

    public FakestoreProductGateway(FakestoreProductAPI fakestoreProductAPI) {
        this.fakestoreProductAPI = fakestoreProductAPI;
    }

    @Override
    public ProductDTO getProductById(Long productId) throws Exception {
        FakestoreProductDTO response = this.fakestoreProductAPI.getProductById(productId).execute().body();
        if(response == null){
            throw new Exception("Product not found");
        }
        return ProductDTO.builder()
                .id(response.getId())
                .title(response.getTitle())
                .build();
    }
}
