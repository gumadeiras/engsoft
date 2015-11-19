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
public interface IOcuparVagaView {
    
    String getPlaca();
    
    String getCor();
    
    String getModelo();
    
    void addOuvinteOk(ActionListener ouvinte);
    
}
