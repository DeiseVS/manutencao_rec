package SimulacaoDeMemoria;

import java.math.BigDecimal;

import Agencia.Fabricante;
import Agencia.GerenciadorModelo;
import Agencia.Modelo;

public class GerenciadorModeloEmMemoria implements GerenciadorModelo {
	private static GerenciadorModeloEmMemoria instance = null;
	
	private GerenciadorModeloEmMemoria(){
		
	}
	
	public static GerenciadorModeloEmMemoria getInstance(){
		if (GerenciadorModeloEmMemoria.instance == null)
			GerenciadorModeloEmMemoria.instance = new GerenciadorModeloEmMemoria();
		return GerenciadorModeloEmMemoria.instance;
	}

	@Override
	public Modelo criarModelo(long id, Fabricante fabricante, String nome, String descricao, int ano, BigDecimal precodiaria) {
		return new Modelo(id, fabricante, nome, descricao, ano, precodiaria);
	}

	@Override
	public Modelo buscarModeloPorId(long id) {
		return BdEmMemoria.getInstance().tabelaModelos().get(id);
	}

	@Override
	public Modelo buscarModeloPorNome(String nome) {
		for (Modelo m : BdEmMemoria.getInstance().tabelaModelos().values()){
    		if (m.getNome().equalsIgnoreCase(nome))
    			return m;
		}
		return null;
		
	}

	@Override
	public void insert(Modelo m) {
		if (BdEmMemoria.getInstance().tabelaModelos().containsKey(m.getId()))
			throw new RuntimeException("modelo ja inserido");
		else
		   BdEmMemoria.getInstance().tabelaModelos().put(m.getId(), m);
	}

	@Override
	public void remove(Modelo m) {
		BdEmMemoria.getInstance().tabelaModelos().remove(m.getId());	
	}
		
}
