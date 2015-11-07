/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.vo.Cliente;
import estacionamento.model.vo.Veiculo;

/**
 *
 * @author flavio
 */
public class CaixaBO {
    
    public CaixaBO()
    {
        
    }
    
    /*public void adicionarVeiculo(long cpf, String placaVeiculo, float valorHora) throws ClienteNaoCadastradoException
    {
        ClienteBO clienteBO = new ClienteBO();
        
        Cliente cliente = clienteBO.identificarCliente(cpf);
        Veiculo veiculo = clienteBO.identificarVeiculo(cliente, placaVeiculo);
        
        OcupaVagaBO ocupaVagaBO = new OcupaVagaBO();
        ocupaVagaBO.ocuparVaga(cliente, veiculo, valorHora);
    }*/
    
    public Cliente identificarCliente(long cpf) throws ClienteNaoCadastradoException
    {
        ClienteBO clienteBO = new ClienteBO();
        return clienteBO.identificarCliente(cpf);
    }
    
    public void cadastrarNovoVeiculo(Cliente cliente, String placa, String cor, String modelo)
    {
        ClienteBO clienteBO = new ClienteBO();
        clienteBO.cadastrarNovoVeiculo(cliente, new Veiculo(modelo, placa, cor));
    }
    
    public void removerVeiculo(long cpf, String placaVeiculo) throws ClienteNaoCadastradoException
    {
        ClienteBO clienteBO = new ClienteBO();
        
        Cliente cliente = clienteBO.identificarCliente(cpf);
        Veiculo veiculo = clienteBO.identificarVeiculo(cliente, placaVeiculo);
        
        OcupaVagaBO ocupaVagaBO = new OcupaVagaBO();
        ocupaVagaBO.desocuparVaga(veiculo);
    }
}
