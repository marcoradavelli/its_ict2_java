package org.jac.figure;

public class Cerchio extends Figura {
	protected double raggio;

	public Cerchio(String nome, double raggio) {
		this.nome=nome;
		this.raggio = raggio;
	}
	public double getRaggio() {
		return raggio;
	}
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double getPerimetro() {
		return raggio*2*Math.PI;
	}

	@Override
	public double getArea() {
		return Math.PI*raggio*raggio;
	}
	
	
}
