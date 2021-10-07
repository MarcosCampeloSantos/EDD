/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo2.Agenda;


/**
 *
 * @author marco
 */
public class RegAgenda {
    
    private String nome;
    private String end;
    private String tel;

    public RegAgenda (String nom, String ender, String telef){
        nome = nom;
        end = ender;
        tel = telef;
    }
    public String mostraNome (){
        return nome;
    }
    public String mostraEnd (){
        return end;
    }
    public String mostraTel (){
        return tel;
    }    
    public void alteraEnd (String ender){
        end = ender;
    }
    public void alteraTel (String telef){
        tel = telef;
    }

}
