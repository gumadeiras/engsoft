/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.bo.funcionarios.CaixaBehavior;
import estacionamento.model.bo.funcionarios.ManobristaBehavior;
import java.util.Calendar;

/**
 *
 * @author flavio
 */
public class FuncionarioFactory {
    
    private static FuncionarioFactory instance;
    
    public static FuncionarioFactory getInstance()
    {
        if (instance == null)
            instance = new FuncionarioFactory();
        
        return instance;
    }
    
    private FuncionarioFactory()
    {
        
    }
    
    public Funcionario createCaixa(String nome, String cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro)
    {
        return new Funcionario(nome, cpf, dataNascimento, genero, telefone, dataCadastro, new CaixaBehavior());
    }
    
    public Funcionario createManobrista(String nome, String cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro)
    {
        return new Funcionario(nome, cpf, dataNascimento, genero, telefone, dataCadastro, new ManobristaBehavior());
    }
}
