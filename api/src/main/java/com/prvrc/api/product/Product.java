package com.prvrc.api.product;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbProdutos", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String marca;
    
    @Column(nullable = true)
    private String modelo;
    
    @Column(nullable = false)
    private String categoria;
    
    @Column(nullable = false)
    private BigDecimal preco;
    
    @Column(nullable = true)
    private int estoque;
    
    public Product(ProductDto productData) {
        this.id = productData.id();
        this.nome = productData.nome();
        this.marca = productData.marca();
        this.modelo = productData.modelo();
        this.categoria = productData.categoria();
        this.preco = productData.preco();
        this.estoque = productData.estoque();
    }
}
