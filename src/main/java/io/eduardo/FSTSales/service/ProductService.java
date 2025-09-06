package io.eduardo.FSTSales.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.eduardo.FSTSales.entity.Category;
import io.eduardo.FSTSales.entity.Product;
import io.eduardo.FSTSales.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(product.getName());
                    existing.setPrice(product.getPrice());
                    return repository.save(existing);
                })
                .orElse(null);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    // find all products by category
    public List<Product> findByCategory(Category category) {
        return repository.findByCategory(category);
    }
}
