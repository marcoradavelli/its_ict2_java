package org.jac.figure;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura> figure = new ArrayList<>();
		figure.add(new Triangolo("T1",1,2,3));
		figure.add(new Quadrato("Q1",5));
		figure.add(new Rettangolo("R1",4,6));
		figure.add(new Quadrato("Q2",1));
		System.out.println(figure);
		// ordinamento con bubble sort (nostro: da NON fare)
		//ordinaBubbleSort(figure);
		// ordinamento con Collections.sort e interfaccia Comparable (da usare)
		Collections.sort(figure);
		
		System.out.println(figure);
		
		System.out.println("Stampa solo quelli >20");
		for (Figura f : figure) {
			if ((f instanceof Rettangolo || f instanceof Quadrato) && f.getArea()>20) {
				System.out.println(f);
			}
		}
	}
	
	public static void ordinaBubbleSort(ArrayList<Figura> figure) {
		for (int i=0; i<figure.size(); i++) {
			for (int j=i+1; j<figure.size(); j++) {
				if (figure.get(i).getArea()>figure.get(j).getArea()) {
					Figura temp = figure.get(i);
					figure.set(i, figure.get(j));
					figure.set(j, temp);
				}
			}
		}
	}

}
