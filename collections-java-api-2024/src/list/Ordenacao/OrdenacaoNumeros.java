package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List<Integer> numerosInteiros;
	
	public OrdenacaoNumeros() {
		this.numerosInteiros = new ArrayList<>();
	}
	
	public List<Integer> getNumerosInteiros() {
		return numerosInteiros;
	}



	public void adicionarNumero(int numero){
		numerosInteiros.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numeroAscendente = new ArrayList<>(this.numerosInteiros);
		if(!numerosInteiros.isEmpty()){
			Collections.sort(numeroAscendente);
			return numeroAscendente;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numeroDescendente = new ArrayList<>(this.numerosInteiros);
		if(!numerosInteiros.isEmpty()){
			numeroDescendente.sort(Collections.reverseOrder());
			return numeroDescendente;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
		
	}
	
	public void exibirNumerosInteiros(){
		System.out.println(numerosInteiros);
	}
	
	

	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
		
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(4);
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(99);
		
		numeros.exibirNumerosInteiros();
		System.out.println(numeros.ordenarAscendente());
		System.out.println(numeros.ordenarDescendente());
		
	}

}
