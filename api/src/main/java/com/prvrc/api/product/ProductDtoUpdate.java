package com.prvrc.api.product;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;

public record ProductDtoUpdate(
            @NotNull Long id, 
            @DecimalMin(value = "0.0") @Digits(integer = 6, fraction = 2) BigDecimal preco, 
            int estoque) {
}
