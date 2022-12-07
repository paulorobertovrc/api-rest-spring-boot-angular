package com.prvrc.api.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;

public record ProductDto(Long id, 
            @NotBlank String nome, 
            @NotBlank String marca, 
            String modelo, 
            @NotBlank String categoria,
            @DecimalMin(value = "0.0") @Digits(integer = 6, fraction = 2) BigDecimal preco, 
            int estoque) {
    
    public ProductDto(Product product) {
        this(product.getId(), product.getNome(), product.getMarca(), product.getModelo(), product.getCategoria(), product.getPreco(), product.getEstoque());
    }
}
