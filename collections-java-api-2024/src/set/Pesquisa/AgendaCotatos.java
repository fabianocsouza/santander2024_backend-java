package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;


public class AgendaCotatos {
	
	private Set<Contato> contatos;
	
	public AgendaCotatos() {this.contatos = new HashSet<>();}
	
	public void adicionarContato(String nome, int numero){
		contatos.add(new Contato(nome, numero));
	}
	
	public Set<Contato> exibirContatos(){
		return contatos;
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		if(!contatos.isEmpty()) {
			for(Contato contato: contatos) {
				if(contato.getNome().startsWith(nome)) {
					contatoPorNome.add(contato);
				}
			}
		}
		
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero){
		Contato contatoAtualizado = null;
		
		for(Contato contato: contatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setTelefone(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	

	public static void main(String[] args) {
		AgendaCotatos contatos = new AgendaCotatos();
		
		System.out.println(contatos.exibirContatos());
		
		contatos.adicionarContato("Fabiano", 123456);
		contatos.adicionarContato("Fabiano", 5665);
		contatos.adicionarContato("Fabiano Souza", 111111);
		contatos.adicionarContato("Fabiano Cardozo", 678910);
		contatos.adicionarContato("Maria Silva", 111111);
		
		System.out.println(contatos.exibirContatos());
		System.out.println(contatos.pesquisarPorNome("Fabiano"));
		System.out.println(contatos.atualizarNumeroContato("Fabiano", 111111));
		System.out.println(contatos.exibirContatos());

	}

}
