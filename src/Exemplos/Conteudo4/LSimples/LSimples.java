/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo4.LSimples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class LSimples {
    /* Constrói um menu de opções para manipulação da lista*/    
public static void escolhas () { 
        System.out.print ("Escolha a Opcao:");
        System.out.print (" \n1. Inserir Nó no início");
        System.out.print (" \n2. Inserir Nó no fim");
        System.out.print (" \n3. Inserir Nó em uma posicao");
        System.out.print (" \n4. Localizar Nó");
        System.out.print (" \n5. Exibir lista");
        System.out.print (" \n6. Sair");
        System.out.print ("\nOpcao :\t ");
    }
    public static void main(String args[]){
        ListaSimples Slist = new ListaSimples(); /*Slist = Simples Lista*/
        BufferedReader entrada; // ler a entrada de dados
        entrada = new BufferedReader(new InputStreamReader(System.in));
        // InputStreamReader é uma ponte de fluxos de bytes para fluxos de caracteres: ele lê bytes e os 			//decodifica em caracteres usando um especificado charset.
        int i = 0;
        IntNoSimples temp_no; /*cria estrutura IntNoSimples*/
        int valor;
        try {
            escolhas();
            char opcao = entrada.readLine().charAt(0); // Método charAt() retorna o caractere especificado a partir de uma string
            while (opcao != '6'){
                switch (opcao) {
                    case '1' :
                        System.out.println("Insere um Nó no inicio da lista");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_inicio(new IntNoSimples(valor));
                        break;
                    case '2' :
                        System.out.println("Insire um Valor no final da lista");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_fim(new IntNoSimples(valor));
                        break;
                    case '3' :
                        System.out.println("Insire um Valor numa dada posicao");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        System.out.println("Digite a posicao");
                        int posicao = Integer.parseInt(entrada.readLine());
                        Slist.insereNo_posicao(new IntNoSimples(valor),posicao);
                        break;
                    case '4':
                        System.out.println("Localiza um valor");
                        System.out.println("Digite um valor");
                        valor = Integer.parseInt(entrada.readLine());
                        Slist.buscaNo(valor);
                        break;
                    case '5':
                        System.out.println("Exibe a lista");
                        Slist.exibeLista();
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
