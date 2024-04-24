/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.OcorrenciaDAO;
import dao.Ocorrencia;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class GerenciaOcorrencia {
    private OcorrenciaDAO daoOcorrencia;
    private ArrayList<Ocorrencia> listaOcorrencias = new ArrayList<Ocorrencia>();
    public void insereOcorrencia(Ocorrencia o){
        System.out.println("inserindo na lista de memoria a ocorrencia: "+o);
        listaOcorrencias.add(o);
        daoOcorrencia.insere(o);       
    }
    public GerenciaOcorrencia(OcorrenciaDAO daoOcorrencia) {
        this.daoOcorrencia = daoOcorrencia;
    }
 
    
}
