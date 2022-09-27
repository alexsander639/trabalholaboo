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
public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private int telefone;
    private String endereco;

    public Pessoa(String nome, String cpf, Date dataNascimento, int telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
}
