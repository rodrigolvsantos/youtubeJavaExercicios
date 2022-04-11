package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

import desconto.Desconto;

public class CalculeServico extends Desconto{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculeServico servico = new CalculeServico();
		double remuneraMes, 
		calculaImposto, 
		custoOperacional, 
		investimento, 
		desconto, 
		horaTrabalhada, 
		taxaImposto, 
		taxaInvestimento;

		taxaImposto = 30;

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");

		System.out.print("Digite o salário por mês: ");
		remuneraMes = teclado.nextDouble();

		servico.setY(remuneraMes);
		servico.setX(taxaImposto);

		calculaImposto = servico.desconto();		
		System.out.println(calculaImposto);
	}

}
