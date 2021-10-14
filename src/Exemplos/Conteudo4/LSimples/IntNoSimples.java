/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo4.LSimples;

/**
 *
 * @author marco
 */
public class IntNoSimples {
    int valor;
    IntNoSimples prox;/*variável com mesmo nome da classe, onde prox faz referência ao próx elemento da lista. Java não aceita ponteiros */

    IntNoSimples(int valorNo){
        valor = valorNo;
        prox = null;
    }
}
