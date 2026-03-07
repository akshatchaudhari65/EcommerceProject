package com.example.EcommerceProject.gateway.api;

import com.example.EcommerceProject.dto.FakestoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
import java.util.List;

public interface FakestoreCategoryAPI {

    @GET("/api/v1/categories")
    Call<List<FakestoreCategoryResponseDTO>> getAllFakeCategories();
}
