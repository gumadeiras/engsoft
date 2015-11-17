/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author flavio
 */
public class ClienteBO {
    
    public ClienteBO()
    {
        
    }
    
    public Cliente identificarCliente(long cpf) throws ClienteNaoCadastradoException
    {
        Cliente resultado = ClienteDAO.identificarCliente(cpf);
        
        if (resultado == null)
        {
            throw new ClienteNaoCadastradoException();
        }
        
        return resultado;
    }
    
    public void cadastrarNovoVeiculo(Cliente cliente, Veiculo veiculo)
    {
        cliente.cadastrarVeiculo(veiculo);
    }
    
    public Veiculo identificarVeiculo(Cliente cliente, String placa)
    {
        List<Veiculo> veiculos = cliente.listarVeiculosCadastrados();
        
        for (Veiculo veiculo : veiculos)
        {
            if (veiculo.getPlaca() == null ? placa == null : veiculo.getPlaca().equals(placa))
                return veiculo;
        }
        
        return null;
    }
}
