import java.util.Scanner;

public class Teste { 

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 

	        double limiteDiario = scanner.nextDouble();
	        double valorSaque = 0;

            for(int index = 0; index < limiteDiario; index++ ){
            	double saque = scanner.nextDouble();
            	valorSaque = valorSaque + saque;
            	if(limiteDiario <= 0) {
            		System.out.println("Transacoes encerradas.");
            		return;
            		
            	}else if(valorSaque > limiteDiario) {
            		System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            		return;
            	}else {
            		limiteDiario = limiteDiario - valorSaque;
            		System.out.println("Saque realizado. Limite restante:"+ limiteDiario);
            	}
            	System.out.println("limite aqui"+ limiteDiario);
            	System.out.println("valor aqui"+ valorSaque);
            }

	        scanner.close(); 
	        
	}
}