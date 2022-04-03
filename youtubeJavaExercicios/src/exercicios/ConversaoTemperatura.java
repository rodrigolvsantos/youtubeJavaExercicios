package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		// Variaveis
		double c,f;
		//Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada de dados
		System.out.println("Conversao de temperatura");
		System.out.print("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		//processamento
		c = (5 * (f - 32)) / 9;
		//saida 
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + " 	°C");
		teclado.close();
		
		
	}

}
