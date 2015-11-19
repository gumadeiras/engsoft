/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import java.util.Calendar;

/**
 *
 * @author Flávio Keglevich and William Berrutti
 */
public class Cliente extends Pessoa {
    
    private PlanoCliente plano;
    private Veiculo veiculo;
    
    public Cliente(String nome, long cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro, PlanoCliente plano, Veiculo veiculo) {
        super(nome, cpf, dataNascimento, genero, telefone, dataCadastro);
        this.plano = plano;
        this.veiculo = veiculo;
    }

    public void setPlano(PlanoCliente plano)
    {
        this.plano = plano;
    }
    
    public PlanoCliente getPlano()
    {
        return plano;
    }
    
    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }
    
    public Veiculo getVeiculo()
    {
        return veiculo;
    }
}
