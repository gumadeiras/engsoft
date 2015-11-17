/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import java.util.Calendar;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class Pessoa {
    
    private String nome;
    private long cpf;
    private Calendar dataNascimento;
    private Genero genero;
    private long telefone;
    private Calendar dataCadastro;

    public Pessoa(String nome, long cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public long getTelefone() {
        return telefone;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }
}
