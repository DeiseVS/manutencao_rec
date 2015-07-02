package Agencia;

import java.math.BigDecimal;
import java.util.Calendar;

public interface GerenciadorAluguel {
	public abstract Aluguel criarAluguel(long id, Cliente cliente, Veiculo veiculo, Calendar datainicio, Calendar datafim, BigDecimal presodiarias);
	public abstract Aluguel buscarAluguelPorId(long id);	
	public abstract Aluguel buscarAluguelPorNomedoCliente(String nome);
	public abstract Aluguel buscarAluguelPorPlacadoVeiculo (Caracter[] placa);
	public abstract void insert (Aluguel a);
	public abstract void remove (Aluguel a);	

}
