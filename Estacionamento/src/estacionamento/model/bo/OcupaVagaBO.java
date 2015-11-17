/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.dao.OcupaVagaDAO;
import java.util.Calendar;

/**
 *
 * @author flavio
 */
public class OcupaVagaBO {
    
    public OcupaVagaBO()
    {
        
    }
    
    public void ocuparVaga(Cliente cliente, Veiculo veiculo, float valorHora)
    {
        OcupaVaga ocupa = new OcupaVaga(Calendar.getInstance(), null, valorHora, veiculo, cliente);
        OcupaVagaDAO.ocuparVaga(ocupa);
    }
    
    public float desocuparVaga(Veiculo veiculo)
    {
        OcupaVaga ocupa = OcupaVagaDAO.pesquisarVaga(veiculo);
        
        OcupaVagaDAO.desocuparVaga(ocupa);
        
        return ocupa.getSubTotal();
    }
}
