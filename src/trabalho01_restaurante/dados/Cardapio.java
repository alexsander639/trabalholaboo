/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.dados;

import trabalho01_restaurante.interfaces.AdicionarProduto;
import java.util.List;

/**
 *
 * @author ALEX e LUAN
 */
public class Cardapio implements AdicionarProduto{
    private int codCardapio;
    private List<Produto> produtos;

    public Cardapio(int codCardapio, List<Produto> produtos) {
        this.codCardapio = codCardapio;
        this.produtos = produtos;
    }

    @Override
    public void addProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
