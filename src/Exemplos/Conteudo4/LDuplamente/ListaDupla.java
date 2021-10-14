/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo4.LDuplamente;

/**
 *
 * @author marco
 */
public class ListaDupla {
    IntNoDuplo primeiro, ultimo;
    int numero_nos;

    ListaDupla (){
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    void insereNo (IntNoDuplo novoNo){
        novoNo.prox = null;
        novoNo.ant = ultimo;
        if (primeiro == null)
            primeiro = novoNo;
        if (ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }
    
    IntNoDuplo pegarNo (int indice){
        IntNoDuplo temp_no = primeiro;
        for (int i = 0; (i < indice) && (temp_no != null); i++)
            temp_no = temp_no.prox;
        return temp_no;
    }
    
    void incluiNo (IntNoDuplo novoNo, int indice){
        IntNoDuplo temp_no = pegarNo (indice);
        novoNo.prox = temp_no;
        if (novoNo.prox != null){
            novoNo.ant = temp_no.ant;
        novoNo.prox.ant = novoNo;
        }else{
        novoNo.ant = ultimo;
        ultimo = novoNo;
        }
        if (indice == 0)
            primeiro = novoNo;
        else
            novoNo.ant.prox = novoNo;
        numero_nos++;
    }
    
    void excluiNo (int indice){
        if (indice == 0){
            primeiro = primeiro.prox;
            if (primeiro != null)
                primeiro.ant = null;
        }else{
            IntNoDuplo temp_no = pegarNo (indice);
            temp_no.ant.prox = temp_no.prox;
            if (temp_no != ultimo)
                temp_no.prox.ant = temp_no.ant;
            else
                ultimo = temp_no;
        }
        numero_nos--;
    }
}
