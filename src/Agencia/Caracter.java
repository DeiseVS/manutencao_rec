package Agencia;

public abstract class Caracter {
	
	private char c;

	public Caracter(char c) {
		this.c = c;
	}
	
	public char getChar(){
		return c;
	}
	
	public abstract void exibir();
		
	
}
