package Observer;

import Agencia.Aluguel;

public class ObservadorAluguel implements Observador {

	private Aluguel subject;
	
	public ObservadorAluguel(Aluguel subject) {
		this.subject = subject;
		this.subject.adicionar(this);
	}




	@Override
	public void atualizar() {
		System.out.println (subject.getCliente().getNome());
		subject.getVeiculo().getPlaca();
		System.out.println (subject.getVeiculo().getModelo().getNome());
		System.out.println(subject.getPresoDiarias());
	}

}
