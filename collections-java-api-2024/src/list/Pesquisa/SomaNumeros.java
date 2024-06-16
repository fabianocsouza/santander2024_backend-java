package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros;
	
	public SomaNumeros() {this.numeros = new ArrayList<>();}

	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero : numeros) {
			soma += numero;
		}
		
		return soma;
	}

	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		for(Integer valor: numeros) {
			if(valor >= maiorNumero) {
				maiorNumero = valor;
			}
		}
		
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		for(Integer valor: numeros) {
			if(valor <= menorNumero) {
				menorNumero = valor;
			}
		}
		
		return menorNumero;
	}
	
	public List<Integer> exibirNumeros() {
		
		return numeros;
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
	    somaNumeros.adicionarNumero(5);
	    somaNumeros.adicionarNumero(0);
	    somaNumeros.adicionarNumero(0);
	    somaNumeros.adicionarNumero(-2);
	    somaNumeros.adicionarNumero(10);
		
		System.out.println(somaNumeros.calcularSoma());
		System.out.println(somaNumeros.encontrarMaiorNumero());
		System.out.println(somaNumeros.encontrarMenorNumero());
		System.out.println(somaNumeros.exibirNumeros());
	}
}


