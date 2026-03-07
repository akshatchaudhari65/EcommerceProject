package com.example.EcommerceProject.configuration;

import com.example.EcommerceProject.gateway.api.FakestoreCategoryAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://api.escuelajs.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakestoreCategoryAPI fakestoreCategoryAPI(Retrofit retrofit){
        return retrofit.create(FakestoreCategoryAPI.class);
    }
}
