/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IClienteNaoCadastradoView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author flavio
 */
public class ClienteNaoCadastradoView extends BaseView implements IClienteNaoCadastradoView {

    private final JLabel cpfLabel = new JLabel("Cliente não cadastrado!");
    private final JButton cancelar = new JButton("Cancelar Operação");
    private final JButton tentarNovamente = new JButton("Tentar Novamente");
    
    public ClienteNaoCadastradoView()
    {
        super();
        this.setTitle("Erro");
        
        panelPrincipal.add(cpfLabel);
        panelPrincipal.add(cancelar);
        panelPrincipal.add(tentarNovamente);
    }
    
    @Override
    public void addOuvinteCancelar(ActionListener ouvinte) {
        cancelar.addActionListener(ouvinte);
    }

    @Override
    public void addOuvinteTentarNovamente(ActionListener ouvinte) {
        tentarNovamente.addActionListener(ouvinte);
    }
    
}
