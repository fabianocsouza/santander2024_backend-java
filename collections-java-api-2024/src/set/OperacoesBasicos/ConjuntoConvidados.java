package set.OperacoesBasicos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidados;
	
	
	
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	public void adionarCovidado(String nome, String codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(String codigoConvite) {
		Convidado removerConvidados = null;
		if(!codigoConvite.isEmpty()) {
			for(Convidado convidado: convidados) {
				if(convidado.getCodigoConvite().equalsIgnoreCase(codigoConvite)) {
					removerConvidados = convidado;
				}
			}
		}
		
		convidados.remove(removerConvidados);
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	public Set<Convidado> exibirConvidados() {
		return convidados;
	}

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adionarCovidado("Convidado 1", "#001");
		conjuntoConvidados.adionarCovidado("Convidado 2", "#002");
		conjuntoConvidados.adionarCovidado("Convidado 3", "#003");
		conjuntoConvidados.adionarCovidado("Convidado 4", "#002");
		conjuntoConvidados.adionarCovidado("Convidado 5", "#005");
		
		
		System.out.println(conjuntoConvidados.exibirConvidados());
		System.out.println(conjuntoConvidados.contarConvidados());
		System.out.println("=====================================");
		conjuntoConvidados.removerConvidadoPorCodigoConvite("#003");
		conjuntoConvidados.removerConvidadoPorCodigoConvite("#004");
		System.out.println(conjuntoConvidados.exibirConvidados());
		System.out.println("=====================================");
		System.out.println(conjuntoConvidados.contarConvidados());

	}

}
