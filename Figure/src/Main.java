import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Figura> v = new ArrayList<Figura>();
		
		v.add(new Quadrato(2));
		v.add(new Rettangolo(5,10));
		v.add(new Quadrato(5));
		
		System.out.println(v);
		
		Collections.sort(v);
		
		System.out.println(v);
		
		try {
			writeCSV("output.csv", v);
		} catch (Exception e) {e.printStackTrace();}
	}
	// modo1: CON INTERFCCIA ToCSV
	public static void writeCSV1(String filename, List<Figura> figure) throws IOException {
		PrintWriter fout = new PrintWriter(new FileWriter(filename));
		for (Figura f : figure) {
			fout.println(f.toCSV());
		}
		fout.close();
	}
	// MODO 2: SENZA INTERFCCIA AGGIUNTIVA (da preferire)
	public static void writeCSV2(String filename, List<Figura> figure) throws IOException {
		PrintWriter fout = new PrintWriter(new FileWriter(filename));
		
		for (Figura f : figure) {
			if (f instanceof Quadrato) fout.println("Q;"+((Quadrato)f).base);
			else if (f instanceof Rettangolo) {
				Rettangolo r = (Rettangolo) f;
				fout.println("R;"+r.base+";"+r.altezza);
			}
			// TODO...
		}
		fout.close();
	}
	
}
