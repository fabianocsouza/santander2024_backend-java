package aparelhos;

import componentes.aparelho_telefonico.AparelhoTelefone;

public class Celular  implements AparelhoTelefone {

	@Override
	public void ligar() {
		System.out.println("FAZENDO CHAMADA...");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDEU A CHAMADA!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO O CORREIO DE VOZ...");
		
	}

}
