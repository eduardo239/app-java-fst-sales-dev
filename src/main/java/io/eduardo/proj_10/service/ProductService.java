package io.eduardo.proj_10.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.eduardo.proj_10.entity.Product;
import io.eduardo.proj_10.repository.ProductRepository;

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
}
