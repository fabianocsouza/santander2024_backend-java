package set.Pesquisa;

public class Tarefa {
	private String descricao;
	private boolean concluido;

	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluido = false;
	}

	public String getDescricao() {
		return descricao;
	}

	
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public boolean isConcluido() {
		return concluido;
	}

	@Override
	public String toString() {
		return "Tarefa: " + descricao + ", concluido: " + concluido + "\n";
	}

	
}
