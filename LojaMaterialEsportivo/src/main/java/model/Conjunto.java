/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Conjunto {
    private ArrayList<Produto> produtos;
    private String nome;
    
    public Conjunto(String nome){
        this.nome = nome;
        produtos = new ArrayList();
    }

    public Produto getProdutos(String codigo) {
        for (Produto p : produtos)
            if( codigo.equals(p.getCodigo()))
                return p;
        return null;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
