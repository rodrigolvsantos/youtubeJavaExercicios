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
	
	double desconto (double x, double y) {
		resultado = (x * y) / 100;
		return resultado;
		
	}
	
	
}
