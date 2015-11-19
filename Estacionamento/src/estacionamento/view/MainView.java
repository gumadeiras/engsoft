/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author flavio
 */
public class MainView extends JFrame {
    
    private JPanel mainPanel;
    private CardLayout layout;
    
    public MainView()
    {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        layout = new CardLayout();
        
        //setLayout(layout);
        
        mainPanel = new JPanel(layout);
        add(mainPanel);
        setVisible(true);
        //mainPanel.setVisible(true);
    }
    
    public void swapPanel(String name)
    {
        layout.show(mainPanel, name);
    }
    
    public void addPanel(JPanel panel, String name)
    {
        mainPanel.add(panel, name);
        //mainPanel.add(panel);
    }
}
