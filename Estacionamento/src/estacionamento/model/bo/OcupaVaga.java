/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import estacionamento.model.bo.Cliente;
import estacionamento.model.bo.Veiculo;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class OcupaVaga {
    
    private Calendar dataEntrada;
    private Calendar dataSaida;
    //private float valorHora;
    private Veiculo veiculo;
    private Cliente cliente; //não precisa mais

    public OcupaVaga(Calendar dataEntrada, Calendar dataSaida, float valorHora, Veiculo veiculo, Cliente cliente) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valorHora = valorHora;
        this.veiculo = veiculo;
        this.cliente = cliente;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public float getValorHora() {
        return valorHora;
    }
    
    public Veiculo getVeiculo() {
        return this.veiculo;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    public float getSubTotal() {
        
        long diferenca = dataSaida.getTimeInMillis() - dataEntrada.getTimeInMillis();
        int diferencaEmHoras = (int)TimeUnit.MILLISECONDS.toHours(diferenca);
        
        return valorHora * diferencaEmHoras;
    }
}
