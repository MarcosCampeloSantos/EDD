/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio8;

import Exercicios.Conteudo2.Exercicio6.*;
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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Cliente.txt"));
            System.out.println ("Digite o Cliente");
            String Cliente = entrada.readLine();
            String Dia = "";
            String Horario = "";
            String Servico = "";
            String Valor = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Cliente);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Cliente = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Dia = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Horario = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Servico = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Valor = ler (primeiro, fim);

                RegCliente regCliente = new RegCliente (Cliente, Dia, Horario, Servico, Valor);
                System.out.println (
                        "Cliente " + regCliente.getCliente() + "\n" +
                        "Dia: " + regCliente.getDia () + "\n" +
                        "Horario: " + regCliente.getHorario () + "\n" +
                        "Servico: " + regCliente.getServico() + "\n" +
                        "Valor: " + regCliente.getValor());
                System.out.println ("Entre com nova Dia: ");
                Dia = entrada.readLine ();
                regCliente.setDia (Dia);
                System.out.println ("Entre com novo Horario: ");
                Horario = entrada.readLine ();
                regCliente.setHorario (Horario);
                System.out.println ("Entre com novo Servico: ");
                Servico = entrada.readLine ();
                regCliente.setServico (Servico);
                System.out.println ("Entre com nova Valor: ");
                Valor = entrada.readLine ();
                regCliente.setHorario (Valor);
                memoria.replace (inicio, fim, regCliente.getCliente () + "\t" +
                        regCliente.getDia () + "\t" + regCliente.getHorario () + "\t" +
                        regCliente.getServico() + "\t" + regCliente.getValor());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Cliente.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
