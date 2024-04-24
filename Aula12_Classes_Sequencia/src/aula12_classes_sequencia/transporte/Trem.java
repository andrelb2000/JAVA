/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_classes_sequencia.transporte;

/**
 *
 * @author andre
 */
public class Trem extends Coletivo {
    
    public Trem(String codigoColetivo) {
        super(codigoColetivo);
    }

    @Override
    public void imprimeCodigo() {
        System.out.println("Trem:");
        super.imprimeCodigo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
