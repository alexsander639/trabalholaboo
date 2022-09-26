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
public interface ManipulacaoPedido {
    public double calculaPrecoTotal(ArrayList<Produto> produtos);
    public void addProduto(Produto produto);
    public double calculaTroco();
}
