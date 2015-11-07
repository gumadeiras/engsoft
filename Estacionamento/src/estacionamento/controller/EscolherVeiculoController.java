/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.bo.CaixaBO;
import estacionamento.model.bo.ClienteNaoCadastradoException;
import estacionamento.model.vo.Cliente;
import estacionamento.model.vo.Veiculo;
import estacionamento.view.IBaseView;
import estacionamento.view.IClienteNaoCadastradoView;
import estacionamento.view.IEscolherVeiculoView;
import estacionamento.view.IIdentificaClienteView;
import estacionamento.view.ViewFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavio
 */
public class EscolherVeiculoController extends ControllerBase {

    private ControllerBase anterior;
    
    public EscolherVeiculoController(IBaseView viewNova, IBaseView viewAntiga, ControllerBase anterior) {
        super(viewNova, viewAntiga);
        this.anterior = anterior;
    }

    @Override
    protected void initialize() 
    {
        IIdentificaClienteView viewAntiga2 = (IIdentificaClienteView)viewAntiga;
        viewNova = ViewFacade.getEscolherVeiculoView();
        IEscolherVeiculoView view = (IEscolherVeiculoView)viewNova;
        CaixaBO caixaBO = new CaixaBO();
        
        try 
        {
            Cliente cliente = caixaBO.identificarCliente(Long.parseLong(viewAntiga2.getCPF()));
            List<Veiculo> veiculosCadastrados = cliente.listarVeiculosCadastrados();
            
            for (Veiculo veiculo : veiculosCadastrados)
            {
                view.addOpcaoVeiculo(veiculo.getPlaca());
            }
            
            view.addOuvinteCadastrarVeiculoNovo(new CadastrarVeiculoController(ViewFacade.getCadastrarVeiculoView(), viewNova, cliente, this));
            view.addOuvinteOk(null);
        }
        catch (ClienteNaoCadastradoException ex) 
        {
            IClienteNaoCadastradoView msg = ViewFacade.getClienteNaoCadastradoView();
            viewNova = msg;
            msg.addOuvinteCancelar(new UsuarioLogadoController());
            msg.addOuvinteTentarNovamente(anterior);
        }
    }
    
}
