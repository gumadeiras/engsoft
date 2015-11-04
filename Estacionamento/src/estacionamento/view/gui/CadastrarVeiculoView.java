/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.ICadastrarVeiculoView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author flavio
 */
public class CadastrarVeiculoView extends BaseView implements ICadastrarVeiculoView {

    private final JLabel placaLabel = new JLabel("Placa:");
    private final JLabel corLabel = new JLabel("Cor:");
    private final JLabel modeloLabel = new JLabel("Modelo:");
    
    private final JTextField placaField = new JTextField(8);
    private final JTextField corField = new JTextField(12);
    private final JTextField modeloField = new JTextField(12);
    
    private final JButton ok = new JButton("OK");
    
    public CadastrarVeiculoView()
    {
        super();
        this.setTitle("Cadastrar Novo Veículo");
        
        panelPrincipal.add(placaLabel);
        panelPrincipal.add(placaField);
        
        panelPrincipal.add(corLabel);
        panelPrincipal.add(corField);
        
        panelPrincipal.add(modeloLabel);
        panelPrincipal.add(modeloField);
        
        panelPrincipal.add(ok);
    }
    
    @Override
    public void addOuvinteOk(ActionListener ouvinte) {
        ok.addActionListener(ouvinte);
    }
    
    @Override
    public String getPlaca() {
        return placaField.getText();
    }

    @Override
    public String getCor() {
        return corField.getText();
    }

    @Override
    public String getModelo() {
        return modeloField.getText();
    }
    
}
