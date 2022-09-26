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
public class Funcionario extends Pessoa{
    private int codFuncionario;
    private String login;
    private String senha;
    private String endereco;
    

    public Funcionario(int codFuncionario, String login, String senha, String endereco, String nome, String cpf, Date dataNascimento, int telefone) {
        super(nome, cpf, dataNascimento, telefone);
        this.codFuncionario = codFuncionario;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }
    
}
