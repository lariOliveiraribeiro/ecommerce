package com.larissa.ecommerce.produtos;

public record DadosListagemProdutos(String Nome, String Descrição, double Valor, tamanho Tamanho) {
    public DadosListagemProdutos(Produtos produtos) {
        this(produtos.getNome(), produtos.getDescrição(), produtos.getValor(), produtos.getTamanho());
    }
}
