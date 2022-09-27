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
public class Liquido extends Produto{
    private boolean alcoolico;
    private double quantidade;

    public Liquido(boolean alcoolico, double quantidade, int codProduto, String nome, double precoCompra, String unidadeMedida) {
        super(codProduto, nome, precoCompra, unidadeMedida);
        this.alcoolico = alcoolico;
        this.quantidade = quantidade;
    }
    
}
