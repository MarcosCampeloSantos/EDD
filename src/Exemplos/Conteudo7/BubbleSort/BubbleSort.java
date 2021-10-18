/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo7.BubbleSort;

/**
 *
 * @author marco
 */
public class BubbleSort {
    public static void main(String args[]) {
        int[] vBS = {6, 3, 5, 4, 1, 10};
        BubbleSort bs = new BubbleSort();
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
