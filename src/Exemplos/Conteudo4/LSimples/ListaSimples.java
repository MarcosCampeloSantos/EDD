/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo4.LSimples;

/**
 *
 * @author marco
 */
public class ListaSimples {
    IntNoSimples primeiro, ultimo;
    int numero_nos;
    ListaSimples(){
        primeiro = ultimo = null;
    }
    
    void insereNo_fim (IntNoSimples novoNo){
        novoNo.prox = null;
    if (primeiro == null)/*nesta condição, é o primeiro elemento a ser inserido*/
        primeiro = novoNo;
    if (ultimo != null)
        ultimo.prox = novoNo;
        ultimo = novoNo;
    }
    
    void insereNo_inicio (IntNoSimples novoNo){
    if (primeiro != null)
                novoNo.prox = primeiro;
        else{ 
            if (primeiro == null)
                primeiro = novoNo;
                ultimo = novoNo;
        }
    }
    int ContarNos(){
        int tamanho = 0;
        IntNoSimples temp_no = primeiro;
        while (temp_no != null)
        { tamanho++;
            temp_no = temp_no.prox;
        }
        return tamanho;
    }
    
    void insereNo_posicao(IntNoSimples novoNo, int posicao){
        IntNoSimples temp_no = primeiro;
        int numero_nos = ContarNos();
        int pos_aux;          
        if(posicao == 0){
            novoNo.prox = primeiro;
            if(primeiro == ultimo){
                ultimo = novoNo;
            }
            primeiro = novoNo;
        }
        else{
            if (posicao <= numero_nos){
                pos_aux = 1;
                while(temp_no != null && posicao > pos_aux){
                    temp_no = temp_no.prox;
                    pos_aux ++;
                }
                novoNo.prox = temp_no.prox;
                temp_no.prox = novoNo;
            }
            else{
                if(posicao > numero_nos){
                    ultimo.prox = novoNo;
                    ultimo = novoNo;
                }  
            }  
        } 
    }
    
    IntNoSimples buscaNo (int buscaValor){
        int i = 0;
        IntNoSimples temp_no = primeiro;
        while (temp_no != null){
            if (temp_no.valor == buscaValor){
                System.out.println("No " + temp_no.valor + " posicao " + i);
                return temp_no;
            }
            i++;
            temp_no = temp_no.prox;
        }
        return null;
    }
    
    void excluiNo (int valor){
        IntNoSimples temp_no = primeiro;
        while (temp_no != null && temp_no.valor != valor){
            temp_no = temp_no.prox;
        }
        temp_no.prox = temp_no.prox.prox;
        if (ultimo == temp_no.prox)
            ultimo = temp_no;
    } 
    
    void exibeLista(){
        IntNoSimples temp_no = primeiro;
        int i = 0;
        while (temp_no != null){
            System.out.println("Valor " + temp_no.valor + " posicao "+ i);
            temp_no = temp_no.prox;
            i++;
        }
    }
}
