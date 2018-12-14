package org.jac.figure;

public class Rettangolo extends Figura {

	double b, h;
	
	/**
	 * Create a new instance of Rettangolo
	 * @param nome il nome della figura
	 * @param b base
	 * @param h altezza
	 */
	public Rettangolo(String nome, double b, double h) {
		this.nome=nome;
		this.b = b;
		this.h = h;
	}

	@Override
	public double getPerimetro() {
		return (b+h)*2;
	}

	@Override
	public double getArea() {
		return b*h;
	}
	
	public double getDiagonale() {
		return Math.sqrt(Math.pow(b,2)+h*h);
	}

}
