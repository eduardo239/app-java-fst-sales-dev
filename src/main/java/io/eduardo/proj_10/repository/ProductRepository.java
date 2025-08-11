package io.eduardo.proj_10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.proj_10.entity.Category;
import io.eduardo.proj_10.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Product> findByName(String name);
    List<Product> findByCategory(Category category);

}
