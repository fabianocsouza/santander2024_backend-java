package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> tarefas;
	
	public ListaTarefas() {this.tarefas = new HashSet<>();}
	
	public void adicionarTarefa(String descricao){
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao){
		Tarefa tarefaRemover = null;
		if(!tarefas.isEmpty()) {
			for(Tarefa tarefa: tarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					if(!tarefa.isConcluido()) {
						System.out.println("Não foi possível remover!");
						break;
					}
					tarefaRemover = tarefa;
				}
			}
		}
		tarefas.remove(tarefaRemover);
	}
	
	public Set<Tarefa> exibirTarefas(){
		return tarefas;
	}
	
	public int contarTarefas(){
		return tarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefaConcluida = new HashSet<>();
		
		if(!tarefas.isEmpty()) {
			for(Tarefa tarefa: tarefas) {
				if(tarefa.isConcluido()) {
					tarefaConcluida.add(tarefa);
				}
			}
		}
		
		return tarefaConcluida;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefaPendentes = new HashSet<>();
				
		if(!tarefas.isEmpty()) {
			for(Tarefa tarefa: tarefas) {
				if(!tarefa.isConcluido()) {
					tarefaPendentes.add(tarefa);
				}
			}
		}
				
		return tarefaPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao){
		if(!tarefas.isEmpty()) {
			for(Tarefa tarefa: tarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefa.setConcluido(true);
					break;
				}
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao){
		if(!tarefas.isEmpty()) {
			for(Tarefa tarefa: tarefas) {
				if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefa.setConcluido(false);
					break;
				}
			}
		}
	}
	
	public Set<Tarefa> limparListaTarefas(){
		tarefas.clear();
		return tarefas;
	}
	
	
	

	public static void main(String[] args) {
		ListaTarefas tarefas =  new ListaTarefas();
				
		 tarefas.adicionarTarefa("Estudar Java");
		 tarefas.adicionarTarefa("Fazer exercícios físicos");
		 tarefas.adicionarTarefa("Organizar a mesa de trabalho");
		 tarefas.adicionarTarefa("Ler livro");
		 tarefas.adicionarTarefa("Preparar apresentação");
		 
		 tarefas.removerTarefa("Preparar apresentação");
		 
		 System.out.println(tarefas.exibirTarefas());
		 System.out.println(tarefas.contarTarefas());
		 System.out.println(tarefas.obterTarefasConcluidas());
		 System.out.println(tarefas.obterTarefasPendentes());
		 tarefas.marcarTarefaConcluida("Estudar Java");
		 tarefas.marcarTarefaConcluida("Organizar a mesa de trabalho");
		 tarefas.marcarTarefaConcluida("Preparar apresentação");
		 System.out.println(tarefas.obterTarefasConcluidas());
		 System.out.println(tarefas.obterTarefasPendentes());
		 tarefas.marcarTarefaPendente("Organizar a mesa de trabalho");
		 System.out.println(tarefas.obterTarefasConcluidas());
		 System.out.println(tarefas.obterTarefasPendentes());
		 System.out.println(tarefas.limparListaTarefas());
		 System.out.println(tarefas.contarTarefas());
	}

}
