package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Item> itens;
	
	public CarrinhoDeCompras(){
		this.itens  = new ArrayList<>();
	}
	public void adionarItem( String nome, double preco, int quantidade ) {
		itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removeItem( String nome ) {
		List<Item> removerItem = new ArrayList<>();
		
		if(!itens.isEmpty()) {
			for(Item itenRemover : itens) {
				if(itenRemover.getNome().equalsIgnoreCase(nome)) {
					removerItem.add(itenRemover);
				}
			}
			
			itens.removeAll(removerItem);
		}else {
			System.out.println("A lista está vazia!");
		}
		
	}

	public double calcularValorTotal() {
		double valorToralItens = 0d;
		
		for(Item itemCalcular : itens) {
			double total = 0d;
			total = itemCalcular.getPreco() * itemCalcular.getQuantidade();
			valorToralItens += total;
		}
		
		return valorToralItens;
	}

	public void exibirItens() {
		System.out.println(itens);
	}
	
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		System.out.println("O valor total no carrinho de compras: " + carrinhoDeCompras.calcularValorTotal());
		
		carrinhoDeCompras.adionarItem("Tenis", 200, 1);
		carrinhoDeCompras.adionarItem("Tenis", 400, 1);
		carrinhoDeCompras.adionarItem("Camisa", 49, 2);
		System.out.println("O valor total no carrinho de compras: " + carrinhoDeCompras.calcularValorTotal());
		
		carrinhoDeCompras.removeItem("Tenis");
		System.out.println("O valor total no carrinho de compras: " + carrinhoDeCompras.calcularValorTotal());
		
		carrinhoDeCompras.exibirItens();
	}
}
