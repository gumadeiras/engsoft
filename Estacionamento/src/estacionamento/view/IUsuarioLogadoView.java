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
public interface IUsuarioLogadoView extends IBaseView {
    
    void setVagasDisponiveis(String valor);
    
    void addOuvinteAdicionarVeiculo(ActionListener ouvinte);
    
    void addOuvinteRemoverVeiculo(ActionListener ouvinte);

}
