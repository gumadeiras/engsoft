/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view;

import estacionamento.view.gui.*;

/**
 *
 * @author flavio
 */
public class ViewFacade {
    
    public static ICadastrarVeiculoView getCadastrarVeiculoView()
    {
        return new CadastrarVeiculoView();
    }
    
    public static IClienteNaoCadastradoView getClienteNaoCadastradoView()
    {
        return new ClienteNaoCadastradoView();
    }
    
    public static IConfirmarPagamentoComumView getConfirmarPagamentoComumView()
    {
        return new ConfirmarPagamentoComumView();
    }
    
    public static IConfirmarPagamentoMensalistaView getConfirmarPagamentoMensalistaView()
    {
        return new ConfirmarPagamentoMensalistaView();
    }
    
    public static IEscolherVeiculoView getEscolherVeiculoView()
    {
        return new EscolherVeiculoView();
    }
    
    public static IIdentificaClienteView getIdentificaClienteView()
    {
        return new IdentificaClienteView();
    }
    
    public static IUsuarioLogadoView getUsuarioLogadoView()
    {
        return new UsuarioLogadoView();
    }
    
    public static IVagaDisponivelView getVagaDisponivelView()
    {
        return new VagaDisponivelView();
    }
    
    public static IVagaOcupadaView getVagaOcupadaView()
    {
        return new VagaOcupadaView();
    }
}
