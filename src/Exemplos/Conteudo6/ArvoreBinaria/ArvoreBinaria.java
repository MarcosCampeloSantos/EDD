/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo6.ArvoreBinaria;

/**
 *
 * @author marco
 */
public class ArvoreBinaria {
    public static void main(String[] args){
        BArvore arvore1 = new BArvore ();
        arvore1.inserirNo (14);
        arvore1.inserirNo (16);
        arvore1.inserirNo (12);
        arvore1.inserirNo (11);
        arvore1.inserirNo (17);
        arvore1.inserirNo (15);
        arvore1.inserirNo (10);
        arvore1.inserirNo (13);
        arvore1.exibirNo ();
        arvore1.excluirNo (12);
        System.out.println ("");
        arvore1.exibirNo ();
    }
}
