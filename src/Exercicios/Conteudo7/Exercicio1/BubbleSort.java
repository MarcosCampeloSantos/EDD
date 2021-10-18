/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo7.Exercicio1;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class BubbleSort {
    
    
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        int tamanho;
        int valor;
        
        System.out.println("Tamanho do Vetor: ");
        tamanho = teclado.nextInt();
        
        int[] vBS = new int[tamanho];
        
        for(int i = 0; i < tamanho - 1; i++){
            System.out.println("Insira o "+i+"ª Valor: ");
            valor = teclado.nextInt();
            vBS[i] = valor;
        }
        
        bs.ordenar(vBS);
        for(int num : vBS) {
            System.out.print(num + " ");
        }
    }
    
    public void ordenar(int[] vBS) {    
        for(int i = 0; i < vBS.length - 1; i++) {
            for(int j = 0; j < vBS.length - 1 - i; j++) {
                if(vBS[j] > vBS[j + 1]) {
                    int aux = vBS[j];
                    vBS[j] = vBS[j + 1];
                    vBS[j + 1] = aux;
                }
            }
        }
    }
}
