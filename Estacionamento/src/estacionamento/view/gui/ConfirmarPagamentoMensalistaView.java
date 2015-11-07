/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IConfirmarPagamentoMensalistaView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author flavio
 */
public class ConfirmarPagamentoMensalistaView extends BaseView implements IConfirmarPagamentoMensalistaView {

    private final JLabel tipoCliente = new JLabel("Tipo de cliente: mensalista");
    private final JButton ok = new JButton("OK");
    
    public ConfirmarPagamentoMensalistaView()
    {
        super();
        this.setTitle("Confirmar Pagamento");
        
        panelPrincipal.add(tipoCliente);
        panelPrincipal.add(ok);
    }
    
    @Override
    public void addOuvinteOk(ActionListener ouvinte) {
        ok.addActionListener(ouvinte);
    }
    
}
