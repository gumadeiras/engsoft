/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.ModelFacade;
import estacionamento.view.ICaixaView;
import estacionamento.view.ILiberarVagaView;
import estacionamento.view.IMainView;

/**
 *
 * @author flavio
 */
public class LiberarVagaActionListener extends ListenerBase {

    private ILiberarVagaView view;
    
    public LiberarVagaActionListener(ILiberarVagaView view, IMainView mainView, ICaixaView caixaView) {
        super(mainView, caixaView);
        this.view = view;
        caixaView.addOuvinteDesocuparVaga(this);
    }
    
    @Override
    protected void enterView() {
        mainView.swapPanel(view);
    }

    @Override
    protected void exitView() {
        ModelFacade.descuparVaga(view.getPlaca());
        mainView.swapPanel(caixaView);
    }
    
}
