package aparelhos;

import componentes.aparelho_telefonico.AparelhoTelefone;
import componentes.navegador_internet.NavegadorInternet;
import componentes.reprodutor_musical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefone, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO A PÁGINA! 🔍");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO UMA NOVA ABA!📑");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA ⏳...");
		
	}

	@Override
	public void ligar() {
		System.out.println("FAZENDO CHAMADA ☎️ ...");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDEU A CHAMADA 📞!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO O CORREIO DE VOZ ✉️ ...");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA 🎶");
		
	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADO! ⏸️");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONAR MÚSICA!");
		
	}

}
