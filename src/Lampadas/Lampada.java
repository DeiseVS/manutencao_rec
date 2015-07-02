package Lampadas;

public class Lampada {
	
	private boolean acesa;
	
	public Lampada(){
		super();
		this.acesa = false;
	}
	
	public void acender(){
		this.acesa = true;
	}
	
	public void apagar(){
		this.acesa = false;
	}
	
	public boolean estaAcesa(){
		return this.acesa;
	}
	
}
