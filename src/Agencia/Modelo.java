package Agencia;

import java.math.BigDecimal;

public class Modelo extends ObjetoDominio {
	
	private Fabricante fabricante;
	private String nome;
	private String descricao;
	private int ano;
	private BigDecimal precodiaria = new BigDecimal(0);
	
	public Modelo(long id, Fabricante fabricante, String nome, String descricao, int ano, BigDecimal precodiaria ) {
		super(id);
		    this.fabricante = fabricante;
			this.nome = nome;
			this.descricao = descricao ;
			this.ano = ano;
			this.precodiaria.add(precodiaria) ;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public BigDecimal getPrecodiaria() {
		return precodiaria;
	}

	public void setPrecodiaria(BigDecimal precodiaria) {
		this.precodiaria.add(precodiaria);
	}


	
	

}
