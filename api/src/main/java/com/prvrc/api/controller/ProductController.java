package com.prvrc.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prvrc.api.product.Product;
import com.prvrc.api.product.ProductDto;
import com.prvrc.api.product.ProductDtoUpdate;
import com.prvrc.api.product.ProductRepository;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid ProductDto productData) {
        productRepository.save(new Product(productData));
    }

    @GetMapping
    public List<ProductDto> list() {
        return productRepository.findAll().stream().map(ProductDto::new).toList();
    }

    @GetMapping("/{id}")
    public Optional<ProductDto> findById(@PathVariable("id") Long id) {
        return productRepository.findById(id).stream().map(ProductDto::new).findFirst();
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid ProductDtoUpdate newProductData) {
        Product p = productRepository.getReferenceById(newProductData.id());
        p.update(newProductData);
    }
}
