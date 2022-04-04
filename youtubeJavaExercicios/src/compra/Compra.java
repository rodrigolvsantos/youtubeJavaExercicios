package compra;

import desconto.Desconto;

public class Compra extends Desconto  {
	
	double x,y,total;
	
	Compra desc = new Compra(); 
	
	
	double desconto = desc.desconto();
	
	
	protected double total () {
		this.total = (this.x + this.y) - desconto;
		return total;
	}
	

}
