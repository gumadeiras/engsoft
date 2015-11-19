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
import estacionamento.view.MainView;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Estacionamento");
        
        Funcionario funcionario = new Funcionario("Gustavo", 123456780, Calendar.getInstance(),  Genero.MASCULINO, 12345678, Calendar.getInstance(), new CaixaBehavior());
        
        Veiculo veiculo = new Veiculo("Fusca", "ABC-1234", "Rosa");
        
        System.out.println("Veiculo cor:" + veiculo.getCor() + ", placa:" + veiculo.getPlaca() + ", modelo:" + veiculo.getModelo());
        
        System.out.println("Estacionando o veículo:");
        funcionario.ocuparVagaComum(veiculo, 0, 0);
        
        System.out.println("Veículo estacionado com sucesso!");
        System.out.println("Retirando o veículo:");
        
        
        funcionario.desocuparVagaComum(veiculo);
        System.out.println("Veículo removido com sucesso!");
    }
}
