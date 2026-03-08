package com.example.EcommerceProject.configuration;

import com.example.EcommerceProject.gateway.api.FakestoreCategoryAPI;
import com.example.EcommerceProject.gateway.api.FakestoreProductAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${FAKESTORE_BASE_URL}")
    private String baseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakestoreCategoryAPI fakestoreCategoryAPI(Retrofit retrofit){
        return retrofit.create(FakestoreCategoryAPI.class);
    }

    @Bean
    public FakestoreProductAPI fakestoreProductAPI(Retrofit retrofit) {
        return retrofit.create(FakestoreProductAPI.class);
    }
}
