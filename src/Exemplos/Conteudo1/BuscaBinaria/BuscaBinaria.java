/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo1.BuscaBinaria;

/**
 *
 * @author marco
 */
public class BuscaBinaria {
    public static boolean binaria(int x, int numeros []){
        int inicio = 0, fim = numeros.length-1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (x == numeros[meio])
                return true;
            if (x < numeros[meio])
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return false;
    }

}
