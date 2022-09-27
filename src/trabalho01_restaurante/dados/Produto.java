/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.dados;

import trabalho01_restaurante.interfaces.CalculoProduto;

/**
 *
 * @author ALEX e LUAN
 */
public class Produto implements CalculoProduto{
    private int codProduto;
    private String nome;
    private double precoCompra;
    private String unidadeMedida;
    private double precoVenda;

    public Produto(int codProduto, String nome, double precoCompra, String unidadeMedida) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public double calculaValorVenda(double precoCompra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
