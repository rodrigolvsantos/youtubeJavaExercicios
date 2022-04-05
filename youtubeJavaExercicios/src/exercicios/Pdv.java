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

		double produto,porcentagem,desconto,total,calculaDesconto, troco;
		Scanner teclado = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0");
		
		System.out.print("Digite o valor de produto: ");
		produto = teclado.nextDouble();
		
		System.out.print("Digite o valor do desconto: ");
		porcentagem = teclado.nextDouble();
		
		System.out.print("Digite o valor pago: ");
		troco = teclado.nextDouble();
		
		teclado.close();
		
		compra.setY(produto);
		compra.setX(porcentagem);
		
		desconto = compra.desconto();
		calculaDesconto = produto - desconto;
		total = troco - calculaDesconto;
		
		System.out.println("Valor do Produto: R$"+produto);
		System.out.println("Desonto: "+porcentagem+"%");
		System.out.println("Valor do desonto: R$"+compra.desconto());
		System.out.println("Valor Pago R$: "+troco);
		System.out.println("Troco: "+total);
		
	
	}

}
