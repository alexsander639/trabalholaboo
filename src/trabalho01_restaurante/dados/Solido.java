/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.dados;

/**
 *
 * @author ALEX e LUAN
 */
public class Solido extends Produto{
    private double peso;

    public Solido(double peso, int codProduto, String nome, double precoCompra, String unidadeMedida) {
        super(codProduto, nome, precoCompra, unidadeMedida);
        this.peso = peso;
    }
    
}
