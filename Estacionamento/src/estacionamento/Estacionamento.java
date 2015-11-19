/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import estacionamento.view.gui.CaixaView;
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
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        /*JPanel panel = new JPanel();
        
        panel.add(new JLabel("A didi ua"));
        panel.add(new JButton("OK"));
        
        frame.add(panel);
        panel.setVisible(true);
        
        JPanel panel2 = new JPanel();
        
        panel2.add(new JLabel("A didi upsy"));
        panel2.add(new JButton("DYLLYH"));
        //frame.add(panel2);
        panel2.setVisible(false);*/
        
        CaixaView view = new CaixaView();
        
        frame.add(view);
        
        frame.setVisible(true);
        
        System.out.print(Calendar.getInstance());
        
        //UsuarioLogadoController controller = new UsuarioLogadoController();
    }
}
