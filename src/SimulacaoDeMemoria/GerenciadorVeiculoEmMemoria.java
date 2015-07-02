package SimulacaoDeMemoria;

import Agencia.Caracter;
import Agencia.GerenciadorVeiculo;
import Agencia.Modelo;
import Agencia.Veiculo;

public class GerenciadorVeiculoEmMemoria implements GerenciadorVeiculo {
	private static GerenciadorVeiculoEmMemoria instance = null;
	private GerenciadorVeiculoEmMemoria(){	
	}
	
	public static GerenciadorVeiculoEmMemoria getIntance (){
		if (GerenciadorVeiculoEmMemoria.instance == null)
			GerenciadorVeiculoEmMemoria.instance = new GerenciadorVeiculoEmMemoria();
		return GerenciadorVeiculoEmMemoria.instance;
	}

	@Override
	public Veiculo criarVeiculo(long id, Modelo modelo, Caracter[] placa, String renavan, String foto) {
		return new Veiculo (id, modelo, placa, renavan, foto);
	}

	@Override
	public Veiculo buscarVeiculoPorId(long id) {
		return BdEmMemoria.getInstance().tabelaVeiculo().get(id);
	}

	@Override
	public Veiculo buscarVeiculoPorModelo(String modelo) {
		for (Veiculo v : BdEmMemoria.getInstance().tabelaVeiculo().values()){
    		if (v.getModelo().getNome().equalsIgnoreCase(modelo))
    			return v;
    		}
		return null;
	}

	@Override
	public Veiculo buscarVeiculoPorPlaca(Caracter[] placa) {
		for (Veiculo v : BdEmMemoria.getInstance().tabelaVeiculo().values()){
    		if (v.comparaPlaca(placa))
    			return v;
    		}
		return null;
	}

	@Override
	public void insert(Veiculo v) {
		if (BdEmMemoria.getInstance().tabelaVeiculo().containsKey(v.getId()))
			throw new RuntimeException("veiculo ja inserido");
		else
			BdEmMemoria.getInstance().tabelaVeiculo().put(v.getId(), v );
	}

	@Override
	public void remove(Veiculo v) {
		BdEmMemoria.getInstance().tabelaVeiculo().remove(v.getId());	
	}
	
	
}
