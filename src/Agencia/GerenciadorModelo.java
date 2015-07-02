package Agencia;

import java.math.BigDecimal;

public interface GerenciadorModelo {
	
	public abstract Modelo criarModelo( long id, Fabricante fabricante, String nome, String descricao, int ano, BigDecimal precodiaria);
	public abstract Modelo buscarModeloPorId(long id);	
	public abstract Modelo buscarModeloPorNome(String nome);
	public abstract void insert (Modelo m);
	public abstract void remove (Modelo m);	
}
