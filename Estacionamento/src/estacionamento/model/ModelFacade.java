/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model;

import estacionamento.model.bo.Cliente;
import estacionamento.model.bo.Funcionario;
import estacionamento.model.bo.Genero;
import estacionamento.model.bo.Veiculo;
import estacionamento.model.bo.funcionarios.CaixaBehavior;
import estacionamento.model.dao.ClienteDAO;
import estacionamento.model.dao.OcupaVagaDAO;
import java.util.Calendar;

/**
 *
 * @author flavio
 */
public class ModelFacade {
    
    private static Funcionario funcionarioLogado = null;
    
    private static Funcionario getFuncionarioLogado()
    {
        if (funcionarioLogado == null)
            funcionarioLogado = new Funcionario("Gustavo Azalea", "123456780123", Calendar.getInstance(),  Genero.MASCULINO, 12345678, Calendar.getInstance(), new CaixaBehavior());
        
        return funcionarioLogado;
    }
    
    public static void ocuparVaga(String modelo, String placa, String cor)
    {
        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        
        Funcionario funcionario = getFuncionarioLogado();
        
        funcionario.ocuparVagaComum(veiculo, 0, 0);
    }
    
    public static void ocuparVagaMensalista(String cpf)
    {
        Funcionario funcionario = getFuncionarioLogado();
        
        ClienteDAO clienteDAO = ClienteDAO.getInstance();
        
        Cliente cliente = clienteDAO.identificarCliente(cpf);
        
        funcionario.ocuparVagaMensalista(cliente, 0, 0);
    }
    
    public static double descuparVaga(String placa)
    {
        Funcionario funcionario = getFuncionarioLogado();
        
        return funcionario.desocuparVagaComum(placa);
    }
    
    public static double descuparVagaMensalista(String cpf)
    {
        Funcionario funcionario = getFuncionarioLogado();
        
        ClienteDAO clienteDAO = ClienteDAO.getInstance();
        
        Cliente cliente = clienteDAO.identificarCliente(cpf);
        
        return funcionario.desocuparVagaMensalista(cliente);
    }
}
