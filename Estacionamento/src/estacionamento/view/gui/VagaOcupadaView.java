/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IVagaOcupadaView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author flavio
 */
public class VagaOcupadaView extends BaseView implements IVagaOcupadaView {

    private final JLabel texto = new JLabel("Vaga ocupada com sucesso!");
    private final JButton ok = new JButton("OK");
    
    public VagaOcupadaView()
    {
        super();
        this.setTitle("Sucesso");
        
        panelPrincipal.add(texto);
        panelPrincipal.add(ok);
    }
    
    @Override
    public void addOuvinteOk(ActionListener ouvinte) {
        ok.addActionListener(ouvinte);
    }
    
}
