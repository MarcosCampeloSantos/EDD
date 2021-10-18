/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo7.QuickSort;

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
        int vetorQS[] = { 17, 35, 35, 46, 7, 8, 22, 2, 9, 31, 10 };
        quickSort(vetorQS, 0, vetorQS.length - 1);

        for (int i = 0; i < vetorQS.length; i++) {
            System.out.println(" " + vetorQS[i]);
        }
    }
}
