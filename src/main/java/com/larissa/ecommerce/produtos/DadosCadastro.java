package com.larissa.ecommerce.produtos;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastro(
        @NotBlank
        String Nome,
        @NotBlank
        String Descrição,
        @NotBlank
        double Valor,
        @NotBlank
        tamanho Tamanho) {
}
