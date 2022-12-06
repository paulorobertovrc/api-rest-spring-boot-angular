package com.prvrc.api.product;

import java.math.BigDecimal;

public record ProductDto(int id, String nome, String marca, String modelo, String categoria, BigDecimal preco, int estoque) {
    
}
