package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto  implements Comparable<Produto>{
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}

	public String getNome() {
		return nome;
	}

	public long getCod() {
		return cod;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	

	

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produto))
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + ", cod: " + cod + ", preco: " + preco + ", quantidade: " + quantidade + "\n";
	}
	
	
}

class CompararProdutoPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
