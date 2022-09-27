/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho01_restaurante.dados;

import java.util.Date;

/**
 *
 * @author ALEX e LUAN
 */
public class Administrador extends Funcionario{
    private int codSeguranca;

    public Administrador(int codSeguranca, int codFuncionario, String login, String senha, String nome, String cpf, Date dataNascimento, int telefone, String endereco) {
        super(codFuncionario, login, senha, nome, cpf, dataNascimento, telefone, endereco);
        this.codSeguranca = codSeguranca;
    }
    
}
