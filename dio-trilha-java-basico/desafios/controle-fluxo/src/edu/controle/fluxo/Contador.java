package edu.controle.fluxo;

import java.util.Scanner;

import edu.exeption.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro:  ");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
			terminal.close();
		
		}catch (ParametrosInvalidosException exception) {
			
			System.out.println(exception.menssage());
		}
		
	}
	
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroUm > parametroDois) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
				
		for (int index = 0; index < contagem; index++) {
			
			System.out.print(index + ", ");
		}
	}
}