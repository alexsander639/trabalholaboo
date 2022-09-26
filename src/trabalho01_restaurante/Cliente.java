/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante;

import java.util.Date;

/**
 *
 * @author ALEX e LUAN
 */
public class Cliente extends Pessoa{
    private int codCliente;

    public Cliente(int codCliente, String nome, String cpf, Date dataNascimento, int telefone) {
        super(nome, cpf, dataNascimento, telefone);
        this.codCliente = codCliente;
    }
    
}
