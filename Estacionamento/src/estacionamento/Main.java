/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import estacionamento.model.bo.Funcionario;
import estacionamento.model.bo.Genero;
import estacionamento.model.bo.Veiculo;
import estacionamento.model.bo.funcionarios.CaixaBehavior;
import estacionamento.view.gui.MainView;
import estacionamento.view.gui.CaixaView;
import estacionamento.view.gui.OcuparVagaView;
import estacionamento.view.gui.OcuparVagaView;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Flávio Keglevich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainView view = new MainView(); 
        view.addPanel(new OcuparVagaView());
        view.addPanel(new OcuparVagaView());
        view.addPanel(new CaixaView());
        
        //System.out.println(view.getClass().getName());
        
        view.swapPanel(new OcuparVagaView());
        
        MainView view2 = new MainView(); 
        view2.addPanel(new OcuparVagaView());
        view2.addPanel(new OcuparVagaView());
        view2.addPanel(new CaixaView());
        
        //System.out.println(view.getClass().getName());
        
        view2.swapPanel(new OcuparVagaView());
        //view.mainPanel.add(new CaixaView());
    }
}
