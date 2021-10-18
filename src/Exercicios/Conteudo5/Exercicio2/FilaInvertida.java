/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo5.Exercicio2;


/**
 *
 * @author marco
 */
public class FilaInvertida {
    int tamanho;
    int inicio;
    int fim;
    int total;
    Object vetor[];
    
    FilaInvertida(int tam) {
       inicio = 0;
       fim = tam - 1;
       total = tam;
       tamanho = tam;
       vetor = new Object[tam];
    } 
    
    public boolean vazia () {
        if (total == 3) 
           return true;
        else 
           return false;
    }
    
    public boolean cheia () {
        if (total < 0) 
           return true;
        else 
           return false;
    }
    
    public void enfileirar(Object elem) {
        if ( !cheia()){
            vetor[fim] = elem;
        }
        fim--;
        total--;
        if (fim < 0){
            fim = tamanho - 1;
        }
        else{ 
            System.out.println("Fila Cheia");
        }
    }
    
    public Object desenfileirar(){ 
        Object excluido; 
        if (vazia() == false){
            excluido = vetor[inicio];
            vetor[inicio] = null;
            inicio++;
            if (inicio > tamanho)
                inicio = 0;
            return excluido;
        } else{
            excluido = null;
            return excluido;
        }  
    }
    
    public void exibeFila(){
        for (int i = tamanho - 1; i >= 0; i--){
            System.out.println("posicao " + i +" valor "+vetor[i]);
        }
    }
}
