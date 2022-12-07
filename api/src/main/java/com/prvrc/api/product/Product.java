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
    private String nome;
    
    @Column(nullable = false, length = 50)
    private String marca;
    
    @Column(nullable = true, length = 50)
    private String modelo;
    
    @Column(nullable = false, length = 50)
    private String categoria;
    
    @Column(nullable = false, length = 6)
    private BigDecimal preco;
    
    @Column(nullable = true, length = 3)
    private int estoque;
    
    public Product(ProductDto productData) {
        this.nome = productData.nome();
        this.marca = productData.marca();
        this.modelo = productData.modelo();
        this.categoria = productData.categoria();
        this.preco = productData.preco();
        this.estoque = productData.estoque();
    }

    public void update(ProductDtoUpdate newProductData) {
        if (newProductData.preco() != null) {
            this.preco = newProductData.preco();
        }

        if (newProductData.estoque() != 0) {
            this.estoque = newProductData.estoque();
        }
    }
}
