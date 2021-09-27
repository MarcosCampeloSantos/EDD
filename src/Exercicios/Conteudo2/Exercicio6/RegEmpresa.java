/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio6;

/**
 *
 * @author marco
 */
public class RegEmpresa {
    
    private String Empresa;
    private String Voo;
    private String Trecho;
    private String Saida;
    private String Chegada;

    public RegEmpresa (String empresa, String voo, String trecho, String saida, String chegada){
        Empresa = empresa;
        Voo = voo;
        Trecho = trecho;
        Saida = saida;
        Chegada = chegada;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getVoo() {
        return Voo;
    }

    public void setVoo(String Voo) {
        this.Voo = Voo;
    }

    public String getTrecho() {
        return Trecho;
    }

    public void setTrecho(String Trecho) {
        this.Trecho = Trecho;
    }

    public String getSaida() {
        return Saida;
    }

    public void setSaida(String Saida) {
        this.Saida = Saida;
    }

    public String getChegada() {
        return Chegada;
    }

    public void setChegada(String Chegada) {
        this.Chegada = Chegada;
    }
}
