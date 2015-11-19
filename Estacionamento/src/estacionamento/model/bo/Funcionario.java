/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.bo.funcionarios.IFuncionarioBehavior;
import estacionamento.model.dao.OcupaVagaDAO;
import java.util.Calendar;

/**
 *
 * @author gustavo
 */
public class Funcionario extends Pessoa implements IFuncionario {

    private final IFuncionarioBehavior behavior;
    
    public Funcionario(String nome, long cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro, IFuncionarioBehavior behavior) {
        super(nome, cpf, dataNascimento, genero, telefone, dataCadastro);
        this.behavior = behavior;
    }
    
    public IFuncionarioBehavior getBehavior()
    {
        return behavior;
    }
    
    @Override
    public void ocuparVagaComum(Veiculo veiculo, int numBloco, int numVaga)
    {
        OcupaVaga ocupacao = new OcupaVaga(Calendar.getInstance(), null, veiculo, numBloco, numVaga);
        OcupaVagaDAO ocupacaoDAO = OcupaVagaDAO.getInstance();
        ocupacaoDAO.ocuparVaga(ocupacao);
    }

    @Override
    public void ocuparVagaMensalista(Cliente cliente, int numBloco, int numVaga) 
    {
        ocuparVagaComum(cliente.getVeiculo(), numBloco, numVaga);
    }
    
    @Override
    public double desocuparVagaComum(Veiculo veiculo)
    {
        OcupaVagaDAO ocupacaoDAO = OcupaVagaDAO.getInstance();
        
        OcupaVaga ocupacao = ocupacaoDAO.pesquisarVaga(veiculo);
        
        ocupacaoDAO.desocuparVaga(ocupacao);
        
        ocupacao.setDataSaida(Calendar.getInstance());
        
        return ocupacao.calcularPagamento();
    }

    @Override
    public double desocuparVagaMensalista(Cliente cliente) 
    {
        return desocuparVagaComum(cliente.getVeiculo());
    }
    
    
}
