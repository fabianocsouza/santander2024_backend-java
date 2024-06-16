package com.conta.modelo;

import java.util.InputMismatchException;

public class Conta {
	
	private int numero;
	private String agencia;
	private Pessoa client;
	private double saldo;
	
	public void adicionarNumeroConta(int numero) {
		
		this.numero = numero;
			
	}
	
	public void adicionarAgencia(String agencia) {
		
		this.agencia = agencia;
		
	}
	
	public void adicionarCliente(Pessoa client) {
		this.client = client;
	}
	
	public void adicionarSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String retornarResultadoAberturaConta() throws InputMismatchException {
		String mensagem = "";
		
		mensagem = "Olá "+ this.client.name + " obrigado por criar uma conta em nosso banco,"
				 + " sua agência é "+ this.agencia 
				 + " conta "+ this.numero + " e seu saldo "+ this.saldo 
				 +" já está disponível para saque!";
		
		return mensagem;
	}
}
