package Agencia;

public interface GerenciadorFabricante {
	
	public abstract Fabricante criarFabricante( long id ,String nome);
	public abstract Fabricante buscarFabricantePorId(long id);	
	public abstract Fabricante buscarFabricantePorNome(String nome);
	public abstract void insert (Fabricante f);
	public abstract void remove (Fabricante f);	

}
