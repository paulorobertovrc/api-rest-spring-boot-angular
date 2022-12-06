package com.prvrc.api.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbProdutos")
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
}
