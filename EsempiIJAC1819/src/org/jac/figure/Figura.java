package org.jac.figure;

public abstract class Figura implements Comparable<Figura> {
	protected String nome;
	public abstract double getPerimetro();
	public abstract double getArea();
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+";"+nome
				+";"+getPerimetro()
				+";"+getArea();
	}
	
	@Override
	public int compareTo(Figura f) {
		return f.getArea()>this.getArea() 
			? 1 : 
			(f.getArea()<this.getArea() ? -1 : 0);
	}
}
