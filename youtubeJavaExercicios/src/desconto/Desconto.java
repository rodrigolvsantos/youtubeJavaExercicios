package desconto;

import java.text.DecimalFormat;

public class Desconto {

	private static final DecimalFormat df = new DecimalFormat("0.00");

	private double x, y;

	private double resultado;

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

//	metodo que calcula o desconto
	
	protected double desconto() {
		resultado = (this.x / 100) * +this.y;
		return resultado;

	}

}
