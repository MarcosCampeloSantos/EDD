/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo1.BuscaLinear;

/**
 *
 * @author marco
 */
public class Buscar {
    
   public static boolean linear (int x, int dados []){
        final int n = dados.length;
        for (int i = 0; i < n; i++){
            if (x == dados[i]){                             
                return true;
            }
        }
        return false;                        
    }                 
}
