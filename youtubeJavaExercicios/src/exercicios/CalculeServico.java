package exercicios;

import java.util.Scanner;

import desconto.Desconto;

/*Desenvolva uma aplicação no console (terminal) para calcular o valor da hora de um serviço,
 * de acordo com a fórmula abaixo:
 * 
 * remuneração mensal + impostos + custo operacional + investimentos
 * _________________________________________________________________
 * 
 * 				carga horária mensal de trabalho
 * 
 * impostos: 30% da remuneração mensal
 * 
 * investimento: 20% da remuneração mensal
 * 
 * */

public class CalculeServico extends Desconto{
	
/*Método que calcula o imposto lendo a classe Desconto no pacote Desconto.
 * Observe que vc pode criar vários métodos lendo a classe Desconto
 * */	 	
private static double imposto ( double remuneracao ) {
		
		CalculeServico imposto = new CalculeServico();
	    double taxaImposto = 30;
		imposto.setY(remuneracao);
		imposto.setX(taxaImposto);
		double resultado = 0;
		resultado = imposto.desconto();
		return resultado;
	}


/*Método que calcula o investimento lendo a classe Desconto no pacote Desconto.
* Observe que vc pode criar vários métodos lendo a classe Desconto
* */	 	

private static double investimento ( double remuneracao ) {
	
	CalculeServico investimento = new CalculeServico();
    double taxaInvestimento = 20;
	investimento.setY(remuneracao);
	investimento.setX(taxaInvestimento);
	double resultado = 0;
	resultado = investimento.desconto();
	return resultado;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor da remuneração: ");
		double remuneracao = teclado.nextDouble();
		
		System.out.print("Digite o valor do custo operacional: ");
		double custoOper = teclado.nextDouble();

		System.out.print("Digite a qtde de carga horária: ");
		double cargaHoraria = teclado.nextDouble();
		
		double imposto = imposto(remuneracao);
		System.out.println("Valor a ser pago de imposto: " + imposto);
		
		double investimento = investimento(remuneracao);
		System.out.println("Valor a ser investido: " + investimento);
		
		double total = (remuneracao + imposto + custoOper + investimento ) / cargaHoraria;
		
		System.out.println("\nO valor a ser cobrado é: " + total);
		
	}
	

	

}
