package io.eduardo.proj_10.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.eduardo.proj_10.entity.Category;
import io.eduardo.proj_10.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Category getCategoryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Category createCategory(Category category) {
        return repository.save(category);
    }

    public Category updateCategory(Long id, Category category) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(category.getName());
                    return repository.save(existing);
                })
                .orElse(null);
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }

}
