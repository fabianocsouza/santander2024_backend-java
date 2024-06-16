package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	private Set<Produto> produtos;
	
	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}

	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade){
		produtos.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> ordernarPorNome = new TreeSet<>(produtos);
		
		return ordernarPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> ordernarPorPreco = new TreeSet<>(new CompararProdutoPorPreco());
		if(!produtos.isEmpty()) {
			ordernarPorPreco.addAll(produtos);
			return ordernarPorPreco;
		}else {
		      throw new RuntimeException("O conjunto está vazio!");
	    }
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    // Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
	    
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}

}
