/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio4;

/**
 *
 * @author marco
 */
public class RegAcademia {
    
    private String Academia;
    private String Atividade;
    private String Aparelho;
    private String Horario;
    private String Dia;

    public RegAcademia (String academia, String atividade, String aparelho, String horario, String dia){
        Academia = academia;
        Atividade = atividade;
        Aparelho = aparelho;
        Horario = horario;
        Dia = dia;
    }

    public String getAcademia() {
        return Academia;
    }

    public void setAcademia(String Academia) {
        this.Academia = Academia;
    }

    public String getAtividade() {
        return Atividade;
    }

    public void setAtividade(String Atividade) {
        this.Atividade = Atividade;
    }

    public String getAparelho() {
        return Aparelho;
    }

    public void setAparelho(String Aparelho) {
        this.Aparelho = Aparelho;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }
}
