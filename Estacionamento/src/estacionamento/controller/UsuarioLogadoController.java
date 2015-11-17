/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.bo.Estacionamento;
import estacionamento.view.IUsuarioLogadoView;
import estacionamento.view.ViewFacade;

/**
 *
 * @author flavio
 */
public class UsuarioLogadoController extends ControllerBase {
    
    public UsuarioLogadoController()
    {
        super(ViewFacade.getUsuarioLogadoView(), null);
        
        actionPerformed(null);
    }

    @Override
    protected void initialize() 
    {
        IUsuarioLogadoView view = (IUsuarioLogadoView)viewNova;
        
        view.setVagasDisponiveis(String.valueOf(Estacionamento.NUM_VAGAS));
        
        view.addOuvinteAdicionarVeiculo(new AdicionarVeiculoController(ViewFacade.getIdentificaClienteView(), viewNova));
        view.addOuvinteRemoverVeiculo(new RemoverVeiculoController(ViewFacade.getIdentificaClienteView(), viewNova));
    }
}
