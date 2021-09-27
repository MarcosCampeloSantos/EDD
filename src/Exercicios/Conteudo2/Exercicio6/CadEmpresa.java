/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class CadEmpresa {
    
    public static void main(String[] args){
        try{
            BufferedReader entrada; // ler a entrada de dados

            entrada = new BufferedReader (new InputStreamReader (System.in)); 
            // InputStreamReader é uma ponte de fluxos de bytes para fluxos de caracteres: ele lê bytes e os 			//decodifica em caracteres usando um especificado charset.

            //System.in:  uma variável que armazena a entrada padrão de dados da aplicação

            BufferedWriter saida; // Grava texto em um fluxo de saída de caracteres

            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Empresa.txt", true));

            System.out.println ("Digite a Empresa");
            String Empresa = entrada.readLine();
            System.out.println ("Digite a Voo");
            String Voo = entrada.readLine();
            System.out.println ("Digite seu Trecho");
            String Trecho = entrada.readLine();
            System.out.println ("Digite seu Saida");
            String Saida = entrada.readLine();
            System.out.println ("Digite o Chegada");
            String Chegada = entrada.readLine();
            RegEmpresa regProd = new RegEmpresa(Empresa, Voo, Trecho, Saida, Chegada); // cria o registro no arquivo agenda

            saida.write(regProd.getEmpresa()+"\t"); // \t” é similar a apertar “tab” do teclado e cria um espaçamento
            saida.write(regProd.getVoo()+"\t");
            saida.write(regProd.getTrecho()+"\t");
            saida.write(regProd.getSaida()+"\t");
            saida.write(regProd.getChegada()+"\n");
            saida.flush(); // Se existir algum dado que não estiver ainda no disco e está ainda em um buffer em 					// memória, flush dá a descarga nesse buffer (ou seja, força a gravação ou o envio dos 					//bytes que estão no buffer. Sai da memória principal, grava no arquivo que está no disco).
            saida.close(); // Fecha o scanner aberto
            }catch (Exception e){
            System.out.println("Erro de Gravação");
        }
    } 
}
