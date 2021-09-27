/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio8;

import Exercicios.Conteudo2.Exercicio6.*;

/**
 *
 * @author marco
 */
public class RegCliente {
    
    private String Cliente;
    private String Dia;
    private String Horario;
    private String Servico;
    private String Valor;

    public RegCliente (String cliente, String dia, String horario, String servico, String valor){
        Cliente = cliente;
        Dia = dia;
        Horario = horario;
        Servico = servico;
        Valor = valor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getServico() {
        return Servico;
    }

    public void setServico(String Servico) {
        this.Servico = Servico;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
}
