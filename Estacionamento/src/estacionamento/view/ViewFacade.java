/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view;

import estacionamento.view.gui.CaixaView;
import estacionamento.view.gui.LiberarVagaMensalistaView;
import estacionamento.view.gui.LiberarVagaView;
import estacionamento.view.gui.MainView;
import estacionamento.view.gui.OcuparVagaMensalistaView;
import estacionamento.view.gui.OcuparVagaView;

/**
 *
 * @author flavio
 */
public class ViewFacade {
    
    public static IMainView getMainView()
    {
        return new MainView();
    }
    
    public static ICaixaView getCaixaView()
    {
        return new CaixaView();
    }
    
    public static ILiberarVagaMensalistaView getLiberarVagaMensalistaView()
    {
        return new LiberarVagaMensalistaView();
    }
    
    public static ILiberarVagaView getLiberarVagaView()
    {
        return new LiberarVagaView();
    }
    
    public static IOcuparVagaView getOcuparVagaView()
    {
        return new OcuparVagaView();
    }
    
    public static IOcuparVagaMensalistaView getOcuparVagaMensalistaView()
    {
        return new OcuparVagaMensalistaView();
    }

}
