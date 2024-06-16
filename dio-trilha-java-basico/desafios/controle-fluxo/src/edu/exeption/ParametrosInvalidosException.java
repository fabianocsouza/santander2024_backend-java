package edu.exeption;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {
	
	public String menssage() {
		return "O segundo parâmetro deve ser maior que o primeiro!";
	}
}
