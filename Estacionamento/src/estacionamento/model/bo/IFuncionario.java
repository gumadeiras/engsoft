/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

/**
 *
 * @author flavio
 */
public interface IFuncionario {
    
    public void ocuparVagaComum(Veiculo veiculo, int numBloco, int numVaga);
    
    public void ocuparVagaMensalista(Cliente cliente , int numBloco, int numVaga);
    
    public double desocuparVagaComum(Veiculo veiculo);
    
    public double desocuparVagaMensalista(Cliente cliente);
}
