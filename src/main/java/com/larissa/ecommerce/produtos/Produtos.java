package com.larissa.ecommerce.produtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "produtos")
@Entity (name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"Nome"})
public class Produtos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String Nome;
    private String Descrição;
    private double Valor;

    @Enumerated(EnumType.STRING)
    private tamanho Tamanho;


    public Produtos(DadosCadastro dados) {
        this.Nome = dados.Nome();
        this.Descrição = dados.Descrição();
        this.Valor = dados.Valor();
        this.Tamanho = dados.Tamanho();
    }
}

