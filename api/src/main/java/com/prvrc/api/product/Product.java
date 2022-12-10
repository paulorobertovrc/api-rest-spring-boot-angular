package com.prvrc.api.product;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbProdutos")
public class Product {
    @Column(length = 5)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto increment
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, length = 50)
    private String brand;
    
    @Column(nullable = true, length = 50)
    private String model;
    
    @Column(nullable = false, length = 50)
    private String category;
    
    @Column(nullable = false, length = 6)
    private BigDecimal price;
    
    @Column(nullable = true, length = 3)
    private int inventory;
    
    public Product(ProductDto productData) {
        this.name = productData.name();
        this.brand = productData.brand();
        this.model = productData.model();
        this.category = productData.category();
        this.price = productData.price();
        this.inventory = productData.inventory();
    }

    public void update(ProductDtoUpdate newProductData) {
        if (newProductData.preco() != null) {
            this.price = newProductData.preco();
        }

        if (newProductData.estoque() != 0) {
            this.inventory = newProductData.estoque();
        }
    }
}
