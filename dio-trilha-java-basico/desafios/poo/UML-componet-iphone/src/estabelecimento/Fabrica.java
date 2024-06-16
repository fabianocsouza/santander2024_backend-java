package estabelecimento;

import aparelhos.Celular;
import aparelhos.Desktop;
import aparelhos.Iphone;
import aparelhos.Ipod;
import componentes.aparelho_telefonico.AparelhoTelefone;
import componentes.navegador_internet.NavegadorInternet;
import componentes.reprodutor_musical.ReprodutorMusical;

public class Fabrica {
	public static void main(String[] args) {
		
		Ipod midia = new Ipod();
		Celular celular =  new Celular();
		Desktop computador = new Desktop();
		Iphone iphone = new Iphone();
	
		
		
		System.out.println("------------- IPOD ------------");
		System.out.println();
		
		midia.tocar();
		midia.selecionarMusica();
		midia.pausar();
		System.out.println();
		
		System.out.println("----------- CELULAR -----------");
		System.out.println();
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioVoz();
		System.out.println();
		
		System.out.println("----------- DESKTOP -----------");
		System.out.println();
		
		computador.exibirPagina();
		computador.adicionarNovaAba();
		computador.atualizarPagina();
		System.out.println();
		
		System.out.println("------------ IPHONE -----------");
		System.out.println();
		
		iphone.tocar();
		iphone.selecionarMusica();
		iphone.pausar();
		System.out.println();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		System.out.println();
		
		System.out.println("------------ POLIMORFISMO -----------");
		System.out.println();
		
		Iphone iphoneX = new Iphone();
		
		ReprodutorMusical musica = iphoneX;
		AparelhoTelefone  telefone = iphoneX;
		NavegadorInternet desktop = iphoneX;
		
		ReprodutorMusical iphoneSE =  new Iphone();
		
		musica.tocar();
		iphoneSE.pausar();
		telefone.iniciarCorreioVoz();
		desktop.exibirPagina();
	
		
		
	}
}
