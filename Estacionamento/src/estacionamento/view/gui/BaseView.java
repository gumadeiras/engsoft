/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IBaseView;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author flavio
 */
public class BaseView extends JFrame implements IBaseView {

    protected JPanel panelPrincipal = new JPanel();
    
    public BaseView()
    {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(panelPrincipal);
    }
    
    @Override
    public void mostrar() {
        setVisible(true);
    }

    @Override
    public void esconder() {
        setVisible(false);
    }
    
}
