/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Conteudo2.Exercicio1;

/**
 *
 * @author marco
 */
public class RegProduto {
    
    private String Produto;
    private String Marca;
    private String Medida;
    private String Valor;
    private String Quantidade;

    public RegProduto (String produto, String marca, String medida, String valor, String quantidade){
        Produto = produto;
        Marca = marca;
        Medida = medida;
        Valor = valor;
        Quantidade = quantidade;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }
}
