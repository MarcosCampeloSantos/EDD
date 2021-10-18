/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos.Conteudo6.ArvoreBinaria;

/**
 *
 * @author marco
 */
public class BArvore {
    private BIntNo Raiz;
	
    private BIntNo inserir (BIntNo arvore, int novoNo){
        if (arvore == null)
            return new BIntNo (novoNo);
        else if (novoNo < arvore.valor)
            arvore.esq = inserir (arvore.esq, novoNo);
        else
            arvore.dir = inserir (arvore.dir, novoNo);
        return arvore;
    }
    public void inserirNo (int novoValor){
        Raiz = inserir (Raiz, novoValor);
    }
    private void exibir (BIntNo arv){
        if (arv != null){
            exibir (arv.esq);
            System.out.println (arv.valor);
            exibir (arv.dir);
        }
    }
    public void exibirNo (){
        exibir (Raiz);
    }
    
    public void excluirNo (int item){
        try{
            BIntNo tempNo = Raiz, pai = null, filho = Raiz, temp;
            while (tempNo != null && tempNo.valor != item){
                pai = tempNo;
                if (item < tempNo.valor)
                    tempNo = tempNo.esq;
                else
                    tempNo = tempNo.dir;
            }
            if (tempNo == null)
                System.out.println ("Item nao localizado.");
            if (pai == null){
                if (tempNo.dir == null)
                    Raiz = tempNo.esq;
                else if (tempNo.esq == null)
                    Raiz = tempNo.dir;
                else{
                    for (temp = tempNo, filho = tempNo.esq;
                    filho.dir != null; temp = filho, filho = filho.dir);
                    if (filho != tempNo.esq){
                        temp.dir = filho.esq;
                        filho.esq = Raiz.esq;
                    }
                    filho.dir = Raiz.dir;
                    Raiz = filho;
                }
            }else if (tempNo.dir == null){
                if (pai.esq == tempNo)
                    pai.esq = tempNo.esq;
                else
                    pai.dir = tempNo.esq;
            }else if (tempNo.esq == null){
                if (pai.esq == tempNo)
                    pai.esq = tempNo.dir;
                else
                    pai.dir = tempNo.dir;
            }else{
                for (temp = tempNo, filho = tempNo.esq;
                filho.dir != null; temp = filho, filho = filho.dir);
                if (filho != tempNo.esq){
                    temp.dir = filho.esq;
                    filho.esq = tempNo.esq;
                }
                filho.dir = tempNo.dir;
                if (pai.esq == tempNo)
                    pai.esq = filho;
                else
                    pai.dir = filho;
            }
        }catch (NullPointerException erro){
            //Item nao encontrado
        }
    }
}
