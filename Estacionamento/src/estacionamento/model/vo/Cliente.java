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

    public enum Categoria {COMUM, MENSALISTA}
    
    private Categoria categoria;
    private Set<Veiculo> veiculos;
    
    public Cliente(String nome, String sobrenome, long cpf, Calendar dataNascimento, Genero sexo, int userID, long telefone, Calendar dataCadastro, Categoria categoria) {
        super(nome, sobrenome, cpf, dataNascimento, sexo, userID, telefone, dataCadastro);
        
        this.categoria = categoria;
        this.veiculos = new HashSet<Veiculo>();
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }
    
    public Categoria getCategoria()
    {
        return categoria;
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
