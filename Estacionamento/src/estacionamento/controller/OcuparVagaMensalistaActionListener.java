/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.ModelFacade;
import estacionamento.view.ICaixaView;
import estacionamento.view.IMainView;
import estacionamento.view.IOcuparVagaMensalistaView;

/**
 *
 * @author flavio
 */
public class OcuparVagaMensalistaActionListener extends ListenerBase {
    
    private IOcuparVagaMensalistaView view;
    
    public OcuparVagaMensalistaActionListener(IOcuparVagaMensalistaView view, IMainView mainView, ICaixaView caixaView) {
        super(mainView, caixaView);
        this.view = view;
        caixaView.addOuvinteOcuparVagaMensalista(this);
    }

    @Override
    protected void enterView() {
        mainView.swapPanel(view);
    }

    @Override
    protected void exitView() {
        ModelFacade.ocuparVagaMensalista(view.getCpf());
        mainView.swapPanel(caixaView);
    }
    
}
