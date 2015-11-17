/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.controller;

import estacionamento.model.bo.CaixaBO;
import estacionamento.model.bo.Cliente;
import estacionamento.view.IBaseView;
import estacionamento.view.ICadastrarVeiculoView;

/**
 *
 * @author flavio
 */
public class CadastrarVeiculoController extends ControllerBase {

    private Cliente cliente;
    private ControllerBase anterior;
    
    public CadastrarVeiculoController(IBaseView viewNova, IBaseView viewAntiga, Cliente cliente, ControllerBase anterior) {
        super(viewNova, viewAntiga);
        this.cliente = cliente;
        this.anterior = anterior;
    }

    @Override
    protected void initialize() 
    {
        ICadastrarVeiculoView view = (ICadastrarVeiculoView)viewNova;
        CaixaBO caixaBO = new CaixaBO();
        System.out.print(view.getPlaca());
        caixaBO.cadastrarNovoVeiculo(cliente, view.getPlaca(), view.getCor(), view.getModelo());
        view.addOuvinteOk(anterior);
    }
    
}
