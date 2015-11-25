/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.ModelFacade;
import estacionamento.view.ICaixaView;
import estacionamento.view.ILiberarVagaMensalistaView;
import estacionamento.view.IMainView;

/**
 *
 * @author flavio
 */
public class LiberarVagaMensalistaActionListener extends ListenerBase {

    private ILiberarVagaMensalistaView view;
    
    public LiberarVagaMensalistaActionListener(ILiberarVagaMensalistaView view, IMainView mainView, ICaixaView caixaView) {
        super(mainView, caixaView);
        this.view = view;
        caixaView.addOuvinteDesocuparVagaMensalista(this);
    }
    
    @Override
    protected void enterView() {
        mainView.swapPanel(view);
    }

    @Override
    protected void exitView() {
        ModelFacade.descuparVagaMensalista(view.getCpf());
        mainView.swapPanel(caixaView);
    }
    
}
