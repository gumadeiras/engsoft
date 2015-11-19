/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.dao;

import estacionamento.model.bo.OcupaVaga;
import estacionamento.model.bo.Veiculo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author flavio
 */
public class OcupaVagaDAO {
    
    private static OcupaVagaDAO instance;
    
    public static OcupaVagaDAO getInstance()
    {
        if (instance == null)
            instance = new OcupaVagaDAO();
        
        return instance;
    }
    
    private final List<OcupaVaga> vagas = new LinkedList<>();
    
    private OcupaVagaDAO()
    {
        
    }
    
    public void ocuparVaga(OcupaVaga ocupa)
    {
        vagas.add(ocupa);
    }
    
    public OcupaVaga pesquisarVaga(Veiculo veiculo)
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
    
    public void desocuparVaga(OcupaVaga ocupa)
    {
        vagas.remove(ocupa);
    }
}
