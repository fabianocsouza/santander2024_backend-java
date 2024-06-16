package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private Long matricula;
	private double nota;
	
	public Aluno(String nome, Long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}

	public String getNome() {
		return nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome + ", matricula: " + matricula + ", nota: " + nota + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
}

class ComparatorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		// TODO Auto-generated method stub
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}
