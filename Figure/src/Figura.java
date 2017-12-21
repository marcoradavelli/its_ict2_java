
public abstract class Figura implements Misure, Comparable<Figura>, ToCSV {
	
	@Override
	public int compareTo(Figura o) {
		if (getPerimetro() > o.getPerimetro()) return 1;
		return -1;
		//return getPerimetro() > o.getPerimetro() ? 1 : -1;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + getPerimetro();
	}
}
