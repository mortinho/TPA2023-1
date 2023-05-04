/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eduardo
 */
public abstract class Produto {
    public enum TAMANHO{ GG, G, M, P, PP };
    
    private final TAMANHO tamanho;
    private final String cor;
    private final  String codigo;
    private double preco;

    public Produto(TAMANHO tamanho, String cor, String codigo) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.codigo = codigo;
    }
 
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TAMANHO getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getCodigo() {
        return codigo;
    }
    
    

    
}
