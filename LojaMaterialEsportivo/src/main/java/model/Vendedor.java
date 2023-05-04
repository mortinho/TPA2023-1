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
public class Vendedor extends Pessoa{
    private static double salarioBase = 2000.0;
    private double salario;
    
    public Vendedor(String cpf, String nome) {
        super(cpf, nome);
        salario = salarioBase;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Vendedor.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
