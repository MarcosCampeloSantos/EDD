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
public class LDuplamente {
    public static void main(String[] args){
        ListaDupla Slist = new ListaDupla ();
        Slist.insereNo(new IntNoDuplo(1));
        Slist.insereNo(new IntNoDuplo(3));
        Slist.insereNo(new IntNoDuplo(5));
        Slist.insereNo(new IntNoDuplo(7));
        IntNoDuplo temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
        Slist.incluiNo (new IntNoDuplo (2), 1);
        System.out.println ("Apos incluir o no 2...");
        temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
        Slist.excluiNo (2);
        System.out.println ("Apos excluir o no 3...");
        temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
    }
}
