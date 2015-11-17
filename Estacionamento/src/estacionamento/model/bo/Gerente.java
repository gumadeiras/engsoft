/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import java.util.Calendar;

/**
 *
 * @author gustavo
 */
public class Gerente extends Pessoa {

    public Gerente(String nome, long cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro) {
        super(nome, cpf, dataNascimento, genero, telefone, dataCadastro);
    }
    
    public void cadastrarCliente()
    {
        
    }
    
    public void atualizarCliente()
    {
        
    }
    
    public void gerarRelatorio()
    {
        
    }
    
    public void precificar()
    {
        
    }
}
