/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo1.OrdenaTroca;

/**
 *
 * @author marco
 */
public class OrdenaTroca {
    public static void main(String[] args) {

        int num [] = new int [7];
        num [0] = 9;
        num [1] = 1;
        num [2] = 3;
        num [3] = 2;
        num [4] = 7;
        num [5] = 5;
        num [6] = 4;
		
    bolha (num);
		
    for (int i = 0; i < num.length; i++)
        System.out.println (num [i]);
    }

    public static void bolha (int numeros []){

        final int n = numeros.length; //tamanho do vetor
        int aux; //variavel auxiliar de troca

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if (numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }  
}
