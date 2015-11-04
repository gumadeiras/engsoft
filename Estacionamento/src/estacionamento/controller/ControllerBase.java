/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.view.IBaseView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author flavio
 */
public abstract class ControllerBase implements ActionListener {
    
    protected IBaseView viewNova;
    protected IBaseView viewAntiga;
    
    public ControllerBase(IBaseView viewNova, IBaseView viewAntiga)
    {
        this.viewNova = viewNova;
        this.viewAntiga = viewAntiga;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (viewAntiga != null) viewAntiga.esconder();
        initialize();
        if (viewNova != null) viewNova.mostrar();
    }
    
    abstract protected void initialize();
}
