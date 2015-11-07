/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.model.dao;

import estacionamento.model.vo.Cliente;
import estacionamento.model.vo.Pessoa;
import estacionamento.model.vo.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class ClienteDAO {
    
    private static final List<Cliente> clientes = new LinkedList<>();
    
    private static void popularClientes()
    {
        clientes.add(new Cliente ("Flavio", "Keglevich", 123456789, parseCalendar("5/03/1999"), Pessoa.Genero.MASCULINO, 001, 93018237, parseCalendar("21/03/2015"), Cliente.Categoria.COMUM));
        clientes.add(new Cliente ("Gustavo", "Santana", 123456788, parseCalendar("11/10/2000"), Pessoa.Genero.MASCULINO, 002, 42317948, parseCalendar("20/10/2015"), Cliente.Categoria.COMUM));
        clientes.add(new Cliente ("Laurien", "Santin", 123456787, parseCalendar("10/05/1998"), Pessoa.Genero.FEMININO, 003, 39104928, parseCalendar("19/05/2015"), Cliente.Categoria.MENSALISTA));
        clientes.add(new Cliente ("William", "Berrutti", 123456786, parseCalendar("10/11/1997"), Pessoa.Genero.MASCULINO, 004, 72391042, parseCalendar("13/11/2015"), Cliente.Categoria.COMUM));
        clientes.get(0).cadastrarVeiculo(new Veiculo("a","b","c"));
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
    
    public static Cliente identificarCliente(long cpf)
    {
        if (clientes.isEmpty())
        {
            popularClientes();
        }
        
        for (Cliente cliente : clientes)
        {
            if (cliente.getCpf() == cpf)
                return cliente;
        }
        
        return null;
    }
}
