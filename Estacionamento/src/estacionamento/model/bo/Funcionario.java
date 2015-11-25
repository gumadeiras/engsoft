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
public class Funcionario extends Pessoa {

    private final IFuncionarioBehavior behavior;

    public Funcionario(String nome, String cpf, Calendar dataNascimento, Genero genero, long telefone, Calendar dataCadastro, IFuncionarioBehavior behavior) {
        super(nome, cpf, dataNascimento, genero, telefone, dataCadastro);
        this.behavior = behavior;
    }

    public IFuncionarioBehavior getBehavior()
    {
        return behavior;
    }

    public void ocuparVagaComum(Veiculo veiculo, int numBloco, int numVaga)
    {
        OcupaVaga ocupacao = new OcupaVaga(Calendar.getInstance(), null, veiculo, numBloco, numVaga);
        OcupaVagaDAO ocupacaoDAO = OcupaVagaDAO.getInstance();
        ocupacaoDAO.ocuparVaga(ocupacao);
    }

    public void ocuparVagaMensalista(Cliente cliente, int numBloco, int numVaga)
    {
        ocuparVagaComum(cliente.getVeiculo(), numBloco, numVaga);
    }

    public double desocuparVagaComum(String placa)
    {
        OcupaVagaDAO ocupacaoDAO = OcupaVagaDAO.getInstance();

        OcupaVaga ocupacao = ocupacaoDAO.pesquisarVagaPorPlaca(placa);

        ocupacaoDAO.desocuparVaga(ocupacao);

        ocupacao.setDataSaida(Calendar.getInstance());

        return ocupacao.calcularPagamento();
    }
    
    public double desocuparVagaMensalista(Cliente cliente)
    {
        return desocuparVagaComum(cliente.getVeiculo().getPlaca());
    }


}
