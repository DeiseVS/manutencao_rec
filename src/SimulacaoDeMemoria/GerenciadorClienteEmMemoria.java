package SimulacaoDeMemoria;
import java.util.Iterator;

import Agencia.Cliente;
import Agencia.GerenciadorCliente;


public class GerenciadorClienteEmMemoria implements GerenciadorCliente {
	private static GerenciadorClienteEmMemoria instance = null;
	
	
	private GerenciadorClienteEmMemoria() {	
	}
	
	public static GerenciadorClienteEmMemoria getInstance (){
		if(GerenciadorClienteEmMemoria.instance == null)
			GerenciadorClienteEmMemoria.instance = new GerenciadorClienteEmMemoria();
		return GerenciadorClienteEmMemoria.instance;	
	}
    
	public Iterator<Cliente> getTabelaclientes() {
 		return  BdEmMemoria.getInstance().tabelaClientes().iterator(); 
 	} 
	
	@Override
	public Cliente criarCliente(long id, String nome, String email) {
		return new Cliente(id, nome, email);
	}

	@Override
	public Cliente buscarClientePorId(long id) {
		Cliente c = null;
		Iterator<Cliente> todosClientes = this.getTabelaclientes();
		while (todosClientes.hasNext()){
		if (todosClientes.next().getId() == id )
			c = todosClientes.next();
		}
		return c;
	}		

	@Override
	public Cliente buscarClientePorNome(String nome) {
		Cliente c = null;
		Iterator<Cliente> todosClientes = this.getTabelaclientes();
		while (todosClientes.hasNext()){
		if (todosClientes.next().getNome() == nome )
			c = todosClientes.next();
		}
		return c;
	}	

	@Override
	public void insert(Cliente c) {
		if (BdEmMemoria.getInstance().tabelaClientes().contains(c))
			throw new RuntimeException("Cliente ja inserido");
		else
		    BdEmMemoria.getInstance().tabelaClientes().add(c);	
	}

	@Override
	public void update(Cliente cliente) {
		int cont = 0;
		Iterator<Cliente> todosClientes = this.getTabelaclientes();
			while (todosClientes.hasNext()){
				if (todosClientes.next().equals(cliente))
					BdEmMemoria.getInstance().tabelaClientes().set(cont, cliente);
				cont++;
			}
		}
		
	

	@Override
	public void remove(Cliente c) {
		BdEmMemoria.getInstance().tabelaClientes().remove(c);
		
	}

}
