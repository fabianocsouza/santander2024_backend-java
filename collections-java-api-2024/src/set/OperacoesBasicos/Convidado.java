package set.OperacoesBasicos;

import java.util.Objects;

public class Convidado {
	private String nome;
	private String codigoConvite;
	
	public Convidado(String nome, String codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigoConvite() {
		return codigoConvite;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Convidado))
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(codigoConvite, other.codigoConvite);
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}
	
	
}
