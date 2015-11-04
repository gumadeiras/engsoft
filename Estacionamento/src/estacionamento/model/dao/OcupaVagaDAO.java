/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.dao;

import estacionamento.model.vo.OcupaVaga;
import estacionamento.model.vo.Veiculo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author flavio
 */
public class OcupaVagaDAO {
    
    private static final List<OcupaVaga> vagas = new LinkedList<>();
    
    public static void ocuparVaga(OcupaVaga ocupa)
    {
        vagas.add(ocupa);
    }
    
    public static OcupaVaga pesquisarVaga(Veiculo veiculo)
    {
        for (OcupaVaga ocupa : vagas)
        {
            if (ocupa.getVeiculo() == veiculo)
            {
                return ocupa;
            }
        }
        return null;
    }
    
    public static void desocuparVaga(OcupaVaga ocupa)
    {
        vagas.remove(ocupa);
    }
}
