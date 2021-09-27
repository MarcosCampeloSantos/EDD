/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio5;



/**
 *
 * @author marco
 */
public class RegRede {
    
    private String Rede;
    private String Nome;
    private String Seguidores;
    private String Assunto;

    public RegRede (String rede, String nome, String seguidores, String assunto){
        Rede = rede;
        Nome = nome;
        Seguidores = seguidores;
        Assunto = assunto;
    }

    public String getRede() {
        return Rede;
    }

    public void setRede(String Rede) {
        this.Rede = Rede;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSeguidores() {
        return Seguidores;
    }

    public void setSeguidores(String Seguidores) {
        this.Seguidores = Seguidores;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }
}
