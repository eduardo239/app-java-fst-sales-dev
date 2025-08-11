package io.eduardo.proj_10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.proj_10.entity.Category;

public interface CateroyRepository extends JpaRepository<Category, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Category> findByName(String name);

}
