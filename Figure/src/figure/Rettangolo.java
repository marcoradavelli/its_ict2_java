package figure;

public class Rettangolo extends Figura {

	double base;
	double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public Rettangolo(int x, int y, double base, double altezza) {
		this.x=x;
		this.y=y;
		this.base = base;
		this.altezza = altezza;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
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
