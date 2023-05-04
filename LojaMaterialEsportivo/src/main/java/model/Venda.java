/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Venda {
    private final String codigo;
    private final Date data;
    private ArrayList<Produto>  produtos;
    private final Cliente comprador;
    private Vendedor vendedor;
    
    public String getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    

    public Venda(String codigo, Date data, Cliente comprador, Vendedor vendedor) {
        this.codigo = codigo;
        this.data = data;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.produtos = new ArrayList();
    }
    
   
}
