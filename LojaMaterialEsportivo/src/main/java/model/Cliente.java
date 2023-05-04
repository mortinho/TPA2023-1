/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 12736551761
 */
public class Cliente extends Pessoa {
    private String email;
    public Cliente(String cpf, String nome, String email) {
        super(cpf, nome);
        this.email = email;
    }
    
}
