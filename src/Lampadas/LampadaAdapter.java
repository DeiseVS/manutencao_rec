package Lampadas;

import OnOf.OnOff;

public class LampadaAdapter implements OnOff {
	
	private Lampada la = null;

	public LampadaAdapter() {
		super();
		this.la = new Lampada();
	}

	public void on() {
		la.acender();		
	}

	public void off() {
		la.apagar();		
	}

	public boolean isOn() {
		return this.la.estaAcesa();
	}
	

}
