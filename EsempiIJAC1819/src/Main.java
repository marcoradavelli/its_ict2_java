public class Main {

	public static void main(String[] args) {
		Matrice m = new Matrice(2,4);
		m.matrix[0][0]='c';
		m.matrix[0][1]='i';
		m.matrix[0][2]='a';
		m.matrix[0][3]='o';
		m.matrix[1][0]='!';

		m.stampaMatrice();
		
		System.out.println(m);
	}

}
