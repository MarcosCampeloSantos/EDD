/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class CadAgenda {
    
    public static void main(String[] args){
        try{
            BufferedReader entrada; // ler a entrada de dados

            entrada = new BufferedReader (new InputStreamReader (System.in)); 
            // InputStreamReader é uma ponte de fluxos de bytes para fluxos de caracteres: ele lê bytes e os 			//decodifica em caracteres usando um especificado charset.

            //System.in:  uma variável que armazena a entrada padrão de dados da aplicação

            BufferedWriter saida; // Grava texto em um fluxo de saída de caracteres

            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Agenda.txt", true));

        System.out.println ("Digite o nome");
            String Nome = entrada.readLine();
            System.out.println ("Digite o endereço");
            String Endereco = entrada.readLine();
            System.out.println ("Digite seu telefone");
            String Telefone = entrada.readLine();
            RegAgenda regAg1 = new RegAgenda(Nome, Endereco, Telefone); // cria o registro no arquivo agenda

            saida.write(regAg1.mostraNome()+"\t"); // \t” é similar a apertar “tab” do teclado e cria um espaçamento
            saida.write(regAg1.mostraEnd()+"\t");
            saida.write(regAg1.mostraTel()+"\n");
            saida.flush(); // Se existir algum dado que não estiver ainda no disco e está ainda em um buffer em 					// memória, flush dá a descarga nesse buffer (ou seja, força a gravação ou o envio dos 					//bytes que estão no buffer. Sai da memória principal, grava no arquivo que está no disco).
            saida.close(); // Fecha o scanner aberto
            }catch (Exception e){
            System.out.println("Erro de Gravação");
        }
    } 
}
