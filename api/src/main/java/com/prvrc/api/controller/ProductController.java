package com.prvrc.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prvrc.api.product.Product;
import com.prvrc.api.product.ProductDto;
import com.prvrc.api.product.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;

    // Called when request method is POST
    @PostMapping
    public void create(@RequestBody ProductDto productData) {
        productRepository.save(new Product(productData));
    }

    // Called when request method is GET
    // This method lists all products
    @GetMapping
    public List<ProductDto> list() {
        return productRepository.findAll().stream().map(ProductDto::new).toList();
    }

    // This method lists an specific product
    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable("id") int id) {
        return null;
    }
}
