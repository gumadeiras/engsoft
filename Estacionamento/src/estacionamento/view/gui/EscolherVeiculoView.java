/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view.gui;

import estacionamento.view.IEscolherVeiculoView;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author flavio
 */
public class EscolherVeiculoView extends BaseView implements IEscolherVeiculoView {
    
    private final JLabel texto = new JLabel("Escolher veículo cadastrado:");
    private final JComboBox veiculo = new JComboBox();
    private final JButton cadastrarVeiculoNovo = new JButton("Cadastrar Novo Veículo");
    private final JButton ok = new JButton("OK");
    
    public EscolherVeiculoView()
    {
        super();
        this.setTitle("Escolher veículo");
        
        panelPrincipal.add(texto);
        panelPrincipal.add(veiculo);
        panelPrincipal.add(cadastrarVeiculoNovo);
        panelPrincipal.add(ok);
    }
    
    @Override
    public void addOuvinteOk(ActionListener ouvinte) {
        ok.addActionListener(ouvinte);
    }
    
    @Override
    public void addOpcaoVeiculo(String opcao) {
        veiculo.addItem(opcao);
    }

    @Override
    public void addOuvinteCadastrarVeiculoNovo(ActionListener ouvinte) {
        cadastrarVeiculoNovo.addActionListener(ouvinte);
    }

    @Override
    public String getVeiculoSelecionado() 
    {
        return (String)veiculo.getSelectedItem();
    }
    
}
