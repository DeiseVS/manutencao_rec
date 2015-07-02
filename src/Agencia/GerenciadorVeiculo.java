package Agencia;

public interface GerenciadorVeiculo {
	
	public abstract Veiculo criarVeiculo( long id, Modelo modelo, Caracter[] placa, String renavan, String foto);
	public abstract Veiculo buscarVeiculoPorId(long id);	
	public abstract Veiculo buscarVeiculoPorModelo(String modelo);
	public abstract Veiculo buscarVeiculoPorPlaca(Caracter[] placa);
	public abstract void insert (Veiculo v);
	public abstract void remove (Veiculo v);	


}
