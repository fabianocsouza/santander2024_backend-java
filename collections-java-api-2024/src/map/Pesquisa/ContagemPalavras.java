package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map<String, Integer> contagemPalavrasMap;
	
	

	public ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<>();
	}


	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavrasMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemPalavrasMap.isEmpty()) {
			contagemPalavrasMap.remove(palavra);
		}
	}
	
	public Map<String, Integer>  exibirContagemPalavras() {
		return contagemPalavrasMap;
	}
	
	public String encontrarPalavraMaisFrequente() {
		String palavrasMaisFrequete = null;
		int contagemPalavrasMaisFrequetes = 0;
		if(!contagemPalavrasMap.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
				if(entry.getValue() > contagemPalavrasMaisFrequetes) {
					contagemPalavrasMaisFrequetes = entry.getValue();
					palavrasMaisFrequete = entry.getKey();
				}
			}
		}
		
		return palavrasMaisFrequete;
	}

	public static void main(String[] args) {
		
		ContagemPalavras contagemLinguagens = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
	    contagemLinguagens.adicionarPalavra("Java", 2);
	    contagemLinguagens.adicionarPalavra("Python", 8);
	    contagemLinguagens.adicionarPalavra("JavaScript", 1);
	    contagemLinguagens.adicionarPalavra("C#", 6);

	    // Exibe a contagem total de linguagens
	    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

	    // Encontra e exibe a linguagem mais frequente
	    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
	    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}

}
