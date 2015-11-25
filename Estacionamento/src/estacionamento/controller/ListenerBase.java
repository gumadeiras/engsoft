/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.view.ICaixaView;
import estacionamento.view.IMainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author flavio
 */
public abstract class ListenerBase implements ActionListener {
    
    protected IMainView mainView;
    protected ICaixaView caixaView;
    
    private boolean entered = false;
    
    public ListenerBase(IMainView mainView, ICaixaView caixaView)
    {
        this.mainView = mainView;
        this.caixaView = caixaView;
    }
    
    protected abstract void enterView();
    
    protected abstract void exitView();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (entered)
        {
            exitView();
            entered = false;
        }
        else
        {
            enterView();
            entered = true;
        }
    }
}
