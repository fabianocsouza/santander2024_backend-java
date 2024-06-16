package aparelhos;

import componentes.reprodutor_musical.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA!");
		
	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADO!️");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONAR MÚSICA!");
		
	}

}
