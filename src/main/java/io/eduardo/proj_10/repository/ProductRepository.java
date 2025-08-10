package io.eduardo.proj_10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.proj_10.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Product> findByName(String name);

}
