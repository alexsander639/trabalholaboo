/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante;

import java.util.ArrayList;

/**
 *
 * @author ALEX e LUAN
 */
public class Pedido implements ManipulacaoPedido{
    private int codPedido;
    private String formaPagamento;
    private ArrayList<Produto> produtos;
    private double precoTotal;
    private double troco;

    public Pedido(int codPedido, String formaPagamento, ArrayList<Produto> produtos, double precoTotal, double troco) {
        this.codPedido = codPedido;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
        this.precoTotal = precoTotal;
        this.troco = troco;
    }

    @Override
    public double calculaPrecoTotal(ArrayList<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculaTroco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
