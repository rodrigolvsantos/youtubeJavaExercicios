package exercicios;

import java.util.Scanner;

import desconto.Desconto;

public class PontoDeVenda {

	public static void main(String[] args) {
		/*PONTO DE VENDA
		 * Desenvolva uma aplicação no console (terminal) de ponto de vendas (PDV),
		 * conforme modelo abaixo:
		 * 
		 * Valor total: 200,00
		 * Desconto (%): 5
		 * Total desconto: 190,00 (valor já calculado)
		 * Valor Pago: 200,00
		 * Troco: 10,00 (valor calculado)
		 * 
		 * Ps. Dá para criar uma classe de desconto e usar nos dois exercícios!!
		 */
		
		double x,y;
		
		Desconto pdv = new Desconto();
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de X: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de Y: ");
		y = teclado.nextDouble();
		
		pdv.setX(x);
		pdv.setY(y);
		
		
		
		System.out.println(x + y);
		
		teclado.close();
	}

}
