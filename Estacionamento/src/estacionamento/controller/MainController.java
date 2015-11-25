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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author flavio
 */
public class MainController implements ActionListener {
    
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
        view.addPanel(liberarVagaMensalistaView = ViewFacade.getLiberarVagaMensalistaView());
        view.addPanel(liberarVagaView = ViewFacade.getLiberarVagaView());
        view.addPanel(ocuparVagaMensalistaView = ViewFacade.getOcuparVagaMensalistaView());
        view.addPanel(ocuparVagaView = ViewFacade.getOcuparVagaView());
        
        liberarVagaMensalistaView.addOuvinteOk(this);
        liberarVagaView.addOuvinteOk(this);
        ocuparVagaMensalistaView.addOuvinteOk(this);
        ocuparVagaView.addOuvinteOk(this);
        
        view.swapPanel(ocuparVagaView);
        
        //caixaView.addOuvinteDesocuparVaga();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.swapPanel(caixaView);
    }
    
}
