/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IConfirmarPagamentoComumView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author flavio
 */
public class ConfirmarPagamentoComumView extends BaseView implements IConfirmarPagamentoComumView {
    
    private final JLabel tipoCliente = new JLabel("Tipo de cliente: comum");
    private final JLabel valorAPagar = new JLabel("");
    private final JButton confirmar = new JButton("OK");
    
    public ConfirmarPagamentoComumView()
    {
        super();
        this.setTitle("Confirmar Pagamento");
        
        panelPrincipal.add(tipoCliente);
        panelPrincipal.add(valorAPagar);
        panelPrincipal.add(confirmar);
    }
    
    @Override
    public void setValorAPagar(String valor) {
        valorAPagar.setText("Valor total a pagar: " + valor);
    }

    @Override
    public void addOuvinteConfirmar(ActionListener ouvinte) {
        confirmar.addActionListener(ouvinte);
    }
    
}
