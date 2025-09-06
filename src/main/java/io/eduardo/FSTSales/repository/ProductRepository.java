package io.eduardo.FSTSales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.FSTSales.entity.Category;
import io.eduardo.FSTSales.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Product> findByName(String name);
    List<Product> findByCategory(Category category);

}
