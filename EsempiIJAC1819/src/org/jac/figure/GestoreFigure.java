package org.jac.figure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class GestoreFigure {

	public ArrayList<Figura> figure = new ArrayList<>();

	public GestoreFigure() {
		//popola();
		try {
			popolaDaFile();
		} catch (Exception e) {e.printStackTrace();}
		ordinaEStampa();
	}
	
	public void popolaDaFile() throws Exception {
		BufferedReader fin = new BufferedReader(new FileReader("figure.csv"));
		String s = "";
		while ( (s=fin.readLine()) != null) {
			String a = s.split(";")[0]; 
			if (a.equals("Quadrato")) {
				figure.add(new Quadrato(s.split(";")[1], Double.parseDouble(s.split(";")[2])));
			} else if (a.equals("Rettangolo")) {
				
			}
		} fin.close();
	}

	public void ordinaEStampa() {
		// ordinamento con bubble sort (nostro: da NON fare)
		// ordinaBubbleSort(figure);
		// ordinamento con Collections.sort e interfaccia Comparable (da usare)
		Collections.sort(figure);
		System.out.println(figure);
		System.out.println("Stampa solo quelli >20");
		for (Figura f : figure) {
			if ((f instanceof Rettangolo || f instanceof Quadrato) && f.getArea() > 20) {
				System.out.println(f);
			}
		}
	}

	public void popola() {
		figure = new ArrayList<>();
		figure.add(new Triangolo("T1", 1, 2, 3));
		figure.add(new Quadrato("Q1", 5));
		figure.add(new Rettangolo("R1", 4, 6));
		figure.add(new Quadrato("Q2", 1));
		System.out.println(figure);
	}

	public static void ordinaBubbleSort(ArrayList<Figura> figure) {
		for (int i = 0; i < figure.size(); i++) {
			for (int j = i + 1; j < figure.size(); j++) {
				if (figure.get(i).getArea() > figure.get(j).getArea()) {
					Figura temp = figure.get(i);
					figure.set(i, figure.get(j));
					figure.set(j, temp);
				}
			}
		}
	}
}
