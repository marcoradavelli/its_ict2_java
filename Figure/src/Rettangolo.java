
public class Rettangolo extends Figura {

	double base;
	double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double getArea() {
		return base*altezza;
	}

	@Override
	public double getPerimetro() {
		return (base+altezza)*2;
	}

	@Override
	public String toCSV() {
		return "R;"+base+";"+altezza;
	}

}
