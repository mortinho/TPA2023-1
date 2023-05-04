/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Controller;
import java.util.Scanner;

/**
 *
 * @author 12736551761
 */
public class Principal {
    Controller ctrl = new Controller();
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Principal p = new Principal();
        while (p.menu()!=0){}
    }
    
    private int menu(){
        System.out.println("Loja de material esportivo");
        System.out.println("1-cadastrar cliente");
        System.out.println("2-cadastrar produto");
        System.out.println("3-realizar venda");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:CadastrarCliente() ;break;
            case 2: ;break;
            case 3: ;break;
        }
        return opcao;
    }
    
    private void CadastrarCliente(){
        System.out.println("Digite o cpf");
        String cpf = sc.next();
        System.out.println("Digite o nome");
        String nome = sc.next();
        System.out.println("Digite o email");
        String email = sc.next();
        try{
            ctrl.CadastrarCliente(cpf,nome,email);
            System.out.println("cadastrado com sucesso");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
