/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.dao;

import estacionamento.model.vo.Veiculo;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Flávio Keglevich
 */
public class VeiculoDAO {
    
    protected static final List<Veiculo> veiculos = new LinkedList<>();
    
    private static void popularClientes()
    {
        veiculos.add(new Veiculo ("Gol", "RQE5652", "azul"));
        veiculos.add(new Veiculo ("Punto", "FAS2523", "branco"));
        veiculos.add(new Veiculo ("Sonic", "KAD3456", "amarelo"));
        veiculos.add(new Veiculo ("Onix", "DAE2525", "rosa"));
    }   
}
