/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.dados;

import trabalho01_restaurante.interfaces.ManipulacaoPedido;
import java.util.List;
import trabalho01_restaurante.interfaces.AdicionarProduto;

/**
 *
 * @author ALEX e LUAN
 */
public class Pedido implements ManipulacaoPedido, AdicionarProduto{
    private int codPedido;
    private String formaPagamento;
    private List<Produto> produtos;
    private double precoTotal;
    private double troco;

    public Pedido(int codPedido, String formaPagamento, List<Produto> produtos, double precoTotal, double troco) {
        this.codPedido = codPedido;
        this.formaPagamento = formaPagamento;
        this.produtos = produtos;
        this.precoTotal = precoTotal;
        this.troco = troco;
    }

    @Override
    public double calculaPrecoTotal(List<Produto> produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculaTroco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
