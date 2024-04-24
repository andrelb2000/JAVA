/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author andre
 */
public class Ocorrencia {
    private String codOcorrencia;
    private String horaOcorrencia;

    public Ocorrencia(String codOcorrencia, String horaOcorrencia) {
        this.codOcorrencia = codOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
    }

    @Override
    public String toString() {
        return "Ocorrencia{" + "codOcorrencia=" + codOcorrencia + ", horaOcorrencia=" + horaOcorrencia + '}';
    }
    
    
}
