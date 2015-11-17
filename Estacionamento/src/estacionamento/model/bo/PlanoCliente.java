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

public class PlanoCliente  {
    
    public static final PlanoCliente PREMIUM = new PlanoCliente(35.00);
    public static final PlanoCliente TOP = new PlanoCliente(25.00);
    public static final PlanoCliente CONVENCIONAL = new PlanoCliente(10.00);
    
    private double preco;
    
    private PlanoCliente(double preco)
    {
        this.preco = preco;
    }
    
    public double getPreco()
    {
        return this.preco;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}