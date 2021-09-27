/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio3;

import Exercicios.Conteudo2.Exercicio2.*;
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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Veiculo.txt"));
            System.out.println ("Digite o Veiculo");
            String Veiculo = entrada.readLine();
            String Marca = "";
            String Ano = "";
            String Cor = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Veiculo);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Veiculo = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Marca = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Ano = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Cor = ler (primeiro, fim);

                RegVeiculo regVeiculo = new RegVeiculo (Veiculo, Marca, Ano, Cor);
                System.out.println (
                        "Veiculo: " + regVeiculo.getVeiculo() + "\n" +
                        "Marca: " + regVeiculo.getMarca () + "\n" +
                        "Ano: " + regVeiculo.getAno () + "\n" +
                        "Cor: " + regVeiculo.getCor());
                System.out.println ("Entre com nova Marca: ");
                Marca = entrada.readLine ();
                regVeiculo.setMarca (Marca);
                System.out.println ("Entre com novo Ano: ");
                Ano = entrada.readLine ();
                regVeiculo.setAno (Ano);
                System.out.println ("Entre com novo Cor: ");
                Cor = entrada.readLine ();
                regVeiculo.setCor (Cor);
                memoria.replace (inicio, fim, regVeiculo.getVeiculo () + "\t" +
                        regVeiculo.getMarca () + "\t" + regVeiculo.getAno () + "\t" +
                        regVeiculo.getCor());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Veiculo.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
