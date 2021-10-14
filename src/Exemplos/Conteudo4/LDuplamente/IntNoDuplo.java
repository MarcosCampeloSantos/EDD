/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo4.LDuplamente;

/**
 *
 * @author marco
 */
public class IntNoDuplo {
    int valor;
    IntNoDuplo prox;
    IntNoDuplo ant;

    IntNoDuplo (int valorNo){
        valor = valorNo;
        prox = ant = null;
    }

}
