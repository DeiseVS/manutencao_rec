package Agencia;

import SimulacaoDeMemoria.GerenciadorAluguelEmMemoria;
import SimulacaoDeMemoria.GerenciadorClienteEmMemoria;
import SimulacaoDeMemoria.GerenciadorModeloEmMemoria;
import SimulacaoDeMemoria.GerenciadorVeiculoEmMemoria;
import SimulacaoDeMemoria.GernciadorFabricanteEmMemoria;

public class RegistroGerenciadores {
	private static RegistroGerenciadores instance = null;
	
    private RegistroGerenciadores() {
		
	}
	
    public static RegistroGerenciadores getInstance (){
		if (RegistroGerenciadores.instance == null)
			RegistroGerenciadores.instance = new RegistroGerenciadores();
		return RegistroGerenciadores.instance;
	}
	
	
    public GerenciadorCliente getGerenciadorCliente (){
		return GerenciadorClienteEmMemoria.getInstance();   		
    }
    public GerenciadorFabricante getGerenciadorFabricante (){
    	return GernciadorFabricanteEmMemoria.getInstance();
    }
    public GerenciadorModelo getGerenciadorModelo(){
    	return GerenciadorModeloEmMemoria.getInstance();
    }
    public GerenciadorVeiculo getGerenciadorVeiculo(){
    	return GerenciadorVeiculoEmMemoria.getIntance();
    }
    public GerenciadorAluguel getGerenciadorAluguel(){
    	return GerenciadorAluguelEmMemoria.getInstance(); 
    }
}
			