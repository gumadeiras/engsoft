/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.vo;

/**
 *
 * @author Gustavo Madeira Santana e Flávio Keglevich
 */
public class Estacionamento {
    
    public static final int NUM_VAGAS = 396;
    
    private int numBlocos;
    private int numVagas;
    
    private Estacionamento(int numBlocos, int numVagas) {
        this.numBlocos = numBlocos;
        this.numVagas = numVagas;
    }

    public int getNumBlocos() {
        return numBlocos;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumBlocos(int numBlocos) {
        this.numBlocos = numBlocos;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }
}
