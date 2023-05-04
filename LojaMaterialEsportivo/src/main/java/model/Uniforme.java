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
public class Uniforme extends Conjunto{
    private String time;
    
    public Uniforme(String nome, String time){
        super(nome);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void addProduto(Roupa roupa){
        if(time.equals(roupa.getTime()))
            super.addProduto(roupa);
    }            
}
