/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio6;

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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Empresa.txt"));
            System.out.println ("Digite o Empresa");
            String Empresa = entrada.readLine();
            String Voo = "";
            String Trecho = "";
            String Saida = "";
            String Chegada = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Empresa);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Empresa = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Voo = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Trecho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Saida = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Chegada = ler (primeiro, fim);

                RegEmpresa regEmpresa = new RegEmpresa (Empresa, Voo, Trecho, Saida, Chegada);
                System.out.println (
                        "Empresa " + regEmpresa.getEmpresa() + "\n" +
                        "Voo: " + regEmpresa.getVoo () + "\n" +
                        "Trecho: " + regEmpresa.getTrecho () + "\n" +
                        "Saida: " + regEmpresa.getSaida() + "\n" +
                        "Chegada: " + regEmpresa.getChegada());
                System.out.println ("Entre com nova Voo: ");
                Voo = entrada.readLine ();
                regEmpresa.setVoo (Voo);
                System.out.println ("Entre com novo Trecho: ");
                Trecho = entrada.readLine ();
                regEmpresa.setTrecho (Trecho);
                System.out.println ("Entre com novo Saida: ");
                Saida = entrada.readLine ();
                regEmpresa.setSaida (Saida);
                System.out.println ("Entre com nova Chegada: ");
                Chegada = entrada.readLine ();
                regEmpresa.setTrecho (Chegada);
                memoria.replace (inicio, fim, regEmpresa.getEmpresa () + "\t" +
                        regEmpresa.getVoo () + "\t" + regEmpresa.getTrecho () + "\t" +
                        regEmpresa.getSaida() + "\t" + regEmpresa.getChegada());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Empresa.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
