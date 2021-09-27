/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio1;

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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Produto.txt"));
            System.out.println ("Digite o Produto");
            String Produto = entrada.readLine();
            String Marca = "";
            String Medida = "";
            String Valor = "";
            String Quantidade = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Produto);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Produto = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Marca = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Medida = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Valor = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Quantidade = ler (primeiro, fim);

                RegProduto regProduto = new RegProduto (Produto, Marca, Medida, Valor, Quantidade);
                System.out.println (
                        "Produto " + regProduto.getProduto() + "\n" +
                        "Marca: " + regProduto.getMarca () + "\n" +
                        "Medida: " + regProduto.getMedida () + "\n" +
                        "Valor: " + regProduto.getValor() + "\n" +
                        "Quantidade: " + regProduto.getQuantidade());
                System.out.println ("Entre com nova Marca: ");
                Marca = entrada.readLine ();
                regProduto.setMarca (Marca);
                System.out.println ("Entre com novo Medida: ");
                Medida = entrada.readLine ();
                regProduto.setMedida (Medida);
                System.out.println ("Entre com novo Valor: ");
                Valor = entrada.readLine ();
                regProduto.setValor (Valor);
                System.out.println ("Entre com nova Quantidade: ");
                Quantidade = entrada.readLine ();
                regProduto.setMedida (Quantidade);
                memoria.replace (inicio, fim, regProduto.getProduto () + "\t" +
                        regProduto.getMarca () + "\t" + regProduto.getMedida () + "\t" +
                        regProduto.getValor() + "\t" + regProduto.getQuantidade());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Produto.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
