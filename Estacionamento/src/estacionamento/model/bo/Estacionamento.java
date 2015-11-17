/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.bo;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class Estacionamento {
    
    public static final int NUM_VAGAS = 396;
    public static final int NUM_BLOCOS = 11;
    
    private static Estacionamento instance;
    
    public static Estacionamento getInstance()
    {
        if (instance == null)
            instance = new Estacionamento(NUM_BLOCOS, NUM_VAGAS);
        
        return instance;
    }
    
    private int totalBlocos;
    private int totalVagas;
    private int vagasDisponiveis;
    
    private Estacionamento(int numBlocos, int numVagas) {
        this.totalBlocos = numBlocos;
        this.totalVagas = numVagas;
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
    
    public void setNumBlocos(int numBlocos) {
        this.totalBlocos = numBlocos;
    }

    public void setNumVagas(int numVagas) {
        this.totalVagas = numVagas;
    }
    
    public void setVagasDisponiveis(int numVagasDisponiveis) {
        this.vagasDisponiveis = numVagasDisponiveis;
    }
}
