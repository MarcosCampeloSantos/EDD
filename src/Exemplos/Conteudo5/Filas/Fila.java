/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo5.Filas;

/**
 *
 * @author marco
 */
public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];
    
    Fila(int tam) {
       inicio = 0;
       fim = 0;
       total = 0;
       tamanho = tam;
       vetor = new Object[tam];
    } 
    
    public boolean vazia () {
        if (total == 0) 
           return true;
        else 
           return false;
    }
    
    public boolean cheia () {
        if (total >= tamanho) 
           return true;
        else 
           return false;
    }
    
    public void enfileirar(Object elem) {
        if ( !cheia()){
            vetor[fim] = elem;
        }
        fim++;
        total++;
        if (fim >= tamanho){
            fim = 0;
        }
        else{ 
            System.out.println("Fila Cheia");
        }
    }
    
    public Object desenfileirar(){ 
        Object excluido;{ 
            if (vazia() == false){
                excluido = vetor[inicio];
                inicio++;
                if (inicio >= tamanho)
                    inicio = 0;
                return excluido;
            } else{
                excluido = null;
                return excluido;
            }
        }
    }
    
    public void exibeFila(){
        for (int i = inicio; i < total; i++){
            System.out.println("posicao " + i +" valor "+vetor[i]);
        }
    }
}
