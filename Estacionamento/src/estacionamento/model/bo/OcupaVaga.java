/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

import java.util.Calendar;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class OcupaVaga {

    private Calendar dataEntrada;
    private Calendar dataSaida;
    private Veiculo veiculo;
    private int numBloco;
    private int numVaga;

    public OcupaVaga(Calendar dataEntrada, Calendar dataSaida, Veiculo veiculo, int numBloco, int numVaga) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.veiculo = veiculo;
        this.numBloco = numBloco;
        this.numVaga = numVaga;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public int getNumVaga()
    {
        return this.numVaga;
    }

    public int getNumBloco()
    {
        return this.numBloco;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setNumVaga(int numVaga)
    {
        this.numVaga = numVaga;
    }

    public void setNumBloco(int numBloco)
    {
        this.numBloco = numBloco;
    }

    public double calcularPagamento()
    {
        return Estacionamento.getInstance().calcularPagamento(dataEntrada, dataSaida);
    }
}
