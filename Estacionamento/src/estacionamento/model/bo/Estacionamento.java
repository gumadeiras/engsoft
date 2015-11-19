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
public class Estacionamento {
    
    public static final int NUM_VAGAS = 396;
    public static final int NUM_BLOCOS = 11;
    public static final double VALOR_POR_HORA = 1.0;
    
    private static Estacionamento instance;
    
    public static Estacionamento getInstance()
    {
        if (instance == null)
            instance = new Estacionamento(NUM_BLOCOS, NUM_VAGAS, VALOR_POR_HORA);
        
        return instance;
    }
    
    private int totalBlocos;
    private int totalVagas;
    private int vagasDisponiveis;
    private double valorPorHora;
    
    private Estacionamento(int numBlocos, int numVagas, double valorPorHora) {
        this.totalBlocos = numBlocos;
        this.totalVagas = numVagas;
        this.valorPorHora = valorPorHora;
    }

    public int getNumBlocos() {
        return totalBlocos;
    }

    public int getNumVagas() {
        return totalVagas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }
    
    public double getValorPorHora() {
        return valorPorHora;
    }
    
    public void setNumBlocos(int numBlocos) {
        this.totalBlocos = numBlocos;
    }

    public void setNumVagas(int numVagas) {
        this.totalVagas = numVagas;
    }
    
    public void setVagasDisponiveis(int numVagasDisponiveis) {
        this.vagasDisponiveis = numVagasDisponiveis;
    }
    
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    public double calcularPagamento(Calendar dataEntrada, Calendar dataSaida)
    {
        double difMilis = (double)(dataSaida.getTimeInMillis() - dataEntrada.getTimeInMillis());
        
        double difHoras = ((difMilis / (1000*60*60)) % 24);
        
        double pagamento = getValorPorHora() * difHoras;
        
        return pagamento;
    }
}
