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
public interface ICaixaView {
    
    void addOuvinteOcuparVaga(ActionListener ouvinte);
    
    void addOuvinteOcuparVagaMensalista(ActionListener ouvinte);
    
    void addOuvinteDesocuparVaga(ActionListener ouvinte);
    
    void addOuvinteDesocuparVagaMensalista(ActionListener ouvinte);
    
}
