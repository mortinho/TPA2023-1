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
public class Pessoa {
    private final String cpf;
    private String nome;
    private final ArrayList<Venda>    vendas;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        vendas = new ArrayList();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addVenda(Venda v){
        vendas.add(v);
    }
    
    public Venda getVenda(String codigo){
        for(Venda v: vendas)
            if(codigo.equals(v.getCodigo()))
                return v;
        return null;
    }
}
