/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.bo.IFuncionario;
import estacionamento.model.bo.Veiculo;
import estacionamento.view.IOcuparVagaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author flavio
 */
public class OcuparVagaController implements ActionListener {
    
    private IFuncionario funcionario;
    private IOcuparVagaView view;
    
    public OcuparVagaController(IFuncionario funcionario, IOcuparVagaView view)
    {
        this.funcionario = funcionario;
        this.view = view;
        this.view.addOuvinteOk(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Veiculo veiculo = new Veiculo(view.getModelo(), view.getPlaca(), view.getCor());
        
        //TODO utilizar o número do bloco e da vaga
        funcionario.ocuparVagaComum(veiculo, 0, 0);
    }
    
}
