/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author marco
 */
public class ArqBusca {
    
    static StringBuffer memoria = new StringBuffer();
    // StringBuffer é uma classe de mesmo nível de String que fornece grande parte da funcionalidade de strings. 
    //StringBuffer representa sequências de caracteres crescentes e graváveis.

    public static void main(String[] args){
        try{
            BufferedReader entrada;
            entrada = new BufferedReader (new InputStreamReader (System.in));
            BufferedReader arqentrada;
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Agenda.txt"));
            System.out.println ("Digite o nome");
            String Nome = entrada.readLine();
            String Endereco = "";
            String Telefone = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Nome);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Nome = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Endereco = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Telefone = ler (primeiro, fim);

                RegAgenda regAg1 = new RegAgenda (Nome, Endereco, Telefone);
                System.out.println ("Endereco: " + regAg1.mostraEnd () +
                        " Telefone: " + regAg1.mostraTel ());
                System.out.println ("Entre com novo endereco");
                Endereco = entrada.readLine ();
                regAg1.alteraEnd (Endereco);
                System.out.println ("Entre com novo telefone");
                Telefone = entrada.readLine ();
                regAg1.alteraTel (Telefone);
                memoria.replace (inicio, fim, regAg1.mostraNome () + "\t" +
                        regAg1.mostraEnd () + "\t" + regAg1.mostraTel ());
                gravar ();
                arqentrada.close ();
            }else{
                System.out.println ("Item nao encontrado");
            }
            arqentrada.close ();
        } catch (FileNotFoundException erro){
            System.out.println ("Arquivo nao encontrado!");
        } catch (Exception erro){
            System.out.println ("Erro de Leitura !");
        }
    }
    public static String ler (int primeiro, int ultimo){
        String dados = "";
        char [] destino = new char [ultimo - primeiro];
        memoria.getChars (primeiro, ultimo, destino, 0);
        for (int i = 0; i < destino.length; i++){
            dados += destino [i];
        }
        return dados;
    }
    public static void gravar (){
        try{
            BufferedWriter saida;
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Agenda.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
