package com.larissa.ecommerce.controller;

import com.larissa.ecommerce.produtos.DadosCadastro;
import com.larissa.ecommerce.produtos.DadosListagemProdutos;
import com.larissa.ecommerce.produtos.Produtos;
import com.larissa.ecommerce.produtos.ProdutosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {
    @Autowired
    private ProdutosRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody DadosCadastro dados) {
        repository.save(new Produtos(dados));
    }

    @GetMapping
    public List<DadosListagemProdutos> listar(){
        return repository.findAll().stream().map(DadosListagemProdutos::new).toList();
    }
}
