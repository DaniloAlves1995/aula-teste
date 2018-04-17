/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.teste;

/**
 *
 * @author Danilo
 */
public class AulaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double soma = c.Somar(4, 5);
        
        System.out.println("Resultado da soma = "+soma);
    }
    
}
