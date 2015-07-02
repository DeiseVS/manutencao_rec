package Agencia;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Aluguel extends ObjetoDominio  {
	
	private Cliente cliente;
	private Veiculo veiculo;
	private Calendar datainicio;
	private Calendar datafim;
	private BigDecimal presoDiarias = new BigDecimal(0);
	private boolean cancelado;
	
	public Aluguel(long id, Cliente cliente, Veiculo veiculo, Calendar datainicio, Calendar datafim, BigDecimal presodiarias) {
		super(id);
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.datainicio = Calendar.getInstance();
		this.datainicio = datainicio;
		this.datafim = Calendar.getInstance();
		this.datafim = datafim;
		this.presoDiarias.add(presodiarias);
		this.cancelado = false;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		notificar();
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
		notificar();
	}

	public void getDatainicio() {
		System.out.print(datainicio.get(Calendar.YEAR)+"/");
		System.out.print(datainicio.get(Calendar.MONTH)+"/");
		System.out.println(datainicio.get(Calendar.DAY_OF_MONTH));
	}

	public void setDatainicio(Calendar datainicio) {
		this.datainicio = datainicio;
		notificar();
	}

	public void getDatafim() {
		System.out.print(datafim.get(Calendar.YEAR)+"/");
		System.out.print(datafim.get(Calendar.MONTH)+"/");
		System.out.println(datafim.get(Calendar.DAY_OF_MONTH));
		
	}

	public void setDatafim(Calendar datafim) {
		this.datafim = datafim;
		notificar();
	}
	
	public BigDecimal getPresoDiarias() {
		return presoDiarias;
	}
	
	public void cancelar(){
		Calendar dataAtual = new GregorianCalendar();
		if (dataAtual.compareTo(datainicio) == -1 ){
			cancelado = true;
			notificar();
		}
		else
			throw new RuntimeException("data invalida para cancelamento");
	}

	public boolean getCancelado(){
		return cancelado; 
	}

	public void setPresoDiarias(BigDecimal presoDiarias) {
		this.presoDiarias.add(presoDiarias);
		notificar();
	}

	

}