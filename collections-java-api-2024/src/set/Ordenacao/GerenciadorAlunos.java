package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunos;
	
	

	public GerenciadorAlunos() {
		this.alunos = new HashSet<>();
	}
	
	
	public void adicionarAluno(String nome, Long matricula, double nota){
		alunos.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(long matricula){
		Aluno removerAluno = null;
		if(!alunos.isEmpty()) {
			for (Aluno aluno : alunos) {
				if(aluno.getMatricula() == matricula) {
					removerAluno = aluno;
					break;
				}
			}
		} else {
		      throw new RuntimeException("O conjunto está vazio!");
	    }
		
		alunos.remove(removerAluno);
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
		
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> ordemNotaCrescente = new TreeSet<>(new ComparatorNota());
		if(!alunos.isEmpty()) {
			ordemNotaCrescente.addAll(alunos);
			return ordemNotaCrescente;
		}else {
		      throw new RuntimeException("O conjunto está vazio!");
	    }
	}
	
	public Set<Aluno> exibirAlunos(){
		return alunos;
	}



	public static void main(String[] args) {
		
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

	    // Adicionando alunos ao gerenciador
	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    // Exibindo todos os alunos no gerenciador
	    System.out.println("Alunos no gerenciador:");
	    System.out.println(gerenciadorAlunos.exibirAlunos());

	    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
	    gerenciadorAlunos.removerAluno(000L);
	    gerenciadorAlunos.removerAluno(123457L);
	    System.out.println(gerenciadorAlunos.exibirAlunos());

	    // Exibindo alunos ordenados por nome
	    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

	    // Exibindo alunos ordenados por nota
	    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

	}

}
