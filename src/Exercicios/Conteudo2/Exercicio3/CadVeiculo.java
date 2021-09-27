/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class CadVeiculo {
    
    public static void main(String[] args){
        try{
            BufferedReader entrada; // ler a entrada de dados

            entrada = new BufferedReader (new InputStreamReader (System.in)); 
            // InputStreamReader é uma ponte de fluxos de bytes para fluxos de caracteres: ele lê bytes e os 			//decodifica em caracteres usando um especificado charset.

            //System.in:  uma variável que armazena a entrada padrão de dados da aplicação

            BufferedWriter saida; // Grava texto em um fluxo de saída de caracteres

            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Veiculo.txt", true));

        System.out.println ("Digite o Veiculo");
            String Veiculo = entrada.readLine();
            System.out.println ("Digite a Marca");
            String Marca = entrada.readLine();
            System.out.println ("Digite seu Ano");
            String Ano = entrada.readLine();
            System.out.println ("Digite seu Cor");
            String Cor = entrada.readLine();
            RegVeiculo regProd = new RegVeiculo(Veiculo, Marca, Ano, Cor); // cria o registro no arquivo agenda

            saida.write(regProd.getVeiculo()+"\t"); // \t” é similar a apertar “tab” do teclado e cria um espaçamento
            saida.write(regProd.getMarca()+"\t");
            saida.write(regProd.getAno()+"\t");
            saida.write(regProd.getCor()+"\n");
            saida.flush(); // Se existir algum dado que não estiver ainda no disco e está ainda em um buffer em 					// memória, flush dá a descarga nesse buffer (ou seja, força a gravação ou o envio dos 					//bytes que estão no buffer. Sai da memória principal, grava no arquivo que está no disco).
            saida.close(); // Fecha o scanner aberto
            }catch (Exception e){
            System.out.println("Erro de Gravação");
        }
    } 
}
