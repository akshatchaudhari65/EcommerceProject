package com.example.EcommerceProject.gateway.api;

import com.example.EcommerceProject.dto.FakestoreCategoryResponseDTO;
import com.example.EcommerceProject.dto.FakestoreProductCategoryDTO;

import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;
import retrofit2.http.Path;

public interface FakestoreCategoryAPI {

    @GET("/api/v1/categories")
    Call<List<FakestoreCategoryResponseDTO>> getAllFakeCategories();

    @GET("/api/v1/categories/{categoryId}/products")
    Call<List<FakestoreProductCategoryDTO>> getProductsByCategory(@Path("categoryId") Long categoryId) throws IOException;
}
