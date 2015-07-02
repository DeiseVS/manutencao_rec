package Agencia;
import java.lang.Character; 
public class CaracterMaiusculo extends Caracter {

	
	public CaracterMaiusculo(char c) {
		super(c);
		
	}
	
	@Override
	public void exibir() {
	System.out.print(Character.toUpperCase(getChar()));		
	}		
}	
