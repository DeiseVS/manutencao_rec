package SimulacaoDeMemoria;


import Agencia.Fabricante;
import Agencia.GerenciadorFabricante;

public class GernciadorFabricanteEmMemoria implements GerenciadorFabricante {
	private static GernciadorFabricanteEmMemoria instance = null;
	private GernciadorFabricanteEmMemoria() {
		
	}

	
	public static GernciadorFabricanteEmMemoria getInstance(){
		if (GernciadorFabricanteEmMemoria.instance == null)
			instance = new GernciadorFabricanteEmMemoria();
		return GernciadorFabricanteEmMemoria.instance;	
	}

	@Override
	public Fabricante criarFabricante(long id, String nome) {
		return new Fabricante(id, nome);
	}

	@Override
	public Fabricante buscarFabricantePorId(long id) {
		return BdEmMemoria.getInstance().tabelaFabricante().get(id);
	}

	@Override
	public Fabricante buscarFabricantePorNome(String nome) {
        	for (Fabricante f : BdEmMemoria.getInstance().tabelaFabricante().values()){
        		if (f.getNome().equalsIgnoreCase(nome))
        			return f;
        		    
	} 
        return null;
	}

	@Override
	public void insert(Fabricante f) {
		if (BdEmMemoria.getInstance().tabelaFabricante().containsKey(f.getId()))
			throw new RuntimeException("fabricante ja inserido");
		else
			BdEmMemoria.getInstance().tabelaFabricante().put(f.getId(), f);
	}

	@Override
	public void remove(Fabricante f) {
		BdEmMemoria.getInstance().tabelaFabricante().remove(f.getId());	
	}
	
}
 