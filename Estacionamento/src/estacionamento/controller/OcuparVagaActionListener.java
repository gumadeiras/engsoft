/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.ModelFacade;
import estacionamento.view.ICaixaView;
import estacionamento.view.IMainView;
import estacionamento.view.IOcuparVagaView;

/**
 *
 * @author flavio
 */
public class OcuparVagaActionListener extends ListenerBase {

    private IOcuparVagaView view;
    
    public OcuparVagaActionListener(IOcuparVagaView view, IMainView mainView, ICaixaView caixaView)
    {
        super(mainView, caixaView);
        this.view = view;
        caixaView.addOuvinteOcuparVaga(this);
    }

    @Override
    protected void enterView() {
        mainView.swapPanel(view);
    }

    @Override
    protected void exitView() {
        ModelFacade.ocuparVaga(view.getModelo(), view.getPlaca(), view.getCor());
        mainView.swapPanel(caixaView);
    }
    
}
