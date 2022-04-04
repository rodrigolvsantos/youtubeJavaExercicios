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

	protected void desconto(double x, double y) {
		resultado = (this.x / 100) * + this.y;
		System.out.println(resultado);

	}

}
