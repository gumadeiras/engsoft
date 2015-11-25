/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.view.ICaixaView;
import estacionamento.view.ILiberarVagaMensalistaView;
import estacionamento.view.ILiberarVagaView;
import estacionamento.view.IMainView;
import estacionamento.view.IOcuparVagaMensalistaView;
import estacionamento.view.IOcuparVagaView;
import estacionamento.view.ViewFacade;

/**
 *
 * @author flavio
 */
public class MainController {
    
    private IMainView view;
    
    private ICaixaView caixaView;
    private ILiberarVagaMensalistaView liberarVagaMensalistaView;
    private ILiberarVagaView liberarVagaView;
    private IOcuparVagaMensalistaView ocuparVagaMensalistaView;
    private IOcuparVagaView ocuparVagaView;
    
    public MainController()
    {
        view = ViewFacade.getMainView();

        view.addPanel(caixaView = ViewFacade.getCaixaView());
        
        view.addPanel(ocuparVagaView = ViewFacade.getOcuparVagaView());
        ocuparVagaView.addOuvinteOk(new OcuparVagaActionListener(ocuparVagaView, view, caixaView));
        
        view.addPanel(ocuparVagaMensalistaView = ViewFacade.getOcuparVagaMensalistaView());
        ocuparVagaMensalistaView.addOuvinteOk(new OcuparVagaMensalistaActionListener(ocuparVagaMensalistaView, view, caixaView));
        
        view.addPanel(liberarVagaView = ViewFacade.getLiberarVagaView());
        liberarVagaView.addOuvinteOk(new LiberarVagaActionListener(liberarVagaView, view, caixaView));
        
        view.addPanel(liberarVagaMensalistaView = ViewFacade.getLiberarVagaMensalistaView());
        liberarVagaMensalistaView.addOuvinteOk(new LiberarVagaMensalistaActionListener(liberarVagaMensalistaView, view, caixaView));
    }
}
