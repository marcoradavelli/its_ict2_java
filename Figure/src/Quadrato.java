
public class Quadrato extends Rettangolo {
	
	public Quadrato(double lato) {
		super(lato,lato);
	}
	
	public double getLato() {
		return base;
	}
	
	public String toCSV() {
		return "Q;"+base;
	}
}
