/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo6.Exercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class ArvoreBinaria {
    
    public static void escolhas () {
        System.out.println ("Escolha a Opcao:");
        System.out.print ("\n1. Inserir Nó");
        System.out.print (" \n2. Excluido do Nó");
        System.out.print (" \n3. Exibir Nó");
        System.out.print (" \n4. Sair");
        System.out.print ("\n. Opcao : ");
    }
    
    public static void main(String[] args){
        BArvore arvore1 = new BArvore ();
        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader (System.in));
        int valor;
        try {
	    escolhas();
	    char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
		switch (opcao) {
		    case '1' :
                        System.out.println ("Digite Valor: ");
                        valor = Integer.parseInt(entrada.readLine());
			arvore1.inserirNo(valor);
			break;
		    case '2' : 
                        System.out.println ("Digite Valor: ");
                        valor = Integer.parseInt(entrada.readLine());
			arvore1.excluirNo(valor);
                        break;
                    case '3' : 
                        arvore1.exibirNo ();
                        break;
                    default : System.out.println ("Opcao Invalida !");
                }
                System.out.println();
                escolhas();
                opcao = entrada.readLine().charAt(0);
            }
	} 
        catch (Exception erro){
            System.out.println ("Erro de Entrada de Dados");
        }
    }
}
