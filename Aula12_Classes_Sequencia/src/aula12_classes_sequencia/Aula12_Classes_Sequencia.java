/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12_classes_sequencia;
import aula12_classes_sequencia.transporte.*;
import aula12_classes_sequencia.urbana.*;

/**
 *
 * @author andre
 */
public class Aula12_Classes_Sequencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinhaAmarela l1 = new LinhaAmarela();
        
        Trem t1 = new Trem("Trem 001");
        Metro m1 = new Metro("M001");
        
        l1.associaColetivo(m1);
        l1.associaColetivo(t1);
        l1.imprimeColetivos();
        
        
        
        
        
        
    }
    
}
