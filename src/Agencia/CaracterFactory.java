package Agencia;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
	
	public static final int MAIUSCULO = 0;
	public static final int MINUSCULO = 1;
	public static final int NORMAL = 2;
	
	
	
	private Map<Character, Caracter> pool;
	
	
	
	public CaracterFactory() {
		super();
		
		
		this.pool = new HashMap<Character, Caracter>();
	}
	
	
	public Caracter criarCaracter(int tipo, char c){
		Character codigo = Character.valueOf(c); 
		
		Caracter caracter = pool.get(codigo);
		
		if (!pool.containsKey(codigo) ){
			
				if (MAIUSCULO == tipo) 
					caracter = new CaracterMaiusculo(c);
				if (MINUSCULO == tipo) 
					caracter = new CaracterMinusculo(c);
				if (NORMAL == tipo) 
					caracter = new CaracterDigito(c);
					
			
			
		    pool.put(codigo, caracter);	
		
	    }
	    return caracter;
	}


	public Map<Character, Caracter> getPool() {
		return pool;
	}


	
	
	
}