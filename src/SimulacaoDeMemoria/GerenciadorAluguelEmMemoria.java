package SimulacaoDeMemoria;

import java.math.BigDecimal;
import java.util.Calendar;
import Agencia.Aluguel;
import Agencia.Caracter;
import Agencia.Cliente;
import Agencia.GerenciadorAluguel;
import Agencia.Veiculo;

public class GerenciadorAluguelEmMemoria implements GerenciadorAluguel {
	private static GerenciadorAluguelEmMemoria instance = null;
	
	private GerenciadorAluguelEmMemoria(){
		
	}
	
	public static GerenciadorAluguelEmMemoria getInstance(){
		if (GerenciadorAluguelEmMemoria.instance == null)
			GerenciadorAluguelEmMemoria.instance = new GerenciadorAluguelEmMemoria();
		return GerenciadorAluguelEmMemoria.instance;
	}

	@Override
	public Aluguel criarAluguel(long id, Cliente cliente, Veiculo veiculo,
			Calendar datainicio, Calendar datafim, BigDecimal presodiarias) {
		return new Aluguel (id, cliente, veiculo, datainicio, datafim, presodiarias);
	}

	@Override
	public Aluguel buscarAluguelPorId(long id) {
		return BdEmMemoria.getInstance().tabelaAluguel().get(id);
	}

	@Override
	public Aluguel buscarAluguelPorNomedoCliente(String nome) {
		for (Aluguel a : BdEmMemoria.getInstance().tabelaAluguel().values()){
    		if (a.getCliente().getNome().equalsIgnoreCase(nome))
    			return a;
		}
		return null;
		
	}
	
	@Override
	public Aluguel buscarAluguelPorPlacadoVeiculo(Caracter[] placa) {
		for (Aluguel a : BdEmMemoria.getInstance().tabelaAluguel().values()){
    		if (a.getVeiculo().comparaPlaca(placa))
    			return a;
		}
		return null;
	}

	@Override
	public void insert(Aluguel a) {
		if (BdEmMemoria.getInstance().tabelaAluguel().containsKey(a.getId()))
			throw new RuntimeException("aluguel ja inserido");
		else 
			BdEmMemoria.getInstance().tabelaAluguel().put(a.getId(), a);
	}

	@Override
	public void remove(Aluguel a) {
		BdEmMemoria.getInstance().tabelaAluguel().remove(a.getId());
		
	}

}
