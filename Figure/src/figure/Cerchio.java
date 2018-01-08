package figure;

public class Cerchio extends Figura {

	double r;
	
	public Cerchio(double r) {
		this.r=r;
	}
	
	public Cerchio(int x, int y, double r) {
		this(r);
		this.x=x;
		this.y=y;
	}
	
	public double getRaggio() {return r;}
	
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*r;
	}
	
	public String toCSV() {
		return "C;"+r;
	}

}
