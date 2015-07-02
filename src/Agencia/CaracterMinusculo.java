package Agencia;
import java.lang.Character;
public class CaracterMinusculo extends Caracter {

	public CaracterMinusculo(char c) {
		super(c);
		
	}

	@Override
	public void exibir() {
		System.out.print(Character.toLowerCase(getChar()));
		System.out.println();
		
	}
	
	
	

}
