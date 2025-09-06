package io.eduardo.FSTSales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.FSTSales.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Category> findByName(String name);

}
