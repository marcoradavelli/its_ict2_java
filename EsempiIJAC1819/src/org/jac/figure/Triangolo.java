package org.jac.figure;

public class Triangolo extends Figura {
	public double a, b, c;
	
	public Triangolo(String nome, double a, double b, double c) {
		this.nome = nome;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	public double getPerimetro() {
		return a+b+c;
	}
	
	@Override
	public double getArea() {
		double p = getPerimetro()/(double)2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
