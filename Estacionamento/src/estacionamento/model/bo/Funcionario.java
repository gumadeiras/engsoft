/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.bo.funcionarios.IFuncionarioBehavior;
import java.util.Calendar;

/**
 *
 * @author gustavo
 */
public class Funcionario extends Pessoa {

    private final IFuncionarioBehavior behavior;
    
    public Funcionario(String nome, long cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro, IFuncionarioBehavior behavior) {
        super(nome, cpf, dataNascimento, genero, telefone, dataCadastro);
        this.behavior = behavior;
    }
    
    public IFuncionarioBehavior getBehavior()
    {
        return behavior;
    }
}
