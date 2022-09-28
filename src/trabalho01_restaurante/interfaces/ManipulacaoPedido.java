/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.interfaces;

import java.util.List;
import trabalho01_restaurante.dados.Produto;

/**
 *
 * @author ALEX e LUAN
 */
public interface ManipulacaoPedido {
    public double calculaPrecoTotal(List<Produto> produtos);
    public double calculaTroco();
}
