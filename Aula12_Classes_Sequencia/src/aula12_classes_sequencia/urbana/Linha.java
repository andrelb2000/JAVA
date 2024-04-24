/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_classes_sequencia.urbana;
import aula12_classes_sequencia.transporte.Coletivo;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public abstract class Linha {
    private ArrayList<Coletivo> listaColetivos = new ArrayList<Coletivo>();
   
    
    public void associaColetivo(Coletivo col){
        listaColetivos.add(col);        
    };
    
    public void imprimeColetivos(){
        for(int i=0; i < listaColetivos.size();i++){
            Coletivo c = listaColetivos.get(i);
            c.imprimeCodigo();
        }
    }
    
    
}
