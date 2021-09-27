/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio5;

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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Rede.txt"));
            System.out.println ("Digite o Rede");
            String Rede = entrada.readLine();
            String Nome = "";
            String Seguidores = "";
            String Assunto = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Rede);
            // . indexOf: Método que retorna a posição da primeira oAssuntorência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Rede = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Nome = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Seguidores = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Assunto = ler (primeiro, fim);

                RegRede regRede = new RegRede (Rede, Nome, Seguidores, Assunto);
                System.out.println (
                        "Rede: " + regRede.getRede() + "\n" +
                        "Nome: " + regRede.getNome () + "\n" +
                        "Seguidores: " + regRede.getSeguidores () + "\n" +
                        "Assunto: " + regRede.getAssunto());
                System.out.println ("Entre com nova Nome: ");
                Nome = entrada.readLine ();
                regRede.setNome (Nome);
                System.out.println ("Entre com novo Seguidores: ");
                Seguidores = entrada.readLine ();
                regRede.setSeguidores (Seguidores);
                System.out.println ("Entre com novo Assunto: ");
                Assunto = entrada.readLine ();
                regRede.setAssunto (Assunto);
                memoria.replace (inicio, fim, regRede.getRede () + "\t" +
                        regRede.getNome () + "\t" + regRede.getSeguidores () + "\t" +
                        regRede.getAssunto());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Rede.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
