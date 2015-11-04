/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.vo;

import java.util.Calendar;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class Pessoa {
    
    public enum Genero {MASCULINO, FEMININO};
    
    private String nome;
    private String sobrenome;
    private long cpf;
    private Calendar dataNascimento;
    private Genero genero;
    private int userID;
    private long telefone;
    private Calendar dataCadastro;

    public Pessoa(String nome, String sobrenome, long cpf, Calendar dataNascimento, Genero genero, int userID, long telefone, Calendar dataCadastro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.userID = userID;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(Genero sexo) {
        this.genero = sexo;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getSobrenome() {
        return sobrenome;
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
    
    public int getUserID() {
        return userID;
    }

    public long getTelefone() {
        return telefone;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }
}
