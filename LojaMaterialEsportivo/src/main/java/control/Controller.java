/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import model.Cliente;
import model.Produto;
import model.Venda;
import exception.CPFJaEncontradoException;

/**
 *
 * @author 12736551761
 */
public class Controller {
    private ArrayList<Venda> vendas = new ArrayList();
    private HashMap<String, Cliente> clientes = new HashMap();
    private HashMap<String, Produto> produtos = new HashMap();
    
    public void CadastrarCliente(String cpf, String nome, String email) throws CPFJaEncontradoException{
            if(clientes.containsKey(cpf)){
                throw new CPFJaEncontradoException("cpf ja cadastrado");
            } else {
                Cliente c = new Cliente(cpf, nome, email);
                clientes.put(cpf,c);
            }
        }
}
