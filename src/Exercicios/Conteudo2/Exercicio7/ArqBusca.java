/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio7;

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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Roupa.txt"));
            System.out.println ("Digite o Roupa");
            String Roupa = entrada.readLine();
            String Tamanho = "";
            String Cor = "";
            String Modelo = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Roupa);
            // . indexOf: Método que retorna a posição da primeira oModelorência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Roupa = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Tamanho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Cor = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Modelo = ler (primeiro, fim);

                RegLoja regRoupa = new RegLoja (Roupa, Tamanho, Cor, Modelo);
                System.out.println (
                        "Roupa: " + regRoupa.getRoupa() + "\n" +
                        "Tamanho: " + regRoupa.getTamanho () + "\n" +
                        "Cor: " + regRoupa.getCor () + "\n" +
                        "Modelo: " + regRoupa.getModelo());
                System.out.println ("Entre com nova Tamanho: ");
                Tamanho = entrada.readLine ();
                regRoupa.setTamanho (Tamanho);
                System.out.println ("Entre com novo Cor: ");
                Cor = entrada.readLine ();
                regRoupa.setCor (Cor);
                System.out.println ("Entre com novo Modelo: ");
                Modelo = entrada.readLine ();
                regRoupa.setModelo (Modelo);
                memoria.replace (inicio, fim, regRoupa.getRoupa () + "\t" +
                        regRoupa.getTamanho () + "\t" + regRoupa.getCor () + "\t" +
                        regRoupa.getModelo());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Roupa.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
