/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IUsuarioLogadoView;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author flavio
 */
public class UsuarioLogadoView extends BaseView implements IUsuarioLogadoView {

    private final JLabel vagasDisponiveis = new JLabel("");
    private final JButton adicionarVeiculo = new JButton("Adicionar Veiculo");
    private final JButton removerVeiculo = new JButton("Remover Veiculo");
    
    public UsuarioLogadoView()
    {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Estacionamento");
        
        panelPrincipal.add(vagasDisponiveis);
        panelPrincipal.add(adicionarVeiculo);
        panelPrincipal.add(removerVeiculo);
    }
    
    @Override
    public void setVagasDisponiveis(String valor) {
        vagasDisponiveis.setText("Há " + valor + " vagas disponíveis.");
    }

    @Override
    public void addOuvinteAdicionarVeiculo(ActionListener ouvinte) {
        adicionarVeiculo.addActionListener(ouvinte);
    }

    @Override
    public void addOuvinteRemoverVeiculo(ActionListener ouvinte) {
        removerVeiculo.addActionListener(ouvinte);
    }
    
}
