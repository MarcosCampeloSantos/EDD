/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio2;

/**
 *
 * @author marco
 */
public class RegAluno {
    
    private String Aluno;
    private String Curso;
    private String Turma;
    private String Periodo;

    public RegAluno (String aluno, String curso, String turma, String periodo){
        Aluno = aluno;
        Curso = curso;
        Turma = turma;
        Periodo = periodo;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String Aluno) {
        this.Aluno = Aluno;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }
}
