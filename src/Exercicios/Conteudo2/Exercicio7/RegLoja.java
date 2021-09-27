/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio7;


/**
 *
 * @author marco
 */
public class RegLoja {
    
    private String Roupa;
    private String Tamanho;
    private String Cor;
    private String Modelo;

    public RegLoja (String roupa, String tamanho, String cor, String modelo){
        Roupa = roupa;
        Tamanho = tamanho;
        Cor = cor;
        Modelo = modelo;
    }

    public String getRoupa() {
        return Roupa;
    }

    public void setRoupa(String Roupa) {
        this.Roupa = Roupa;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
}
