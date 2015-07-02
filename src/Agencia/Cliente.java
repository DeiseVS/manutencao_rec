package Agencia;

public class Cliente extends ObjetoDominio {
	
	private String nome;
	private String email;
	
	
	public Cliente(long id, String nome, String email) {
		super(id);
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	

}
