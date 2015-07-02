package Agencia;  //framework -> arcabouço

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Observer.Observador;



public abstract class ObjetoDominio {
	private long id;
	private List<Observador> observadores = new ArrayList<Observador>(); 
	
    public Iterator<Observador> getObservadores() {
		return  this.observadores.iterator(); 
	}
	
	public ObjetoDominio(long id) {
		this.id = id;
	}
	
	public final long getId(){
		return this.id;
	}
	
	public void adicionar (Observador o){
		this.observadores.add(o);	
	}
	
	public void remover (Observador o){
		this.observadores.remove(o);	
	}
	
	public void notificar(){
		Iterator<Observador> allObserver = this.getObservadores();
		while (allObserver.hasNext()){
			allObserver.next().atualizar();
		}
	}
	
	
}	
