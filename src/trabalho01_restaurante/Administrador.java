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
public class Administrador extends Funcionario{
    private int codSeguranca;

    public Administrador(int codSeguranca, int codFuncionario, String login, String senha, String endereco, String nome, String cpf, Date dataNascimento, int telefone) {
        super(codFuncionario, login, senha, endereco, nome, cpf, dataNascimento, telefone);
        this.codSeguranca = codSeguranca;
    }
    
}
