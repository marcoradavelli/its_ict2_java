
public class Primi {
	
	static final int MAX_N=10;
	
	public Primi() {
		
	}
	
	/**
	 * @param n the number n to check if it is prime
	 * @return if n is a prime number
	 */
	public static boolean isPrime(int n) {
		for (int i=2; i<n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		if (N<0) N=100;
		int v[] = new int[N];
		int count=0;
		for (int i=1; count<N; i++) {
			//v[i]=i+1;
			if (isPrime(i)) v[count++]=i;
		}
		stampaVettore(v);
	}
	
	public static void stampaVettore(int[] v) {
		for (int i=0; i<v.length; i++) {
			System.out.println(v[i]+" ");
		}
		char a = 'a';
	}
}
