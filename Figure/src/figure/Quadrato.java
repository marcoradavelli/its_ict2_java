package figure;

public class Quadrato extends Rettangolo {
	
	public Quadrato(double lato) {
		super(lato,lato);
	}
	
	public Quadrato(int x, int y, double lato) {
		this(lato);
		this.x=x;
		this.y=y;
	}
	
	public double getLato() {
		return base;
	}
	
	@Override
	public String toCSV() {
		return "Q;"+base;
	}
}
