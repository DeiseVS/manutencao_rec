package Agencia;

public class Fabricante extends ObjetoDominio {
	private String nome;
	
	
	
	public Fabricante(long id, String nome) {
		super(id);
		this.nome = nome;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	

}
