package set.OperacoesBasicos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<String> conjuntoDePalavrasUnicas;
	
	
	
	public ConjuntoPalavrasUnicas() {
		this.conjuntoDePalavrasUnicas = new HashSet<>();
	}
	
	public Set<String> getConjuntoDePalavrasUnias() {
		return conjuntoDePalavrasUnicas;
	}


	public void adicionarPalavra(String palavra) {
		conjuntoDePalavrasUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		
		if(!conjuntoDePalavrasUnicas.isEmpty()) {

			if(conjuntoDePalavrasUnicas.contains(palavra)) {
				conjuntoDePalavrasUnicas.remove(palavra);
			}else {
		        System.out.println("Palavra não encontrada no conjunto!");
		    }
		}
		
	}
	
	public boolean verificarPalavra(String palavra) {
		return conjuntoDePalavrasUnicas.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		if(!conjuntoDePalavrasUnicas.isEmpty()) {
		      System.out.println(conjuntoDePalavrasUnicas);
	    } else {
	      System.out.println("O conjunto está vazio!");
		}
	}
	
	
	

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjutoDePalavras = new ConjuntoPalavrasUnicas();
		
		conjutoDePalavras.adicionarPalavra("Palavra 1");
		conjutoDePalavras.adicionarPalavra("Palavra 2");
		conjutoDePalavras.adicionarPalavra("Palavra 3");
		conjutoDePalavras.adicionarPalavra("Palavra 4");
		conjutoDePalavras.adicionarPalavra("Palavra 5");
		
		conjutoDePalavras.exibirPalavrasUnicas();
		conjutoDePalavras.removerPalavra("Palavra 3");
		conjutoDePalavras.exibirPalavrasUnicas();
		
		conjutoDePalavras.removerPalavra("Palavra 3");
		
		String existe = conjutoDePalavras.verificarPalavra("Palavra 6") ? "SIM": "NÃO";
		System.out.println("A palavra existe no conjuto: " + existe);
	}
}
