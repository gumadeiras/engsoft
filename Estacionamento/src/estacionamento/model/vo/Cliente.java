/*
 * To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.vo;

import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Flávio Keglevich and William Berrutti
 */
public class Cliente extends Pessoa {

    private enum PLANO { PLANO1, PLANO2, PLANO3 }
    
    private PLANO plano;
    private Set<Veiculo> veiculos; //vai ter um veiculo
    
    public Cliente(String nome, String sobrenome, long cpf, Calendar dataNascimento, Genero sexo, int userID, long telefone, Calendar dataCadastro, PLANO plano) {
        super(nome, sobrenome, cpf, dataNascimento, sexo, userID, telefone, dataCadastro);
        
        this.plano = plano;
        this.veiculos = new HashSet<Veiculo>(); //só vai ter um veiculo
    }

    public void setPlano(PLANO plano)
    {
        this.plano = plano;
    }
    
    public PLANO getPlano()
    {
        return plano;
    }
    
    public void cadastrarVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }
    
    public void descadastrarVeiculo(Veiculo veiculo)
    {
        veiculos.remove(veiculo);
    }
    
    public int getNumVeiculosCadastrados()
    {
        return veiculos.size();
    }
    
    public List<Veiculo> listarVeiculosCadastrados()
    {
        LinkedList<Veiculo> resultado = new LinkedList<Veiculo>();
        
        for (Veiculo veiculo : veiculos)
        {
            resultado.add(veiculo);
        }
        
        return resultado;
    }
}
