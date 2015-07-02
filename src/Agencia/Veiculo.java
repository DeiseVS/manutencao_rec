package Agencia;

import java.util.Arrays;



public class Veiculo extends ObjetoDominio {
	
	private Modelo modelo;
	private Caracter[] placa;
	private String renavan;
	private String foto;
	
	
	
	public Veiculo(long id, Modelo modelo, Caracter[] placa, String renavan, String foto) {
		super(id);
		this.modelo = modelo;
		this.placa = placa;
		this.renavan = renavan;
		this.foto = foto;
	}



	public Modelo getModelo() {
		return modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public void getPlaca() {
		for(Caracter car : placa){
			car.exibir();
		}
		
	}

	public void setPlaca(Caracter[] placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public boolean comparaPlaca (Caracter[] placa){
		return Arrays.equals(this.placa, placa);
	}



	

}
