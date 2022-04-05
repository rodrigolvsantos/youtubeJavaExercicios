package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

import desconto.Desconto;

public class RegraTresPorcentagem extends Desconto {

	public static void main(String[] args) {
		/*
		 * Desenvolva uma aplicação no console (terminal) para calcular o valor da
		 * porcentagem usando Regra de 3, conforme modelo abaixo:
		 * 
		 * x% de y = valor
		 * 
		 * Exemplo: 10% de 200 = 20
		 */

		RegraTresPorcentagem rdt = new RegraTresPorcentagem();

		double x, y;
		Scanner teclado = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0");

		System.out.print("Digite o valor de X: ");
		x = teclado.nextDouble();

		System.out.print("Digite o valor de Y: ");
		y = teclado.nextDouble();
		teclado.close();
		rdt.setX(x);
		rdt.setY(y);

		System.out
				.println(df.format(rdt.getX()) + "% de " + df.format(rdt.getY()) + " é : " + df.format(rdt.desconto()));



	}

}
