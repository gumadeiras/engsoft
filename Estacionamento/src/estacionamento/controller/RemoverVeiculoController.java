/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.view.IBaseView;
import estacionamento.view.IIdentificaClienteView;
import estacionamento.view.ViewFacade;

/**
 *
 * @author flavio
 */
public class RemoverVeiculoController extends ControllerBase {

    public RemoverVeiculoController(IBaseView viewNova, IBaseView viewAntiga) {
        super(viewNova, viewAntiga);
    }

    @Override
    protected void initialize() 
    {
        IIdentificaClienteView view = (IIdentificaClienteView)viewNova;
        view.addOuvinteOk(new EscolherVeiculoController(ViewFacade.getEscolherVeiculoView(), viewNova, this));
    }
    
}
