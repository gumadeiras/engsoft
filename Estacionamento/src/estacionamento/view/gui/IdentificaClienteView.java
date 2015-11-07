/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IIdentificaClienteView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author flavio
 */
public class IdentificaClienteView extends BaseView implements IIdentificaClienteView {

    private final JLabel cpfLabel = new JLabel("Identificação (CPF) do Cliente:");
    private final JTextField cpfField = new JTextField(14);
    private final JButton ok = new JButton("OK");
    
    public IdentificaClienteView()
    {
        super();
        this.setTitle("Identificação do Cliente");
        
        panelPrincipal.add(cpfLabel);
        panelPrincipal.add(cpfField);
        panelPrincipal.add(ok);
    }
    
    @Override
    public String getCPF() {
        return cpfField.getText();
    }

    @Override
    public void addOuvinteOk(ActionListener ouvinte) {
        ok.addActionListener(ouvinte);
    }
    
    
}
