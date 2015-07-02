package SimulacaoDeMemoria;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Agencia.Aluguel;
import Agencia.Cliente;
import Agencia.Fabricante;
import Agencia.Modelo;
import Agencia.Veiculo;

 
public class BdEmMemoria {
	
	 private static BdEmMemoria instance = null;
     
	 private List <Cliente> clientes;
     private Map<Long, Fabricante> fabricantes;
     private Map<Long, Modelo> modelos;
     private Map<Long, Veiculo> veiculos;
     private Map<Long, Aluguel> alugueis;
     
     private BdEmMemoria() {
		clientes = new ArrayList <Cliente>();
		fabricantes = new HashMap<Long,Fabricante>();
		modelos = new HashMap<Long,Modelo>();
		veiculos = new HashMap<Long, Veiculo>();
		alugueis = new HashMap<Long, Aluguel>();
	}
     
     
     
     public static BdEmMemoria getInstance() {
 		if (BdEmMemoria.instance == null) {
 			BdEmMemoria.instance = new BdEmMemoria();
 		}
 		return BdEmMemoria.instance;
 	}
     

     public List<Cliente> tabelaClientes (){
    	 return clientes;
     }
     
     public Map<Long,Fabricante> tabelaFabricante(){
    	 return fabricantes;
     }
     
     public Map<Long, Modelo> tabelaModelos(){
    	 return modelos;
     }
     
     public Map<Long, Veiculo> tabelaVeiculo(){
    	 return veiculos;
     }
     
     public Map<Long, Aluguel> tabelaAluguel(){
    	 return alugueis;
     }
     
     }
     
     
    
     