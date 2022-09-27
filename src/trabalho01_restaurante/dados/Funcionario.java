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
public class Funcionario extends Pessoa{
    private int codFuncionario;
    private String login;
    private String senha;
    

    public Funcionario(int codFuncionario, String login, String senha, String nome, String cpf, Date dataNascimento, int telefone, String endereco) {
        super(nome, cpf, dataNascimento, telefone, endereco);
        this.codFuncionario = codFuncionario;
        this.login = login;
        this.senha = senha;
    }
    
}
