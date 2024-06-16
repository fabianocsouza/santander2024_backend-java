package com.conta;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.conta.modelo.Conta;
import com.conta.modelo.Pessoa;

public class ContaTeminal {

	public static void main(String[] args) {
		
		try  {
			Scanner scanner = new Scanner(System.in);
			
			Pessoa client =  new Pessoa();
			Conta conta = new Conta();
			
			
			System.out.print("Por favor, informe nome do cliente: ");
			client.name(scanner.nextLine());
			conta.adicionarCliente(client);
			
			System.out.print("Digita o número da agencia: ");
			conta.adicionarAgencia(scanner.nextLine());
			
			System.out.print("digita o número da conta: ");
			conta.adicionarNumeroConta(scanner.nextInt());
			
			System.out.print("Digito saldo da abertura da conta: ");
			conta.adicionarSaldo(scanner.nextDouble());

			
			System.out.println("");		
			System.out.println(conta.retornarResultadoAberturaConta());
			
			scanner.close();
			
		}catch (InputMismatchException e) {
			System.out.println("Erro: Não foi possivel criar a conta bancaria ");
		}
		

	}

}
