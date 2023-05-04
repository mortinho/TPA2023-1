/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author 12736551761
 */
public class CPFJaEncontradoException extends Exception{
    private String cpf;

    public CPFJaEncontradoException(String string) {
        super("cpf "+string+" ja cadastrado");
        this.cpf = string;
    }
    
}
