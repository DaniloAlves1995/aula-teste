/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo
 */
public class Calculadora {

    public Calculadora() {
        try {
            File arquivo = new File("arquivo.txt");
            FileWriter fw = new FileWriter(arquivo, true);
            fw.write(new Date()+"\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println("erro: "+ex.getMessage());
        }
    }
    
    //metodo de somar
    public double Somar(int n1, int n2){
        return n1+n2;
    }
}
