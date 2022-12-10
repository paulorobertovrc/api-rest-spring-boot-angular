package com.prvrc.api.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;

public record ProductDto(Long id, 
            @NotBlank String name, 
            @NotBlank String brand, 
            String model, 
            @NotBlank String category,
            @DecimalMin(value = "0.0") @Digits(integer = 6, fraction = 2) BigDecimal price, 
            int inventory) {
    
    public ProductDto(Product product) {
        this(product.getId(), product.getName(), product.getBrand(), product.getModel(), product.getCategory(), product.getPrice(), product.getInventory());
    }
}
