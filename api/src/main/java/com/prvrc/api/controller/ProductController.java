package com.prvrc.api.controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prvrc.api.model.Product;
import com.prvrc.api.repository.ProductRepository;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    // Called when request method is POST
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product productData) {
        // Returns http status code 201 if object is successfully created
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productData));
    }

    // Called when request method is GET
    // This method lists all products
    @GetMapping
    public List<Product> list() {
        return productRepository.findAll();
    }

    // This method lists an specific product
    // ***** ENCONTRAR UMA SOLUÇÃO PARA TRATAR O RETORNO NULL CASO DÊ PROBLEMA NO FRONTEND *****
    @GetMapping("/{id}")
    @Nullable
    public Optional<Product> findById(@PathVariable("id") int id) {
        return productRepository.findById(id);
    }
}
