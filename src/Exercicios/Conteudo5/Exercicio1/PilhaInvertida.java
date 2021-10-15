/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo5.Exercicio1;

/**
 *
 * @author marco
 */
public class PilhaInvertida {
    int tamanho;
    int topo;
    Object vetor[];
    
    PilhaInvertida(int tam) {
        topo = tam + 1;
        tamanho = tam;
        vetor = new Object[tam + 1];
    }
    
    public boolean vazia (){
        if (topo == (tamanho + 1)) 
            return true;
        else 
            return false;
    }
    
    public boolean cheia (){
        if (topo < 0) 
            return true;
        else 
            return false;
    }
    
    public void empilhar(Object elem){
        if (cheia( ) == false){
            topo--;
            vetor[topo] = elem;        
        }
        else{
            System.out.println("Pilha Cheia");
        }
    } 
    
    public Object desempilhar(){
        Object valorDesempilhado;
        if ( vazia( ) == true ){
            System.out.print("Pilha Vazia");
            valorDesempilhado = null;
            return valorDesempilhado;
        }
        else{
            valorDesempilhado = vetor[topo];
            vetor[topo] = null;
            topo++;
            return valorDesempilhado;
        }
    }
    
    public void exibePilha(){
        for(int i = tamanho; i >= 0; i--)
            if(vetor[i] != null){
                System.out.println("Elemento " + vetor[i] + " posicao " + i);
            }else{
                System.out.println("Vetor "+ i +" Vazio");
            }
        
    }
}
