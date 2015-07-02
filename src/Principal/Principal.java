package Principal;


import java.util.Calendar;
import java.util.Formatter.BigDecimalLayoutForm;


import Agencia.Aluguel;
import Agencia.Caracter;
import Agencia.CaracterFactory;
import Agencia.Cliente;
import Agencia.Fabricante;
import Agencia.Modelo;
import Agencia.RegistroGerenciadores;
import Agencia.Veiculo;
import Commands.Command;
import Commands.CommandProcessor;
import Commands.LogDecorator;
import Lampadas.LampadaAdapter;
import OnOf.OffCommand;
import OnOf.OnCommand;
import OnOf.OnOff;
import SimulacaoDeMemoria.BdEmMemoria;

import java.math.BigDecimal;


public class Principal {

	public static void main(String[] args) {
	/*	OnOff la = new LampadaAdapter();
		CommandProcessor cp = new CommandProcessor();
		Command c = new OnCommand(la);
		
		c = new LogDecorator(c);
		c = new LogDecorator(c);
		cp.doCommand(c);
		cp.undoCommand();
		cp.redoCommand();
     */	
		
		Fabricante ford = new Fabricante(0, "Ford");
		BigDecimal luxo = new BigDecimal (1000);
		Modelo modelo = new Modelo(01, ford, "mustang", "Shelby", 2015, luxo );
		Caracter[] placa= new Caracter [7];
		CaracterFactory factory = new CaracterFactory();
		placa[0]= factory.criarCaracter(0,'g');
		placa[1]= factory.criarCaracter(0,'b');
		placa[2]= factory.criarCaracter(0,'g');
		placa[3]= factory.criarCaracter(0,'0');
		placa[4]= factory.criarCaracter(0,'0');
		placa[5]= factory.criarCaracter(0,'0');
		placa[6]= factory.criarCaracter(0,'0');
		
		Veiculo carro = new Veiculo(010, modelo, placa, "00048975632", "url da foto");
		Cliente primeiro = new Cliente(12356535, "Tonny Stark", "E-mail do cara");
		Calendar dataInicio = Calendar.getInstance();
		dataInicio.set(2015, 8, 20);
		Calendar dataFinal = Calendar.getInstance();
		dataFinal.set(2015, 8, 20);
		Aluguel aluguel = new Aluguel(0, primeiro, carro, dataInicio, dataFinal, luxo);
        RegistroGerenciadores.getInstance().getGerenciadorAluguel().insert(aluguel);
        RegistroGerenciadores.getInstance().getGerenciadorVeiculo().insert(carro);
        RegistroGerenciadores.getInstance().getGerenciadorModelo().insert(modelo);
        RegistroGerenciadores.getInstance().getGerenciadorFabricante().insert(ford);
        RegistroGerenciadores.getInstance().getGerenciadorCliente().insert(primeiro);
        RegistroGerenciadores.getInstance().getGerenciadorVeiculo().buscarVeiculoPorPlaca(placa).getPlaca();
        aluguel.getDatainicio();
       
    }
}