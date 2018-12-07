public class Matrice {
	char[][] matrix;
	int numeroRighe;
	int numeroColonne;

	public Matrice(int n, int m) {
		matrix = new char[n][m];
		numeroRighe = n;
		numeroColonne = m;
	}

	public void stampaMatrice() {
		System.out.println(this );
	}
	
	@Override
	public String toString() {
		//int i, j;
		StringBuffer sb = new StringBuffer();
		/*for (i = 0; i < numeroRighe; i++) {
			for (j = 0; j < numeroColonne; j++)
				sb.append(matrix[i][j] + " ");
			sb.append("\n");
		}*/
		for (int i=0; i<numeroRighe*numeroColonne; i++) {
			sb.append(matrix[i/numeroColonne][i%numeroColonne]);
			if (i==numeroColonne-1) {
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}