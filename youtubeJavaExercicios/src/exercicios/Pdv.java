package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
import desconto.Desconto;

public class Pdv extends Desconto {

	public static void main(String[] args) {
		/*
		 * PONTO DE VENDA Desenvolva uma aplicação no console (terminal) de ponto de
		 * vendas (PDV), conforme modelo abaixo:
		 * 
		 * Valor total: 200,00 Desconto (%): 5 Total desconto: 190,00 (valor já
		 * calculado) Valor Pago: 200,00 Troco: 10,00 (valor calculado)
		 * 
		 * Ps. Dá para criar uma classe de desconto e usar nos dois exercícios!!
		 */

		Pdv compra = new Pdv();

		double produto,porcentagem,desconto,total, troco;
		Scanner teclado = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0");
		
		System.out.print("Digite o valor de produto: ");
		produto = teclado.nextDouble();
		
		System.out.print("Digite o valor do desconto: ");
		porcentagem = teclado.nextDouble();
		
		compra.setX(produto);
		compra.setY(porcentagem);
		
		total = (compra.getX()+ compra.getY()) - compra.desconto();
		
		System.out.println(total);
		System.out.print(compra.getX() - total);
		
	
	}

}
