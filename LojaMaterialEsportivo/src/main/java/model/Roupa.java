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
public class Roupa extends Produto{
    
    public enum TIPO{ CAMISA, SHORT, MEIA };
    
    private final String estilo;
    private final String esporte;
    private final String time;
    private final TIPO tipo;
    
    public Roupa(TAMANHO tamanho, String cor, String codigo, 
                 String estilo, String esporte, String time, TIPO tipo) {
        super(tamanho, cor, codigo);
        this.estilo = estilo;
        this.esporte = esporte;
        this.time = time;
        this.tipo = tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getEsporte() {
        return esporte;
    }

    public String getTime() {
        return time;
    }

    public TIPO getTipo() {
        return tipo;
    }
    
}
