/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo5.Exercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class usaPilhaInvertida {
    public static void escolhas () {
	System.out.println ("Escolha a Opcao:");
        System.out.print ("\n1. Inserir");
        System.out.print (" \n2. Saída-Descarregar-Pilha");
        System.out.print (" \n3. Exibir a Pilha");
        System.out.print (" \n4. Sair");
        System.out.print ("\n. Opcao :\t ");
    }
    public static void main(String args[]){
        PilhaInvertida objPilha = new PilhaInvertida(4);
	BufferedReader entrada;
	entrada = new BufferedReader( 
            new InputStreamReader (System.in) );
        Object valor;
	try {
	    escolhas();
	    char opcao = entrada.readLine().charAt(0);
            while (opcao != '4') {
		switch (opcao) {
		    case '1' :
			if (objPilha.cheia() == false){
                            System.out.println ("Digite valor: ");
                            valor = entrada.readLine();
                            objPilha.empilhar(valor);
                        }
                        else{
                            System.out.println("Pilha Cheia ! ");
                        }
                        break;
		    case '2' : 
                        if (objPilha.vazia() == false){
                            System.out.println (objPilha.desempilhar());
                        }
                        else{
                            System.out.println("Pilha Vazia ! ");
                        }
                        break;
                    case '3' : 
                        objPilha.exibePilha();
                        break;
                    default : System.out.println ("Opcao Invalida !");
		}
		System.out.println();
		escolhas();
                opcao = entrada.readLine().charAt(0);
            }
	} catch (Exception erro){
	    System.out.println ("Erro de Entrada de Dados. Provável Pilha Cheia");
	}
    }
}
