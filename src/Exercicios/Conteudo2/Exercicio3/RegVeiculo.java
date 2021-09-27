/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio3;


/**
 *
 * @author marco
 */
public class RegVeiculo {
    
    private String Veiculo;
    private String Marca;
    private String Ano;
    private String Cor;

    public RegVeiculo (String veiculo, String marca, String ano, String cor){
        Veiculo = veiculo;
        Marca = marca;
        Ano = ano;
        Cor = cor;
    }

    public String getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(String Veiculo) {
        this.Veiculo = Veiculo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
}
