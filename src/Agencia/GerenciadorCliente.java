package Agencia;



public interface GerenciadorCliente {
	
	public abstract Cliente criarCliente( long id ,String nome, String email);
	public abstract Cliente buscarClientePorId(long id);	
	public abstract Cliente buscarClientePorNome(String nome);
	public abstract void insert (Cliente c);
	public abstract void update (Cliente c);
	public abstract void remove (Cliente c);	
	
}
