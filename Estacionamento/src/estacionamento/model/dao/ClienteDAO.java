/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.dao;

import estacionamento.model.bo.Cliente;
import estacionamento.model.bo.Genero;
import estacionamento.model.bo.PlanoCliente;
import estacionamento.model.bo.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author gustavo
 */
public class ClienteDAO {
    
    private static List<Cliente> clientes = new LinkedList<>();
    
    private static ClienteDAO instance;
    
    public static ClienteDAO getInstance()
    {
        if (instance == null)
            instance = new ClienteDAO();
        
        return instance;
    }

    private static void popularClientes()
    {
        clientes.add(new Cliente ("Flavio Keglevich", "123456789123", parseCalendar("5/03/1999"), Genero.MASCULINO, 93018237, parseCalendar("21/03/2015"), PlanoCliente.CONVENCIONAL, new Veiculo("Fusca", "ABC-1234", "Gelo")));
        clientes.add(new Cliente ("Gustavo Santana", "123456788123", parseCalendar("11/10/2000"), Genero.MASCULINO, 42317948, parseCalendar("20/10/2015"), PlanoCliente.CONVENCIONAL, new Veiculo("Fusca", "ABC-1235", "Azul")));
        clientes.add(new Cliente ("Laurien Santin", "123456787123", parseCalendar("10/05/1998"), Genero.FEMININO, 39104928, parseCalendar("19/05/2015"), PlanoCliente.CONVENCIONAL, new Veiculo("Fusca", "ABC-1236", "Rosa")));
        clientes.add(new Cliente ("William Berrutti", "123456786123", parseCalendar("10/11/1997"), Genero.MASCULINO, 72391042, parseCalendar("13/11/2015"), PlanoCliente.CONVENCIONAL, new Veiculo("Fusca", "ABC-1237", "Preto")));     
    }

    private static Calendar parseCalendar(String valor) 
    {
        Calendar resultado = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try
        {
            resultado.setTime(sdf.parse(valor));
        }
        catch (ParseException exception)
        {  }

        return resultado;
    }
    
    private ClienteDAO()
    {
        
    }
    
    public Cliente identificarCliente(String cpf)
    {
        if (clientes.isEmpty())
        {
            popularClientes();
        }
        
        for (Cliente cliente : clientes)
        {
            if (Objects.equals(cliente.getCpf(), cpf))
                return cliente;
        }
        
        return null;
    }
}