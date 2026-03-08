package com.example.EcommerceProject.gateway.api;

import com.example.EcommerceProject.dto.FakestoreProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface FakestoreProductAPI {
    @GET("/api/v1/products/{productId}")
    Call<FakestoreProductDTO> getProductById(@Path("productId") Long productId) throws IOException;
}
