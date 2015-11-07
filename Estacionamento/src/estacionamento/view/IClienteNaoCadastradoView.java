/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view;

import java.awt.event.ActionListener;

/**
 *
 * @author flavio
 */
public interface IClienteNaoCadastradoView extends IBaseView {
    
    void addOuvinteCancelar(ActionListener ouvinte);
    
    void addOuvinteTentarNovamente(ActionListener ouvinte);
}
