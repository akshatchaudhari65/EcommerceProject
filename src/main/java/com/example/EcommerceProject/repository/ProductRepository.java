package com.example.EcommerceProject.repository;

import com.example.EcommerceProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // we can use @Query here if we want to write custom queries, but for basic CRUD operations, JpaRepository provides all the necessary methods.
    // also we can write raw SQL queries if needed, but it's generally recommended to use JPQL or the method naming conventions provided by Spring Data JPA for better readability and maintainability.
    // we will do it tomorrow

}
