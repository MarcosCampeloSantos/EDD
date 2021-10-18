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
public class quickSort {
    
    public static void quickSort(int vQS[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = vQS[(esq + dir) / 2];
        int troca;

        while (esq <= dir) {
            while (vQS[esq] < pivo) {
                esq = esq + 1;
            }
            while (vQS[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                troca = vQS[esq];
                vQS[esq] = vQS[dir];
                vQS[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda)
            quickSort(vQS, esquerda, dir);

        if (esq < direita)
            quickSort(vQS, esq, direita);
    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int tamanho;
        int valor;
        
        System.out.println("Tamanho do Vetor: ");
        tamanho = teclado.nextInt();
        
        int[] vetorQS = new int[tamanho];
        
        for(int i = 0; i < tamanho - 1; i++){
            System.out.println("Insira o "+i+"ª Valor: ");
            valor = teclado.nextInt();
            vetorQS[i] = valor;
        }
        
        quickSort(vetorQS, 0, vetorQS.length - 1);

        for (int i = 0; i < vetorQS.length; i++) {
            System.out.println(" " + vetorQS[i]);
        }
    }
}
