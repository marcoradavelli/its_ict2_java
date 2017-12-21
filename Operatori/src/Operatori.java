
public class Operatori {
	static int a;
	static int b;
	static String s;
	
	public static void verifyPlusPlus() {
		int i=5;
		int a = i++;
		i--;
		int b = ++i;
		System.out.println(a+" "+b+" "+i);
	}
	
	public static void verifyDoubleE() {
		if (s==null && a==b) {
			System.out.println("ok");
		}
		if (s==null || s.equals("pippo")) {
			System.out.println("ok");
		}
		if (s==null | s.equals("pippo")) {
			System.out.println("ok");
		}
	}
	
	public static void main(String[] args) {
		verifyPlusPlus();
	}
	
	
	
	
}
