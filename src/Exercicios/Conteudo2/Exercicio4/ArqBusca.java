/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio4;

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
            arqentrada = new BufferedReader (new FileReader ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Academia.txt"));
            System.out.println ("Digite o Academia");
            String Academia = entrada.readLine();
            String Atividade = "";
            String Aparelho = "";
            String Horario = "";
            String Dia = "";
            String linha = "";
            while ( (linha = arqentrada.readLine()) != null ) {
                memoria.append (linha + "\n"); 
                // .append é o método aloca novas strings concatenadas para o mesmo objeto
            }
            int inicio = -1;
            inicio = memoria.indexOf (Academia);
            // . indexOf: Método que retorna a posição da primeira ocorrência do(s) caractere(s) especificado(s) em uma string.
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                Academia = ler (inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Atividade = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Aparelho = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                Horario = ler (primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                Dia = ler (primeiro, fim);

                RegAcademia regAcademia = new RegAcademia (Academia, Atividade, Aparelho, Horario, Dia);
                System.out.println (
                        "Academia " + regAcademia.getAcademia() + "\n" +
                        "Atividade: " + regAcademia.getAtividade () + "\n" +
                        "Aparelho: " + regAcademia.getAparelho () + "\n" +
                        "Horario: " + regAcademia.getHorario() + "\n" +
                        "Dia: " + regAcademia.getDia());
                System.out.println ("Entre com nova Atividade: ");
                Atividade = entrada.readLine ();
                regAcademia.setAtividade (Atividade);
                System.out.println ("Entre com novo Aparelho: ");
                Aparelho = entrada.readLine ();
                regAcademia.setAparelho (Aparelho);
                System.out.println ("Entre com novo Horario: ");
                Horario = entrada.readLine ();
                regAcademia.setHorario (Horario);
                System.out.println ("Entre com nova Dia: ");
                Dia = entrada.readLine ();
                regAcademia.setAparelho (Dia);
                memoria.replace (inicio, fim, regAcademia.getAcademia () + "\t" +
                        regAcademia.getAtividade () + "\t" + regAcademia.getAparelho () + "\t" +
                        regAcademia.getHorario() + "\t" + regAcademia.getDia());
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
            saida = new BufferedWriter (new FileWriter ("C:/Users/marco/Desktop/ESTRUTURA DE DADOS/Arquivos/Academia.txt"));
            saida.write (memoria.toString ());
            saida.flush ();
            saida.close ();
        } catch (Exception erro){
            System.out.println ("Erro de gravacao!");
        }
    }
}
